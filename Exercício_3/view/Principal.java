package Exercício_3.view;

import javax.swing.JOptionPane;

import Exercício_3.controller.OpController;

public class Principal {
    public static void main(String[] args) {
        OpController op = new OpController();
        int opc = -1;
        while (opc <= 0 || opc >= 101) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor: "));
        }

        int vetor[] = new int[opc];
        for(int i = 0; i < opc; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desde vetor: "+i));
        }

        op.par_impar(vetor);
    }
}
