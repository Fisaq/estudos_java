package Fundamentos;

/* Entendendo os principais conceitos da linguagem e sua sintaxe*/


/* Ao menos uma classe em Java precisa de ter o mesmo nome do arquivo,
mesmo que este arquivo possua mais de uma classe. Esta classe precisa ser pública.*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Declaração de variáveis em Java

        // tipo nomeVariavel = valor;
        int idade = 5;
        String nome = "Isaque";

        //Também é possível declarar uma variável geral e passar o seu tipo implicitamente
        var meuNome = "Jurandir";

        //Tipos primitivos Java

        //Inteiros
        byte varByte; //8 bits => -128 a 127
        short varShort; //16 bits => -32.768 a 32.767
        int varInt; //32 bits => -2.147.483.648 a 2.147.483.647
        long varLong; //64 bits => -9.233.372.036.854.775.808 a 9.233.372.036.854.775.807

        //Decimais
        float varFloat; //32 bits => precisão simples
        double varDouble; //64 bits => precisão dupla

        //Caracteres

        // A String não é um tipo primitivo, apesar de estar no módulo principal do Java, ela é uma classe que permite a representação de uma string
        String varString; //Representa palavras e frases
        char varChar; //Representa um único caracter => a,b,c...

        //Boolean
        boolean varBoolean; //Representa dois estados (verdadeiro ou falso)

        //Condicionais em Java

        int num = 2;

        //O java possui 3 tipos básicos de condicionais => if, if-else e else
        if(num % 2 != 0) {
            System.out.println("O número não é par!");
        } else if (num == 0) {
            System.out.println("O número é igual a zero");
        } else{
            System.out.println("O número é par!");
        }

        //Vetores em Java

        //tipoVetor[] nomeVetor = {elementos}
        int[] colecaoDeInteiros = {1,2,3,4,5,6};
        int[] meusNumeros = new int[10];

        //Acessando o valor
        System.out.println(colecaoDeInteiros[1]);

        //Tamanho do vetor
        System.out.println(colecaoDeInteiros.length);

        //Arrays no Java

        /*Arrays List é uma classe do Java que
        permite a criação de arrays dinâmicos.
        Que permitem a criação de arrays com tamanhos
        dinâmicos.*/

        //Declaracao
        ArrayList<String> listaNomes = new ArrayList<>();

        //Adicionando elementos
        listaNomes.add("Isaque");
        listaNomes.add("Ludmila");
        listaNomes.add("Leandro");
        listaNomes.add("Davi");
        listaNomes.add("Ilza");

        //Acessando um elemento
        System.out.println(listaNomes.get(4));

        //Removendo um elemento
        listaNomes.remove(0);
        listaNomes.remove("Ludmila");

        System.out.println(listaNomes.get(0));

        //Loops em Java

        //For => Interacoes limitadas com base em um critério de início e fim.

        System.out.println("Lista de Nomes:\n");
        for(int c = 0; c < listaNomes.size(); c++){
            System.out.println(listaNomes.get(c));
        }

        //Outra forma de declaracao

        for(String primeiroNome : listaNomes){
            System.out.println(nome);
        }

        //While => Executado várias vezes até que determinada condição seja atingida

        int cont = 0;
        while(cont < 10){
            System.out.println("Dentro do While");
            cont +=1;
        }

        //Do While => Semelhante ao While, porém realiza a ação antes das condições do looping
        int cont2 = 0;
        do{
            System.out.println("Estou no Do While");
            cont2 +=1;
        }while (cont2 < 10);

        //Casting em Java - Transformação de tipos

        //Cast explícito
        double resultado = 2.0;
        int resultadoInt = (int)resultado;

        String minhaString = "10";
        int meuInt = Integer.parseInt(minhaString);

        String minhaStr = String.valueOf(meuInt);
    }
}
