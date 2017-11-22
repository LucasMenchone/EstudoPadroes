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
public abstract class Builder {
    protected ControleTv controle;
    
    public abstract void buildBotaoLigar();
    public abstract void buildBotaoDesligar();
    public abstract void buildPlacaCircuito();
    public abstract void buildChassis();
    public abstract void buidBotaoCanais();
    
    public ControleTv getControle(){
        return this.controle;
    }
    
    public Builder(){
        this.controle = new ControleTv();
    }

    @Override
    public String toString() {
        return "Builder{" + "controle=" + controle + '}';
    }
}
