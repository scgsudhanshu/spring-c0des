package com.springORM.springORM;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.springORM.dao.ProviderDao;
import com.springORM.springORM.entities.Provider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springORM/springORM/config.xml");
        ProviderDao providerDao = (ProviderDao) context.getBean("providerDao");
        
        /*    INSERT
        Provider provider = new Provider(1200,"Konark Sharma","Doctor");
        
        int result = providerDao.insert(provider);
        
        System.out.println("Result inserted -> "+result);
        */
        
        // Select One
       /* Provider provider = providerDao.getSingleData(1200);
        System.out.println("provider name = "+provider.getProvider_name());
        System.out.println("provider id = "+provider.getProvider_id());
        System.out.println("provider type = "+provider.getProvider_type());
        */
        
        // Select All
//        
//        List<Provider> providers = providerDao.getAllData();
//        
//        for(Provider provider : providers)
//        {
//	        System.out.println("provider name = "+provider.getProvider_name());
//	        System.out.println("provider id = "+provider.getProvider_id());
//	        System.out.println("provider type = "+provider.getProvider_type());
//	        System.out.println("__________________________");
//        }
//        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id to be updated");
        int id = sc.nextInt();
        //UPDATE
        //providerDao.DeleteProvider(id);
        providerDao.updateProvider(id);
        System.out.println(id+" updated");
        
    }
}
