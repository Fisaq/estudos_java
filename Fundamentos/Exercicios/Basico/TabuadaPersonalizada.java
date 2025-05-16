package Fundamentos.Exercicios.Basico;

import java.util.Scanner;

//  Peça ao usuário um número e imprima a tabuada de 1 a 10 desse número.
public class TabuadaPersonalizada {
    
    public static void main (String[] args){
        TabuadaPersonalizada teste = new TabuadaPersonalizada();
    
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro positivo. \nR: ");
        
        int num = ler.nextInt();
        
        System.out.println("Tabuada de Multiplicação de: " + num);
        teste.tabuadaMulti(num);
    }
    
    
    public void tabuadaMulti(int num){
        if (num <= 0)
            System.out.println("Por favor, informe um número maior do que zero.");
        for(int c = 1; c <= 10; c++){
            System.out.println(c + "*" + num + "=" + c*num);
        }
    }
}
