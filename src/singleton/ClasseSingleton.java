/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author lucas
 */
public class ClasseSingleton {

    private static ClasseSingleton instancia;
    private static String hello = "hello world!";

    private ClasseSingleton() {

    }

    public String getHello() {
        return hello;
    }
    
    public static ClasseSingleton getInstancia() {
        if (instancia!= null) {
            return instancia;
        } else {
            instancia = new ClasseSingleton();
            return instancia;
        }        
    }
}
