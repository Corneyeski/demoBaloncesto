package com.examplesping.domain;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Alan on 10/10/2016.
 */
@Entity
public class Jugadores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private LocalDate nacimiento;
    private int canasto;
    private int asisto;
    private int reboto;
    private String posicion;

    public Jugadores(String nombre, LocalDate nacimiento, int canasto, int asisto, int reboto, String posicion) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.canasto = canasto;
        this.asisto = asisto;
        this.reboto = reboto;
        this.posicion = posicion;
    }

    public Jugadores(){}

    public void setId(long id) { this.id = id;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setCanasto(int canasto) {
        this.canasto = canasto;
    }

    public void setAsisto(int asisto) {
        this.asisto = asisto;
    }

    public void setReboto(int reboto) {
        this.reboto = reboto;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public int getCanasto() {
        return canasto;
    }

    public int getAsisto() {
        return asisto;
    }

    public int getReboto() {
        return reboto;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                ", canasto=" + canasto +
                ", asisto=" + asisto +
                ", reboto=" + reboto +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
