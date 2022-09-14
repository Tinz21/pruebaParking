/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Implement;

import com.project.easy_parking.Dao.PlazasDao;
import com.project.easy_parking.Models.Plazas;
import com.project.easy_parking.Services.PlazasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Tin Gun
 */
@Service
public class PlazasServiceImpl implements PlazasService{
    @Autowired
    private PlazasDao plazasDao;
    
    /*Crear registro*/
    @Override
    @Transactional(readOnly=false)
    public Plazas save(Plazas plazas){
        return plazasDao.save(plazas);
    }
    
    /*Eliminar registro*/
    @Override
    @Transactional(readOnly=false)
    public void delete(String id_plazas){
        plazasDao.deleteById(id_plazas);
    }
    
    /*Consultar mediante id*/
    @Override
    @Transactional(readOnly=true)
    public Plazas findById(String id_plazas){
        return plazasDao.findById(id_plazas).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Plazas> findAll(){
        return (List<Plazas>) plazasDao.findAll();
    }
}
