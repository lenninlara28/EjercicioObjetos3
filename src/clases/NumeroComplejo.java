/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author hp 14
 */
public class NumeroComplejo {
    private int numero_real;
    private int numero_imaginario;
    
    public NumeroComplejo(int real,int imaginario){
        this.numero_real=real;
        this.numero_imaginario=imaginario;
        
    }
    

    public int getNumero_real() {
        return numero_real;
    }

    public void setNumero_real(int numero_real) {
        this.numero_real = numero_real;
    }

    public int getNumero_imaginario() {
        return numero_imaginario;
    }

    public void setNumero_imaginario(int numero_imaginario) {
        this.numero_imaginario = numero_imaginario;
    }
    
    public  NumeroComplejo Suma(NumeroComplejo c2){
        NumeroComplejo c;
        int num_real,num_imaginario;
        num_real=this.getNumero_real() + c2.getNumero_real();
        num_imaginario=this.getNumero_imaginario() + c2.getNumero_imaginario();
        
       c= new NumeroComplejo(num_real, num_imaginario);
       return c;
    }
    public NumeroComplejo Resta(NumeroComplejo c2){
        NumeroComplejo c;
        int num_real,num_imaginario;
        num_real=this.getNumero_real()- c2.getNumero_real();
        num_imaginario=this.getNumero_imaginario() - c2.getNumero_imaginario();
        
       c= new NumeroComplejo(num_real, num_imaginario);
       return c;
    }
    public NumeroComplejo Multiplicacion(NumeroComplejo c2){
        NumeroComplejo c;
        int num_real,num_imaginario,comutativo_real1,comutativo_real2,comutativo_imaginario1,comutativo_imaginario2;
        comutativo_real1=this.getNumero_real()*c2.getNumero_real() ;
        comutativo_real2=this.getNumero_real()*(-c2.getNumero_imaginario());
        comutativo_imaginario1=this.getNumero_imaginario()*c2.getNumero_real();
        comutativo_imaginario2=this.getNumero_imaginario()*c2.getNumero_imaginario();
        num_imaginario=comutativo_real2 + comutativo_imaginario1;
        num_real= comutativo_real1 + comutativo_imaginario2;
        
        c =new  NumeroComplejo(num_real,num_imaginario); 
        return c;
    }

    public NumeroComplejo Dividir (NumeroComplejo c2) {
        NumeroComplejo c;
        int aux1,aux2,aux3;
        aux1=c2.getNumero_real()*c2.getNumero_real() + c2.getNumero_imaginario()*c2.getNumero_imaginario();
        aux2=(this.getNumero_real()*c2.getNumero_real()+this.getNumero_imaginario()*c2.getNumero_imaginario());
        aux3=(this.getNumero_imaginario()*c2.getNumero_real()-this.getNumero_real()*c2.getNumero_imaginario());
        
        c=new NumeroComplejo(aux2, aux3);
        return c;
    } 
    
}
