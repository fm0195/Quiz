/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorta1;

/**
 *
 * @author fm010
 */
public class Fisico extends Cliente {
  private String apellido1;
  private String apellido2;
  private String nombre;
  
  public Fisico(String apellido1p, String apellido2p, String nombrep){
    super();
    apellido1 = apellido1p;
    apellido2 = apellido2p;
    nombre = nombrep;
  }
  
  public String toString() {
    String result = super.toString();
    result += "Nombre: " + nombre + " " + apellido1 + " " + apellido2 + " \n ";
    return result;
  }

  @Override
  public boolean menorQue(Comparable otroObjetop) {
    return false;
  }
}
