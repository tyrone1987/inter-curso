/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.services;

import ec.com.internacional.modelos.Cuenta;
import javax.ejb.Stateless;

/**
 *
 * @author Tyrone Lopez
 */
@Stateless
public class CuentasServices {

    public boolean validarCuenta(Cuenta cuenta) {
        return true;
    }

    public boolean validarPermiso(String nombre) {
        return !nombre.startsWith("A");
    }

}
