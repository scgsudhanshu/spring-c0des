package com.springORM.springORM.dao;



import java.util.List;
import java.util.Scanner;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springORM.springORM.entities.Provider;

public class ProviderDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public String toString() {
		return "ProviderDao [hibernateTemplate=" + hibernateTemplate + "]";
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Provider provider)
	{
		
		Integer result = (Integer) this.hibernateTemplate.save(provider);
		return result;
	}
	
	public Provider getSingleData(int provider_id)
	{
		Provider provider = this.hibernateTemplate.get(Provider.class, provider_id);
		return provider;
	}
	
	public List<Provider> getAllData()
	{
		List<Provider> providers = this.hibernateTemplate.loadAll(Provider.class);
		return providers;
	}
	
	@Transactional
	public void DeleteProvider(int provider_id)
	{
		Provider provider = this.hibernateTemplate.get(Provider.class, provider_id);
		this.hibernateTemplate.delete(provider);
	}
	
	@Transactional
	public void updateProvider(int provider_id)
	{
		Provider provider = this.hibernateTemplate.get(Provider.class, provider_id);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Provider Name : ");
		String provider_name = sc.nextLine();
		System.out.println("Enter the value of Provider Type : ");
		String provider_type = sc.nextLine();
		
		provider.setProvider_name(provider_name);
		provider.setProvider_type(provider_type);
		this.hibernateTemplate.save(provider);
	}
}
