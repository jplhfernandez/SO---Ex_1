package Exercício_2.controller;

public class OpController {
    public OpController(){
        super();
    }

    public void divideTexto(String frase){
        String[] vetorPalavras = frase.split(";");
        for (String string : vetorPalavras){
            System.out.println(string);
        }
    }
}
