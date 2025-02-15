package Exercício_2.view;

import javax.swing.JOptionPane;

import Exercício_2.controller.OpController;

public class Principal {
    public static void main(String[] args) {
        OpController op = new OpController();
        String frase = JOptionPane.showInputDialog("Insira o texto: ");
        op.divideTexto(frase);
    }
}
