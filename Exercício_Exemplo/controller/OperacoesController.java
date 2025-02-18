package Exercício_Exemplo.controller;

public class OperacoesController {
//Buffers melhoram a performance por utilizar menos memória.    

    public OperacoesController(){
        super();
    }
        //Concatena 32768 caracteres, 1 a 1, em uma variável String
        public void concatenaString(){
            String cadeia = "";
            // System.currentTimeMillis(); //Retorna a hora do sistema em milisegundos
            // System.nanoTime(); //Retorna a hora sistema em nanosegundos 
            double tempoInicial = System.nanoTime();
            for (int i = 0; i < 32768; i++){
                cadeia = cadeia + "a";
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            //tempoTotal esta em nanosegundos, que é 10^-9 segundos, para conversão
            //em segundos basta DIVIDIR por 10 a 9: 
            tempoTotal = tempoTotal / Math.pow(10, 9);
            System.out.println("String ==>" +tempoTotal+"s.");
        }
            
        //Concatena 32768 caracteres, 1 a 1, em uma buffer de String
        public void concatenaBuffer(){
            StringBuffer buffer = new StringBuffer();
            double tempoInicial = System.nanoTime();
            for (int i = 0; i < 32768; i++){
                buffer.append("a"); //
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            tempoTotal = tempoTotal / Math.pow(10, 9);
            System.out.println("Buffer ==>" +tempoTotal+"s."); 
        }

        //Recebe uma frase, divide em palavras, imprime cada palavra
        public void divideFrase(String frase){
            String[] vetorPalavra = frase.split(" ");
            //cria vetores de acordo com a quantida de palavras da frase
            //int length = vetorPalavras.length;
            //inves de vetorPalabra.length seria length, da linha de cima, mas n vale a pena
            //melhor um foreach
            //for (int i = 0; i < vetorPalavra.length; i++){}

            //foreach = for (TipoDado var : vetor)
            for (String string : vetorPalavra) {
                System.out.println(string);
            }
        }
}
