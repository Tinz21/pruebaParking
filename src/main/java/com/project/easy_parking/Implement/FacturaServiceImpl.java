/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Implement;

import com.project.easy_parking.Dao.FacturaDao;
import com.project.easy_parking.Models.Factura;
import com.project.easy_parking.Services.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Tin Gun
 */
@Service
public class FacturaServiceImpl implements FacturaService{
    @Autowired
    private FacturaDao facturaDao;
    
    /*Crear registro*/
    @Override
    @Transactional(readOnly=false)
    public Factura save(Factura factura){
        return facturaDao.save(factura);
    }
    
    /*Eliminar registro*/
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        facturaDao.deleteById(id);
    }
    
    /*Consultar mediante id*/
    @Override
    @Transactional(readOnly=true)
    public Factura findById(Integer id){
        return facturaDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Factura> findAll(){
        return (List<Factura>) facturaDao.findAll();
    }

}
