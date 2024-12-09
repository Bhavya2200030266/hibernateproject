package com.klef.jfsd.exam.InheritanceMapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
     
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

     
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
           
            Device genericDevice = new Device("Generic", "Model X", 199.99);
            session.save(genericDevice);

                Smartphone smartphone = new Smartphone(
                "Apple", "iPhone 13", 799.99, 
                "iOS", 12
            );
            session.save(smartphone);

            Tablet tablet = new Tablet(
                "Samsung", "Galaxy Tab S7", 649.99, 
                11.0, 8
            );
            session.save(tablet);

       
            transaction.commit();

            System.out.println("Devices inserted successfully!");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
         
            session.close();
            sessionFactory.close();
        }
    }
}


      
