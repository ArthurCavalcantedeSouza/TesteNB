/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.applicationcalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author arthur.csouza3
 */
public class ApplicationCalculadora {

    public static void main(String[] args) {
    Object [] escolha = {"soma", "subtração", "multiplicação", "divisão"};
    JOptionPane.showOptionDialog(null, "Qual operação você quer fazer?", "curso", 1, 3, null, escolha,
            null);
    String num1 = JOptionPane.showInputDialog(null, "digite um número inteiro", "Calculadora", 3);
    String num2 = JOptionPane.showInputDialog(null, "digite um número inteiro", "Calculadora", 3);
   int iN1 = Integer.parseInt(num1);
        int iN2 = Integer.parseInt(num2);
        int resultado = 0;
        
        if(escolha == escolha[0]){
            resultado = iN1 + iN2;
        } else { 
        }
        if (escolha == escolha[1]){ 
          resultado = iN1 - iN2;           
       } 
        else if (escolha == escolha[2]){ 
           resultado = iN1 * iN2;            
       } 
        else if (escolha == escolha[3]){ 
           if (iN2 != 0) {
           resultado = iN1 / iN2;
           }
        }    
           else {
           }
        JOptionPane.showMessageDialog(null, "O escolha é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
