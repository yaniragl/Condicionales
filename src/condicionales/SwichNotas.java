/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
 import javax.swing.JOptionPane;
import java.lang.Math;//paquete para funciones Matematicas
/**
 *
 * @author ceduc
 */
public class SwichNotas 
{
  public static void main (String [] args)
  {
    float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota"));
    //El metodo round es para redondear un decimal
    switch(Math.round(nota))
    {
        case 7://Caso 1 -si el valor es 7
        JOptionPane.showInputDialog(null,"Notable");    
      break;
        case 6://Caso 1 -si el valor es 6
        JOptionPane.showInputDialog(null,"Bien");    
      break;
      case 5://Caso 1 -si el valor es 5
        JOptionPane.showInputDialog(null,"Suficiente");    
      break;
      case 4://Caso 1 -si el valor es 4
        JOptionPane.showInputDialog(null,"Suficiente");    
      break;
      default:
          JOptionPane.showInputDialog(null,"Insuficiente"); 
       break;
    }
  }
}
