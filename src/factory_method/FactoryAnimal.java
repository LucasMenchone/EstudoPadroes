/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method;

/**
 *
 * @author lucas
 */
public class FactoryAnimal{

    public static Animal fabricaAnimal(String animal) {
        if(animal.equals("cachorro")){
            return new Cachorro();
        } else {
            if(animal.equals("gato")){
                return new Gato();
            }
        }
        return null;
    }    
}
