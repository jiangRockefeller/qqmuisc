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
 * Artist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.bdqn.qqmusic.pojo.Artist
 * @author MyEclipse Persistence Tools
 */

public class ArtistDAO extends DaseDAO {
	private static final Logger log = LoggerFactory.getLogger(ArtistDAO.class);
	// property constants
	public static final String ANAME = "aname";
	public static final String AGRADUATION = "agraduation";
	public static final String ANATIONALITY = "anationality";
	public static final String ABIRTHPLACE = "abirthplace";
	public static final String APROFESSION = "aprofession";
	public static final String AHEIGHT = "aheight";
	public static final String AWEIGHT = "aweight";
	public static final String ABLOODTYPE = "abloodtype";
	public static final String AACHIEVEMENT = "aachievement";
	public static final String AINTERESTS = "ainterests";
	public static final String APICPATH = "apicpath";
	public static final String ATYPE = "atype";

	public void save(Artist transientInstance) {
		log.debug("saving Artist instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Artist persistentInstance) {
		log.debug("deleting Artist instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Artist findById(java.lang.Integer id) {
		log.debug("getting Artist instance with id: " + id);
		try {
			Artist instance = (Artist) getSession().get(
					"com.bdqn.qqmusic.pojo.Artist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Artist instance) {
		log.debug("finding Artist instance by example");
		try {
			List results = getSession()
					.createCriteria("com.bdqn.qqmusic.pojo.Artist")
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
		log.debug("finding Artist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Artist as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAname(Object aname) {
		return findByProperty(ANAME, aname);
	}

	public List findByAgraduation(Object agraduation) {
		return findByProperty(AGRADUATION, agraduation);
	}

	public List findByAnationality(Object anationality) {
		return findByProperty(ANATIONALITY, anationality);
	}

	public List findByAbirthplace(Object abirthplace) {
		return findByProperty(ABIRTHPLACE, abirthplace);
	}

	public List findByAprofession(Object aprofession) {
		return findByProperty(APROFESSION, aprofession);
	}

	public List findByAheight(Object aheight) {
		return findByProperty(AHEIGHT, aheight);
	}

	public List findByAweight(Object aweight) {
		return findByProperty(AWEIGHT, aweight);
	}

	public List findByAbloodtype(Object abloodtype) {
		return findByProperty(ABLOODTYPE, abloodtype);
	}

	public List findByAachievement(Object aachievement) {
		return findByProperty(AACHIEVEMENT, aachievement);
	}

	public List findByAinterests(Object ainterests) {
		return findByProperty(AINTERESTS, ainterests);
	}

	public List findByApicpath(Object apicpath) {
		return findByProperty(APICPATH, apicpath);
	}

	public List findByAtype(Object atype) {
		return findByProperty(ATYPE, atype);
	}

	public List findAll() {
		log.debug("finding all Artist instances");
		try {
			String queryString = "from Artist";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Artist merge(Artist detachedInstance) {
		log.debug("merging Artist instance");
		try {
			Artist result = (Artist) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Artist instance) {
		log.debug("attaching dirty Artist instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Artist instance) {
		log.debug("attaching clean Artist instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}