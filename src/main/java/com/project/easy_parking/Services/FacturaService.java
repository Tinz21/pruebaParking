/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.easy_parking.Services;

import com.project.easy_parking.Models.Factura;
import java.util.List;
/**
 *
 * @author Tin Gun
 */
public interface FacturaService {
    public Factura save(Factura factura);
    public void delete(Integer id);
    public Factura findById(Integer id);
    public List<Factura> findAll();
}
