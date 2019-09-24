/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Participante implements ILeitor, Iprogramador {
    
    private String nome;

    //Construtores
    //Vazio
    public Participante() {
    }

    //cheio
    public Participante(String nome) {
        this.nome = nome;
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    

    @Override
    public void lendo() {
        System.out.println("Lendo...");
    }

    @Override
    public void programando() {
        System.out.println("Programando");
    }
    
}
