package com.springORM.springORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springORM.springORM.entities.Provider;

public class DoctorDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Provider provider)
	{
		
		Integer result = (Integer) this.hibernateTemplate.save(provider);
		return result;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
