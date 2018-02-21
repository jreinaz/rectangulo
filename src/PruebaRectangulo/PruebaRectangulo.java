/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
package PruebaRectangulo;
import rectangulo.Rectangulo;
import java.util.Scanner; 




/**
 *
 * @author ESTUDIANTE
 */
public class PruebaRectangulo {
    
    public static void main(String[] args) {
     Scanner lectura = new Scanner(System.in);
     System.out.println("digite el tamaño de la base");
     double base = lectura.nextDouble();
     System.out.println("digite el tamaño de la altura");
     double altura = lectura.nextDouble();
     
     Rectangulo rectangulo1 = new Rectangulo (base, altura);
     double a1 = rectangulo1.area(base,altura);
     double p1 = rectangulo1.perimetro(base,altura);
    
        System.out.println("el area es: "+a1);
        System.out.println("el perimetro es: "+ p1);
     };
    };










