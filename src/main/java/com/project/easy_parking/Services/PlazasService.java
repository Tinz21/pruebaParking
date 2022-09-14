/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.easy_parking.Services;

import com.project.easy_parking.Models.Plazas;
import java.util.List;
/**
 *
 * @author Tin Gun
 */
public interface PlazasService {
    public Plazas save(Plazas plazas);
    public void delete(String id_plazas);
    public Plazas findById(String id_plazas);
    public List<Plazas> findAll();
}
