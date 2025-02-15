package Exercício_1.view;
import Exercício_1.controller.OpController;
public class Principal {
    public static void main(String[] args) {
        
        OpController op = new OpController();
        op.vet1000();
        op.vet10000();
        op.vet100000();
    }
}
