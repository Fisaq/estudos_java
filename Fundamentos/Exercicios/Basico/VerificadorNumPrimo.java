package Fundamentos.Exercicios.Basico;
import java.util.ArrayList;
import java.util.Scanner;

//  Peça ao usuário um número inteiro e diga se ele é primo ou não.
public class VerificadorNumPrimo {
    public static void main (String[] args){
        VerificadorNumPrimo teste = new VerificadorNumPrimo();

        System.out.println("Entre com um número inteiro\nR: ");

        Scanner ler = new Scanner(System.in);

        int entrada = ler.nextInt();

        teste.ehPrimo(entrada);
        
        ArrayList<Integer> listaDivisores = teste.divisores(entrada);
        
        System.out.println("Lista de divisores de " + entrada);
        for(int num : listaDivisores){
            System.out.println(num);
        }
    }

    public void ehPrimo(int num){
        if (num <= 1)
            System.out.println("O número " + num + " não é primo!");
        for(int c = 2; c <= Math.sqrt(num); c++){
            if (num % c == 0) {
                System.out.println("O número " + num + " não é primo!");
                return;
            }
        }
        System.out.println("O número " + num + " é primo!");
    }
    
    public ArrayList<Integer> divisores(int num){
        ArrayList<Integer> divisores = new ArrayList<>();
        for(int c = 1; c <= num; c++){
            if (num % c == 0)
                divisores.add(c);
        }
        return divisores;
    }
}
