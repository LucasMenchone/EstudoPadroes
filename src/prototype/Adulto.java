/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author lucas
 */
public class Adulto implements Pessoa{

    public int idade = 20;
    public String nome = "Lucas";
/** =========================== **\
 *  Getters e Setters
\** =========================== **/
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
/** =========================== **\
 *  Construtores
\** =========================== **/
    public Adulto() {
    }
    
    public Adulto(Adulto adulto) {
        this.idade = adulto.getIdade();
        this.nome = adulto.getNome();
    }
    
    
    @Override
    public Pessoa clone() {
        return new Adulto(this);
    }

    @Override
    public String toString() {
        return "Adulto{" + "idade=" + idade + ", nome=" + nome + '}';
    }
}
