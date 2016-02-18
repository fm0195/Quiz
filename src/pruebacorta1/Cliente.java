/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorta1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author fm010
 */
public abstract class Cliente {
  private static int CantidadInstancias;
  private int codigo;
  private ArrayList<Cuenta> ctas;
  private Date fechaRegistro;
  
  public Cliente() {}
  
  @Override
  public String toString() {
    return null;
  }
}
