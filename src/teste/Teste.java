/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
//import  factory_method.*;
//import prototype.*;
//import singleton.*;
import builder.*;
/**
 *
 * @author lucas
 */
public class Teste {
    public static void main(String[] args) {
    /** ===================================================================== **\
     *                      TESTE FACTORY
     * Animal gato = new FactoryAnimal().fabricaAnimal("cachorro");
    \** ===================================================================== **/
    
    /** ===================================================================== **\
     *                      TESTE PROTOTYPE
     *  Adulto adulto = new Adulto();
     *  Crianca crianca = new Crianca();
     *
     *   System.out.println(adulto.toString());
     *   System.out.println(crianca.toString());
     *   
     *   Adulto adultoPrototype = (Adulto)adulto.clone();
     *   Crianca criancaProtoype = (Crianca)crianca.clone();
     * 
     *   criancaProtoype.setNome("joaquim");
     *   adultoPrototype.setNome("Fernando");
     *   
     *   System.out.println("Adulto: "+adulto.toString());
     *   System.out.println("Crianca: "+crianca.toString());
     *   System.out.println("AdultoPrototype: "+adultoPrototype.toString());
     *   System.out.println("CriancaPrototype: "+criancaProtoype.toString());
    \** ====================================================================== **/
    
    /** ===================================================================== **\
     *                      TESTE SINGLETON
     *   ClasseSingleton singleton = ClasseSingleton.getInstancia();
     *   System.out.println(singleton.getHello());
    \** ===================================================================== **/
    
    /** ===================================================================== **\
     *                      TESTE BUILDER
     *   Builder construtorSony = new BuilderSony();
     *   CriaControle c = new CriaControle(construtorSony);
     *
     *   System.out.println(c.toString());
     *   c.constroiControle();
     *   System.out.println(c.toString());
    \** ===================================================================== **/
    }
}
