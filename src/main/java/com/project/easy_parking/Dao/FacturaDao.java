package com.project.easy_parking.Dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import com.project.easy_parking.Models.Factura;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Tin Gun
 */
public interface FacturaDao extends
        CrudRepository<Factura,Integer>{
    
}
