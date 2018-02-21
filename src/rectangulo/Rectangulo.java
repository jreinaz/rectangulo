/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;
import PruebaRectangulo.PruebaRectangulo;
/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo {

 private double base;
 private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;       
    };

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  
 public double perimetro (double base, double altura){
 return  2*(base + altura);
 };
 
 public double area (double base, double altura){
 return base * altura;
 };
 

 
    
}
