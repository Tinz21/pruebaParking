/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.easy_parking.Services;

import com.project.easy_parking.Models.TipoVehiculo;
import java.util.List;
/**
 *
 * @author Tin Gun
 */
public interface TipoVehiculoService {
    public TipoVehiculo save(TipoVehiculo tipo_vehiculo);
    public void delete(Integer id);
    public TipoVehiculo findById(Integer id);
    public List<TipoVehiculo> findAll();    
}
