/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;

/**
 * Entidades de la clase Cuenta
 * @author julio
 */
public class Cuenta {



    private String producto;
    private String cuenta;
    private String clabe;
    private String numeroCuenta;
    private String moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;

    // Método para deserializar el archivo JSON de cuenta.
    public Cuenta deserializar(String json) {
        Cuenta cuenta = new Cuenta();

        try {
            cuenta = new Gson().fromJson(json, Cuenta.class);
        } catch (Exception ex) {
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }
        return cuenta;
    }

    /**  Obtiene el producto
     * @return el producto
     */
    public String getProducto() {
        return producto;
    }

    /** El producto a ingresar.
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /** Obtiene la cuenta.
     * @return la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /** La cuenta a ingresar.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Obtiene la clabe de la cuenta
     * @return la clabe
     */
    public String getClabe() {
        return clabe;
    }

    /** La clabe ingresada
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /** Obtiene el tipo de moneda
     * @return El tipo de moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /** Ingresa el tipo de moneda
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**  Obtiene el cliente
     * @return el cliente de la cuenta
     */
    public Cliente getCliente() {
        return cliente;
    }

    /** Ingresa el cliente de la cuenta
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /** Obtiene el número de cuenta
     * @return El número de la cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /** El número de la cuenta ingresado.
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /** Obtiene la lista con los movimientos
     * @return la lista con los movimientos de la cuenta
     */
    
        public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
