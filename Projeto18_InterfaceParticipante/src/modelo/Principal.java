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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Participante participante1 = new Participante("Wagner!");
        System.out.println("Participante : \nNome: " + participante1.getNome());
        participante1.lendo();
        participante1.programando();
    }
    
}
