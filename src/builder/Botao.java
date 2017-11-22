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
class Botao {
    String acaoBotao;

    public Botao(String acaoBotao) {
        this.acaoBotao = acaoBotao;
    }

    @Override
    public String toString() {
        return "Botao{" + "acaoBotao=" + acaoBotao + '}';
    }
}
