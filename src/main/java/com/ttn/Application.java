package com.ttn;

import com.ttn.domain.Address;
import com.ttn.domain.Book;
import com.ttn.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args){
        System.out.println("hiii");

        SessionFactory sessionFactory = new Configuration(  ).configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Book book1 = new Book();
        book1.setId(1);
        book1.setIsdn("abc");
        book1.setName("maths");

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("science");
        book2.setIsdn("def");

        Address address = new Address();
        address.setId(1);
        address.setPin(10031);
        address.setStreet("Geeta Colony");

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Diksha");
        student.setLastName("Ahuja");
        student.setAddress(address);
        student.getBooks().add(book1);
        student.getBooks().add(book2);

        session.save(book1);
        session.save(book2);
        session.save(address);
        session.save(student);

        session.getTransaction().commit();
        session.close();
    }
}
