package Exercício_Exemplo.view;

import Exercício_Exemplo.controller.OperacoesController; //VSCODE >> ECLIPSE

public class Principal {
    public static void main(String[] args) {

        OperacoesController op = new OperacoesController();
        op.concatenaString();
        op.concatenaBuffer();
        
        String frase = "Olá turma do terceiro semestre tudo bem";
        op.divideFrase(frase);
        
    }
}
