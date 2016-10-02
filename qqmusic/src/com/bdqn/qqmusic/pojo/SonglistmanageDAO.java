package com.bdqn.qqmusic.pojo;

import com.bdqn.qqmusic.DAO.DaseDAO;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Songlistmanage entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.bdqn.qqmusic.pojo.Songlistmanage
 * @author MyEclipse Persistence Tools
 */

public class SonglistmanageDAO extends DaseDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SonglistmanageDAO.class);
	// property constants
	public static final String SMNAME = "smname";
	public static final String SMCALLCOUNT = "smcallcount";
	public static final String SMCOVERPATH = "smcoverpath";

	public void save(Songlistmanage transientInstance) {
		log.debug("saving Songlistmanage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Songlistmanage persistentInstance) {
		log.debug("deleting Songlistmanage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Songlistmanage findById(java.lang.Integer id) {
		log.debug("getting Songlistmanage instance with id: " + id);
		try {
			Songlistmanage instance = (Songlistmanage) getSession().get(
					"com.bdqn.qqmusic.pojo.Songlistmanage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Songlistmanage instance) {
		log.debug("finding Songlistmanage instance by example");
		try {
			List results = getSession()
					.createCriteria("com.bdqn.qqmusic.pojo.Songlistmanage")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Songlistmanage instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Songlistmanage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySmname(Object smname) {
		return findByProperty(SMNAME, smname);
	}

	public List findBySmcallcount(Object smcallcount) {
		return findByProperty(SMCALLCOUNT, smcallcount);
	}

	public List findBySmcoverpath(Object smcoverpath) {
		return findByProperty(SMCOVERPATH, smcoverpath);
	}

	public List findAll() {
		log.debug("finding all Songlistmanage instances");
		try {
			String queryString = "from Songlistmanage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Songlistmanage merge(Songlistmanage detachedInstance) {
		log.debug("merging Songlistmanage instance");
		try {
			Songlistmanage result = (Songlistmanage) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Songlistmanage instance) {
		log.debug("attaching dirty Songlistmanage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Songlistmanage instance) {
		log.debug("attaching clean Songlistmanage instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}