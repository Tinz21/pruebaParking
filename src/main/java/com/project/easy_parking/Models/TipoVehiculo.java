/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.hibernate.annotations.Entity;
/**
 *
 * @author Tin Gun
 */
@Entity
@Table(name="tipo_vehiculo")
public class TipoVehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="tipo")
    private String tipo;
    
    @Column(name="precio_hora")
    private float precio_hora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String isTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float isPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(float precio_hora) {
        this.precio_hora = precio_hora;
    }
}
