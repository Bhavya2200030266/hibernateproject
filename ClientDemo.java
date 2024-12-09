package com.klef.jfsd.exam.InheritanceMapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Create Hibernate configuration
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Create and persist a generic device
            Device genericDevice = new Device("Generic", "Model X", 199.99);
            session.save(genericDevice);

            // Create and persist a smartphone
            Smartphone smartphone = new Smartphone(
                "Apple", "iPhone 13", 799.99, 
                "iOS", 12
            );
            session.save(smartphone);

            // Create and persist a tablet
            Tablet tablet = new Tablet(
                "Samsung", "Galaxy Tab S7", 649.99, 
                11.0, 8
            );
            session.save(tablet);

            // Commit the transaction
            transaction.commit();

            System.out.println("Devices inserted successfully!");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the session and session factory
            session.close();
            sessionFactory.close();
        }
    }
}

}
