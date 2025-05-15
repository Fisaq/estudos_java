package Fundamentos;

/* Entendendo os principais conceitos da linguagem e sua sintaxe*/


/* Ao menos uma classe em Java precisa de ter o mesmo nome do arquivo,
mesmo que este arquivo possua mais de uma classe. Esta classe precisa ser pública.*/

import java.lang.reflect.Array;
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


    }
}
