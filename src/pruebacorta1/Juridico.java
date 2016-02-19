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
public class Juridico extends Cliente {
  private String razonSocial;
  private String tipoNegocio;

  public Juridico(String razonSocialp, String tipoNegociop) {
    super();
    razonSocial = razonSocialp;
    tipoNegocio = tipoNegociop;
  }

  public String toString() {
    String result = super.toString();
    result += "Razon Social: " + razonSocial + " \n ";
    result += "Tipo de Negocio: " + tipoNegocio + " \n ";
    return result;
  }

  @Override
  public boolean menorQue(Comparable otroObjetop) {
    return false;
  }
}
