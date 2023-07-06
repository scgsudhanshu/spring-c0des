package com.springpractice.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springpractice.jdbc.dao.SeatDaoImpl;
import com.springpractice.jdbc.entities.Seat;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springpractice/jdbc/config.xml");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfigAW.class);
        //JdbcTemplate jdbctemp = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        //String query = "insert into voting_seatdetails(SeatName, State, Current_MLA, Current_MP) values (?,?,?,?)";
        
        SeatDaoImpl seatimp = (SeatDaoImpl) context.getBean("seatImpl");
        
        
        Seat seat = new Seat();
        
        seat.setSeatName("AshokNagar");
        //seat.setState("Delhi");
        //seat.setCurrent_MLA("Keshav Parashar");
        //seat.setCurrent_MP("Shobhit Kumar");
        //int result = seatimp.insert(seat);
        
        //update
        //int result = seatimp.update(seat);
        
        //delete
        //int result = seatimp.delete(seat);
        
        //select for single row
        /*Seat outputseat = seatimp.getSeat("AshokNagar");
        System.out.println(outputseat);
        */
        
        //Multiple Seats Select 
        List<Seat> seats = seatimp.getMultipleSeat();
        for(Seat seat_:seats)
        {
        	System.out.println(seat_);
        }
    }
}
