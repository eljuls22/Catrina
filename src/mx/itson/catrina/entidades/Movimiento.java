/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import java.util.Date;
import mx.itson.catrina.enumerador.Tipo;

/**
 * Entidades de la clase movimiento.
 * @author julio
 */
public class Movimiento {

    private Date fecha;
    private String descripcion;
    private double cantidad;
    private Tipo tipo;

    /** Obtiene la fecha del movimiento
     * @return la fecha del movimiento
     */
    public Date getFecha() {
        return fecha;
    }

    /** La fecha a ingresar del movimiento.
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /** Obtiene la descripción del movimiento
     * @return la descripción del movimiento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /** Ingresa la descripción.
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /** Obtiene la cantidad en efectivo del movimiento
     * @return la cantidad en efectivo
     */
    public double getCantidad() {
        return cantidad;
    }

    /**  Ingresa la cantidad del movimiento
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /** Obtiene el tipo de movimiento, sea retiro o ingreso.
     * @return el tipo del movimiento
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
