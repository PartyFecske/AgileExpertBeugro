package org.example.Modell;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Felhasznalo {
    @Id
    @GeneratedValue
    private Long id;

    private String nev;
    private String jelszo;
    @ManyToMany
    private List<Ikon> ikon;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getJelszo() {
        return jelszo;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }
    public List<Ikon> getIkon() {
        return ikon;
    }
    public void setIkon(List<Ikon> ikon) {
        this.ikon = ikon;
    }
}
