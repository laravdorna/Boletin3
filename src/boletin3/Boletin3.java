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
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a)Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
        Consumo consumo1= new Consumo();
        
        //b)Dalle a litros o valor 50 e a prezo da gasolina 1.57
        consumo1.setLitros(50);
        consumo1.setpGas((float) 1.57);
        
        //c)Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
        
        Consumo consumo2= new Consumo(75, 25, 100, (float) 1.40);
        
        //d) Visualiza, a  través do 2º obxecto, o consumo medio
        
        System.out.println("Consumo medio del viaje 2 es "+consumo2.consumoMedio());
        
        //e)Varia o valor dos litros consumidos do 2º obxecto.
        
         consumo2.setLitros(50);
         
         //f)Visualiza a velocidade media do 2º obxecto
         
         System.out.println("la velocidad media del viaje 2 es "+consumo2.getvMedia());
    }
    
}
