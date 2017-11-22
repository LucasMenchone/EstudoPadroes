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
public class Crianca implements Pessoa{
    
    private int idade = 10;
    private String nome = "João";

/** =========================== **\
 *  Getters e Setters
\** =========================== **/
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
/** =========================== **\
 *  Construtores
\** =========================== **/
    
    public Crianca(Crianca crianca) {
        this.idade = crianca.getIdade();
        this.nome = crianca.getNome();
    }
    
    public Crianca() {
    }

    @Override
    public Pessoa clone() {
        return new Crianca(this);
    }

    @Override
    public String toString() {
        return "Crianca{" + "idade=" + idade + ", nome=" + nome + '}';
    }
}
