/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import org.hibernate.annotations.Entity;

/**
 *
 * @author Tin Gun
 */

@Entity
@Table(name="factura")
public class Factura implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @ManyToOne()
    @JoinColumn(name="tipoid", referencedColumnName = "id")
    private TipoVehiculo tipo;
    
    @ManyToOne()
    @JoinColumn(name="id_plazas")
    private Plazas plazas;
    
    @Column(name="ingreso")
    private Date ingreso;
    
    @Column(name="placa")
    private String placa;
    
    @Column(name="salida")
    private Date salida;
    
    @Column(name="total")
    private double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Plazas getPlazas() {
        return plazas;
    }

    public void setPlazas(Plazas plazas) {
        this.plazas = plazas;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", tipo=" + tipo + ", plazas=" + plazas + ", ingreso=" + ingreso + ", placa=" + placa + ", salida=" + salida + ", total=" + total + '}';
    }
    
    
}
