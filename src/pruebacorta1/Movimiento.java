/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorta1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fm010
 */
class Movimiento {
  private static int cantidadInstancias;
  private Date fechaMovimiento;
  private double monto;
  private int numero;
  private String tipo;
  
  public Movimiento(double montop, String tipop){
   numero = ++Movimiento.cantidadInstancias;
   tipo = tipop;
   monto = montop;
   fechaMovimiento = new Date();
  }
  
  @Override
  public String toString() {
    String result = new String();
    result += " Numero: " + numero + " \n ";
    result += " Tipo: " + tipo + " \n ";
    result += " Monto: " + monto + " \n ";
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
    result += "Fecha de Movimiento: "+dateFormat.format(fechaMovimiento)+" \n ";
    return result;
  }
}
