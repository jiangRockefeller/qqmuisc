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
 * A data access object (DAO) providing persistence and search support for
 * Nation entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.bdqn.qqmusic.pojo.Nation
 * @author MyEclipse Persistence Tools
 */

public class NationDAO extends DaseDAO {
	private static final Logger log = LoggerFactory.getLogger(NationDAO.class);
	// property constants
	public static final String NNATION = "nnation";
	public static final String NCLASS = "nclass";

	public void save(Nation transientInstance) {			//保存	finish
		log.debug("saving Nation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Nation persistentInstance) {			//删除	finish
		log.debug("deleting Nation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Nation findById(java.lang.Integer id) {			//用Id查询	finish
		log.debug("getting Nation instance with id: " + id);
		try {
			Nation instance = (Nation) getSession().get(
					"com.bdqn.qqmusic.pojo.Nation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Nation instance) {			//查询	finish
		log.debug("finding Nation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.bdqn.qqmusic.pojo.Nation")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {			//使用属性+属性内容查询 	finish
		log.debug("finding Nation instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Nation as model where model."
					+ propertyName + "= ?";

			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);

			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	//Object=String？
	public List<Nation> findByNnation(Object nnation) {				//使用nnation属性查询，不能用其他属性查询	finish
		return findByProperty(NNATION, nnation);
	}

	public List<Nation> findByNclass(Object nclass) {				//使用Nclass属性查询，不能用其他属性查询	finish
		return findByProperty(NCLASS, nclass);
	}

	public List findAll() {										//	查询所有	finish
		log.debug("finding all Nation instances");
		try {
			String queryString = "from Nation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Nation merge(Nation detachedInstance) {				//增加或修改	finish
		log.debug("merging Nation instance");
		try {
			Nation result = (Nation) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Nation instance) {
		log.debug("attaching dirty Nation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Nation instance) {
		log.debug("attaching clean Nation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}