package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Modell.Felhasznalo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a nevét!");
        String nev=sc.nextLine();
        System.out.println("Adja meg a jelszót!");
        String pass=sc.nextLine();
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("my-fa");
        EntityManager manager=factory.createEntityManager();
        manager.getTransaction().begin();
        Felhasznalo felhasznalo=new Felhasznalo();
        felhasznalo.setNev(nev);
        felhasznalo.setJelszo(pass);
        manager.persist(felhasznalo);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
}
