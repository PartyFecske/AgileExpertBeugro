package org.example.agilexpert.Modell;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class HatterKep {
    @Id
    @GeneratedValue
    private String id;
    private String nev;
    private String path;
    @OneToMany
    private List<Felhasznalo> felhasznalos;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
