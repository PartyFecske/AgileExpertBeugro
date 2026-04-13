package org.example.agilexpert;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.agilexpert.Modell.Felhasznalo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;

@SpringBootApplication
public class AgileXpertApplication {

    public static void main(String[] args) {

        SpringApplication.run(AgileXpertApplication.class, args);
        String felh;
        String jelsz;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adja meg a felhasználó nevét: ");
        felh=scanner.nextLine();
        System.out.println("Adja meg a jelszavát: ");
        jelsz=scanner.nextLine();
        Felhasznalo felhasznalo=new Felhasznalo();
        felhasznalo.setNev(felh);
        felhasznalo.setJelszo(jelsz);

    }

}
