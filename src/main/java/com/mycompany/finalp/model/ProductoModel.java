/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalp.model;

/**
 *
 * @author LENOVO
 */
public class ProductoModel {
     private String nombre;
     private Integer cantidad;
     private String descripcion;
     private Double precio;

    public ProductoModel() {
    }

    public ProductoModel(String nombre, Integer cantidad, String descripcion, Double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoModel{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    

    
     
}
