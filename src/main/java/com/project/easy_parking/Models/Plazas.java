/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.hibernate.annotations.Entity;
/**
 *
 * @author Tin Gun
 */
@Entity
@Table(name="plazas")
public class Plazas implements Serializable {
    @Id
    @Column(name="id_plazas")
    private String id_plazas;
    
    @Column(name="estado")
    private boolean estado;

    public String getId_plazas() {
        return id_plazas;
    }

    public void setId_plazas(String id_plazas) {
        this.id_plazas = id_plazas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
