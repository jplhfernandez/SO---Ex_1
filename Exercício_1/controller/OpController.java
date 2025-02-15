package Exercício_1.controller;

public class OpController {
    public OpController(){
        super();
    }
    
    public void vet1000(){
        int vetor[] = new int[1000];
        double tempoInicial = System.nanoTime();
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = 0;
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("String 1000 ==>" +tempoTotal+"s.");
        System.out.printf("String 1000 ==> %.6fs%n", tempoTotal, "s");
    }

    public void vet10000(){
        int vetor[] = new int[10000];
        double tempoInicial = System.nanoTime();
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = 0;
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("String 10000 ==>" +tempoTotal+"s.");
        System.out.printf("String 10000 ==> %.6fs%n", tempoTotal, "s");
    }

    public void vet100000(){
        int vetor[] = new int[100000];
        double tempoInicial = System.nanoTime();
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = 0;
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("String 100000 ==>" +tempoTotal+"s.");
        System.out.printf("String 100000 ==> %.6fs%n", tempoTotal, "s");
    }
    
}
