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
public class BuilderSony extends Builder{
    private Botao botao;
    private Placa placaSony;
    @Override
    public void buildBotaoLigar() {
        /**operação complexa de construção do elemento (pode ser uma consulta no banco de dados ou algo de grande
        complexidade)*/
        botao = new Botao("Ligar");
        this.controle.setBotaoLigar(botao);
    }

    @Override
    public void buildBotaoDesligar() {
        /**operação complexa de construção do elemento (pode ser uma consulta no banco de dados ou algo de grande
        complexidade)*/
        botao = new Botao("Desligar");
        this.controle.setBotaoDesligar(botao);
    }

    @Override
    public void buildPlacaCircuito() {
        /**operação complexa de construção do elemento (pode ser uma consulta no banco de dados ou algo de grande
        complexidade)*/
        placaSony = new Placa("arquitetura sony");
        this.controle.setPlacaCircuito(placaSony);
    }

    @Override
    public void buildChassis() {
        /**operação complexa de construção do elemento (pode ser uma consulta no banco de dados ou algo de grande
        complexidade)*/
        this.controle.setChassis("plastico escovado");
    }

    @Override
    public void buidBotaoCanais() {
        /**operação complexa de construção do elemento (pode ser uma consulta no banco de dados ou algo de grande
        complexidade)*/
        botao = new Botao("muda canal");
        this.controle.setCanais(botao);
    }
}
