package org.example.Modell;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ikon {
    @Id
    @GeneratedValue
    private Long id;
    private String nev;
    private String path;
    @ManyToMany
    private List <Felhasznalo> felhasznalo;

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

    public List<Felhasznalo> getFelhasznalo() {
        return felhasznalo;
    }

    public void setFelhasznalo(List<Felhasznalo> felhasznalo) {
        this.felhasznalo = felhasznalo;
    }
}
