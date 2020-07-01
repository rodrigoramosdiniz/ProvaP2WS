
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodrigo
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa {
    
     private double peso;
     private double altura;
     private double imc;

    

     public Pessoa(){
         
     }
     
     public Pessoa(double peso, double altura, double imc){
         
         this.peso = peso;
         this.altura = altura;
         this.imc = imc;
         
     }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
