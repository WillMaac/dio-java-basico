package edu.will.segundasemana;

public class BoletimEstudantil {     
    public static void main(String[] args) {
        int mediaFinal = 6; // Supondo um valor arbitrário para mediaFinal, você pode atribuir um valor válido aqui
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}