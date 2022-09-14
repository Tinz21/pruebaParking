/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Implement;

import com.project.easy_parking.Dao.TipoVehiculoDao;
import com.project.easy_parking.Models.TipoVehiculo;
import com.project.easy_parking.Services.TipoVehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Tin Gun
 */

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{
    @Autowired
    private TipoVehiculoDao tipoVehiculoDao;
    
    /*Crear registro*/
    @Override
    @Transactional(readOnly=false)
    public TipoVehiculo save(TipoVehiculo tipo_vehiculo){
        return tipoVehiculoDao.save(tipo_vehiculo);
    }
    
    /*Eliminar registro*/
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        tipoVehiculoDao.deleteById(id);
    }
    
    /*Consultar mediante id*/
    @Override
    @Transactional(readOnly=true)
    public TipoVehiculo findById(Integer id){
        return tipoVehiculoDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<TipoVehiculo> findAll(){
        return (List<TipoVehiculo>) tipoVehiculoDao.findAll();
    }
}
