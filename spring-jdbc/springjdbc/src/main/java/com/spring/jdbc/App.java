package com.spring.jdbc;

//import com.spring.jdbc.dao.*;
import com.spring.jdbc.entities.Seat;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.SeatDaoImpl;
import com.spring.jdbc.dao.SeatDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Spring JDBC" );
        // using Spring JDBC
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); 
       // JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //using insert query
        
        //String query = "insert into voting_seatdetails values (?,?,?,?,?)";
        
        // fire query
        //int result = template.update(query,17,"RamNagar","Delhi","Deepak Ruhela","Lokesh Giri");
        
        SeatDao seatDao = context.getBean("seatDao",SeatDao.class);
       // Seat seat = new Seat();
       /*
        seat.setId(19);
        seat.setSeatName("West Vinod Nagar");
        seat.setState("Delhi");
        seat.setCurrent_MLA("Aditya Garg");
        seat.setCurrent_MP("Pranshu Panwar");
        */
       // int result = seatDao.insert(seat);
        /*
        seat.setSeatName("Gokulpuri");
        seat.setCurrent_MLA("Rahul Sisodiya");
        seat.setCurrent_MP("Akshit Ahuja");
        int result = seatDao.change(seat);
        */
        /*
        seat.setSeatName("Nandnagri");
        int result = seatDao.delete(seat);
        */
        // selecting the data
        try 
        {
        	//SeatDao seatDaoo = new SeatDaoImpl();
        	//Seat seat = seatDao.getSeat("Gokulpuri");
        	//System.out.println("Seat >>> " + seat);
        	List<Seat> seats = seatDao.getAllSeats();
        	for(Seat s:seats)
        	{
        		System.out.println("s:"+s);
        	}
        	
        }
        catch(Exception e)
        {
        	System.out.println("exception >>>>>>>>" +e);
        }
       // System.out.println("Result ... "+result);
        
    }
}
