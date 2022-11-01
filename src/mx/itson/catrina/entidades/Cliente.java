/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

/**
 *  Entidades de la clase Cliente.
 * @author julio
 */
public class Cliente {

    private String nombre;
    private String codigo;
    private String domicilio;
    private String ciudad;
    private String rfc;
    private String cp;

    /** Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /** Nombre del cliente ingresado.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Obtiene el código postal del cliente.
     * @return El código postal.
     */
    public String getCodigo() {
        return codigo;
    }

    /** Código postal ingresado
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /** Obtiene el domicilio del cliente
     * @return El domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /** El domicilio ingresado.
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /** Obtiene la ciudad del cliente.
     * @return la ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /** La ciudad ingresada.
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /** El RFC del cliente
     * @return el RFC.
     */
    public String getRfc() {
        return rfc;
    }

    /** El rfc ingresado.
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /** Obtiene el código postal
     * @return el código postal
     */
    public String getCp() {
        return cp;
    }

    /** El código postal ingresado.
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

}
