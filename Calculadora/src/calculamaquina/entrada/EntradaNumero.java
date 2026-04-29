/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrada;

import java.util.Scanner;

/**
 *
 * @author info226
 */
public class EntradaNumero {
    public int x;
    
    public int y;
    
    public void pedirNumeros(){
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Digite o primeiro valor: ");
        x = sc.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        y = sc.nextInt();
    }
    
}
 
  
  
  
