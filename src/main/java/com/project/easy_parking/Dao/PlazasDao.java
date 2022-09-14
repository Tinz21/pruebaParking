package com.project.easy_parking.Dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import com.project.easy_parking.Models.Plazas;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Tin Gun
 */
public interface PlazasDao extends
        CrudRepository<Plazas,String>{
    
}
