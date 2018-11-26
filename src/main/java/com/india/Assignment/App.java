package com.india.Assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nisum.entity.Employee;
import com.nisum.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Employee e=new Employee();
		e.setId(111);
		e.setName("sallu");
		e.setSal((float) 12000.0);
		session.save(e);
		session.getTransaction().commit();
        
        
    }
}
