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
    
}
