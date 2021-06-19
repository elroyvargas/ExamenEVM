/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evm;

import static pe.edu.upeu.evm.examen.ResolucionExamen.pregunta2;
import static pe.edu.upeu.evm.examen.ResolucionExamen.pregunta3;
import static pe.edu.upeu.evm.examen.ResolucionExamen.pregunta4;
import static pe.edu.upeu.evm.examen.ResolucionExamen.pregunta5;
import pe.edu.upeu.evm.utils.LeerTeclado;

/**
 *
 * @author USUARIO
 */
public class App {
        static LeerTeclado teclado = new LeerTeclado();

    public static void main(String arg[]){
        
       // pregunta3();
      
        //pregunta2();
        //pregunta4();
        //pregunta5();
        
        System.out.println("ingrese 2 para verporcentaje de pagos");
        System.out.println("ingrese 3 para ver tabla de multiplicacion");
        System.out.println("ingrese 4 para  ver  numeros perfectos");
        System.out.println("ingrese 5 para ver exponente recursivo");
        
        int pregunta=teclado.leer(0, "ingrese la opcion deseada");
                switch (pregunta) {
                    case 2:{
                        pregunta2();
                        
                    }break;
                    case 3:{
                        pregunta3();
                    }break;
                    case 4:{
                        pregunta4();
                    }break;
                    case 5:{
                        pregunta5();
                    }break;
                    default:{
                        System.out.println("Esta opcion no esta disponible");
                    }
                     
                    
                    
                    
                }

    }
    }
    

