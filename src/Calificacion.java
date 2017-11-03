/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author ceduc
 */
public class Calificacion {


     public static void main(String[] args)
          
     {
float nota1, nota2, nota3,promedio = 0;

nota1 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese un nota 1"));
nota2 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese otra nota 2"));
nota3 =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese otra nota 3"));
promedio= (nota1+nota2+nota3)/3;

if (promedio > 4)
{
     JOptionPane.showMessageDialog(null, "Aprobado" ); 
         
     }
else
{
    
    JOptionPane.showMessageDialog(null, "Reprobado");
}
     
      
    
}
    
}
    

