/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author lucas
 */
/** ===================================================================== **\
 *  A classe CriaControle é o diretor que vai gerenciar os Builders 
 *                              Concretos
\** ===================================================================== **/
public class CriaControle {
    private Builder builder;

    public CriaControle(Builder builder) {
        this.builder = builder;
    }
    
    public ControleTv constroiControle(){
        this.builder.buildPlacaCircuito();
        this.builder.buildBotaoLigar();
        this.builder.buildBotaoDesligar();
        this.builder.buidBotaoCanais();
        this.builder.buildChassis();
        
        return this.builder.getControle();
    }

    @Override
    public String toString() {
        return "CriaControle{" + "builder=" + builder + '}';
    }
    
}
