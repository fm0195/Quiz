/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorta1;

import java.util.ArrayList;

/**
 *
 * @author fm010
 */
class Cuenta implements Comparable {
  private static int cantidadInstancias;
  private Cliente cte;
  private ArrayList<Movimiento> movimientos;
  private int numero;
  private double saldo;
  
  public Cuenta(double saldop) {
    numero = ++Cuenta.cantidadInstancias;
    movimientos = new ArrayList<>();
    saldo = saldop;
  }
  
  public String toString() {
    String result = new String();
    result += "Cliente: " + cte.toString() + " \n ";
    result += "Numero: " + numero + " \n ";
    result += "Saldo: " + saldo + " \n ";
    result += "Movimientos: \n ";
    for (int i = 0; i < movimientos.size(); i++) {
      result += " " + (i+1) + ". " + movimientos.get(i).toString() + " \n ";
    }
    return result;
  }
  
  public void setCliente(Cliente objetop) {
    cte = objetop;
  }
  
  public String hacerDeposito(double montop) {
    Movimiento nuevoMovimiento = new Movimiento(montop, "Deposito");
    movimientos.add(nuevoMovimiento);
    saldo += montop;
    return "-------Saldo Depositado-------";
  }
  
  public String hacerRetiro(double montop) {
    if (saldo >= montop) {
      Movimiento nuevoMovimiento = new Movimiento(montop, "Deposito");
      saldo -= montop;
      movimientos.add(nuevoMovimiento);
      return "-------Saldo Retirado------";
    } else {
      return "****** NO TIENE FONDOS SUFICIENTES ******";
    }
  }

  @Override
  public boolean menorQue(Comparable otroObjetop) {
    return false;
  }
}
