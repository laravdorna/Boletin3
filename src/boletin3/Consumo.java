/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;



/**
 *
 * @author lvazquezdorna
 */
public class Consumo {

    //ATRIBUTOS
    private float km, litros, vMedia, pGas;

    //CONSTRUCTORES
    public Consumo() {
    }

    public Consumo(float km, float litros, float vMedia, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMedia = vMedia;
        this.pGas = pGas;
    }

    //METODOS DE ACCESO
    public void setKm(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMedia(float vMedia) {
        this.vMedia = vMedia;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }

    public float getTempo() {

        return this.km / vMedia;
    }

    public float getvMedia() {
        return vMedia;
    }
    
    

    //METODOS DE CALCULO
    public float consumoMedio() {
     //litros por cada 100km
     
     return this.litros*(this.km/100);

    }

    public float consumoEuros() {
    //euros por cada 100km
   
     //return this.pGas*litros*(this.km/100);
     return this.pGas*this.consumoEuros();
        
    }

}
