/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.easy_parking.Controllers;

import com.project.easy_parking.Dto.FacturaDto;
import com.project.easy_parking.Models.Factura;
import com.project.easy_parking.Models.TipoVehiculo;
import com.project.easy_parking.Models.Plazas;
import com.project.easy_parking.Services.FacturaService;
import com.project.easy_parking.Services.TipoVehiculoService;
import com.project.easy_parking.Services.PlazasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Tin Gun
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/factura")
public class FacturaController {
    
    @Autowired
    private FacturaService facturaservice;
    
    @PostMapping(value="/add")
    public ResponseEntity<FacturaDto> add(@RequestBody FacturaDto factura){
        System.out.println("prendido el servidor");
        System.out.println(factura.toString());
        //FacturaDto obj = facturaservice.save(factura);
        return new ResponseEntity<>(new FacturaDto(), HttpStatus.OK);
    }
    
    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<Factura> delete(@PathVariable Integer id){
        Factura obj = facturaservice.findById(id);
        if(obj!=null){
            facturaservice.delete(id);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }  
    
    @PutMapping(value="/update")
    public ResponseEntity<Factura> update(@RequestBody Factura factura){
        Factura obj = facturaservice.findById(factura.getId());
        if(obj!=null)
        {
            obj.setIngreso(factura.getIngreso());
            obj.setSalida(factura.getSalida());
            obj.setPlaca(factura.getPlaca());
            obj.setPlazas(factura.getPlazas());
            obj.setIngreso(factura.getIngreso());
            obj.setTotal(factura.getTotal());
            facturaservice.save(obj);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/lists")
    public List<Factura> consultarTodo(){
        return facturaservice.findAll();
    }
    
    @GetMapping("/view/{id}")
    public Factura consultaPorId(@PathVariable Integer id){
        return facturaservice.findById(id);
    }
}
