/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.easy_parking.Dao;

import com.project.easy_parking.Models.TipoVehiculo;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Tin Gun
 */
public interface TipoVehiculoDao extends
        CrudRepository<TipoVehiculo,Integer>{
    
}
