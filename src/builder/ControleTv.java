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
class ControleTv {
    private String chassis;
    private Botao botaoLigar;
    private Botao botaoDesligar;
    private Botao canais;
    private Placa placaCircuito;

    /** ===================================================================== **\
     *                          Getters e Setters
    \** ===================================================================== **/
    
    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Botao getCanais() {
        return canais;
    }

    public void setCanais(Botao canais) {    
        this.canais = canais;
    }

    public Botao getBotaoLigar() {
        return botaoLigar;
    }

    public void setBotaoLigar(Botao botaoLigar) {
        this.botaoLigar = botaoLigar;
    }

    public Botao getBotaoDesligar() {
        return botaoDesligar;
    }

    public void setBotaoDesligar(Botao botaoDesligar) {
        this.botaoDesligar = botaoDesligar;
    }

    public Placa getPlacaCircuito() {
        return placaCircuito;
    }

    public void setPlacaCircuito(Placa placaCircuito) {
        this.placaCircuito = placaCircuito;
    }

    @Override
    public String toString() {
        return "ControleTv{" + "chassis=" + chassis + ", botaoLigar=" + botaoLigar + ", botaoDesligar=" + botaoDesligar + ", canais=" + canais + ", placaCircuito=" + placaCircuito + '}';
    }
    
    
}
