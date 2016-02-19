/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorta1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author fm010
 */
public abstract class Cliente implements Comparable{
  private static int cantidadInstancias;
  private int codigo;
  private ArrayList<Cuenta> ctas;
  private Date fechaRegistro;
  
  public Cliente() {
    codigo = ++Cliente.cantidadInstancias;
    fechaRegistro = new Date();
    ctas = new ArrayList<>();
  }
  
  @Override
  public String toString() {
    String result = new String();
    result += " Codigo: "+codigo+" \n ";
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
    result += "Fecha de Registro: "+dateFormat.format(fechaRegistro)+" \n ";
    return result;
  }

  public int getCodigo() {
    return codigo;
  }

  public ArrayList<Cuenta> getCtas() {
    return ctas;
  }

  public Date getFechaRegistro() {
    return fechaRegistro;
  }
}
