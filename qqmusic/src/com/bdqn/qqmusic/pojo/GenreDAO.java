package com.bdqn.qqmusic.pojo;

import com.bdqn.qqmusic.DAO.DaseDAO;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Genre
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.bdqn.qqmusic.pojo.Genre
 * @author MyEclipse Persistence Tools
 */

public class GenreDAO extends DaseDAO {
	private static final Logger log = LoggerFactory.getLogger(GenreDAO.class);
	// property constants
	public static final String GGENRE = "ggenre";

	public void save(Genre transientInstance) {
		log.debug("saving Genre instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Genre persistentInstance) {
		log.debug("deleting Genre instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Genre findById(java.lang.Integer id) {
		log.debug("getting Genre instance with id: " + id);
		try {
			Genre instance = (Genre) getSession().get(
					"com.bdqn.qqmusic.pojo.Genre", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Genre instance) {
		log.debug("finding Genre instance by example");
		try {
			List results = getSession()
					.createCriteria("com.bdqn.qqmusic.pojo.Genre")
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
		log.debug("finding Genre instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Genre as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGgenre(Object ggenre) {
		return findByProperty(GGENRE, ggenre);
	}

	public List findAll() {
		log.debug("finding all Genre instances");
		try {
			String queryString = "from Genre";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Genre merge(Genre detachedInstance) {
		log.debug("merging Genre instance");
		try {
			Genre result = (Genre) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Genre instance) {
		log.debug("attaching dirty Genre instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Genre instance) {
		log.debug("attaching clean Genre instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}