package Exercício_3.controller;

import javax.swing.JOptionPane;

public class OpController {
    public OpController(){
        super();
    }
        public void par_impar(int vetor[]){
            for (int i : vetor) {
                if (i % 10 == 0) {
                    JOptionPane.showMessageDialog(null, i +" é múltiplo de 10.");
                }
                
                if (i % 2 == 1) {
                    JOptionPane.showMessageDialog(null, i +" é ímpar.");
                }
            }
        }
}
