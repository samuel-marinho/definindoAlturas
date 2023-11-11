package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for (int i=0; i<vetor.length; i++){
            sc.nextLine();
            System.out.printf("Digite os dados da %d pessoa \n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i]= new Pessoa(nome, idade, altura);
            System.out.println();
        }
        double soma = 0;
        for (int i=0; i< vetor.length; i++){
            soma += vetor[i].getAltura();
        }
        double mediaAltura = soma/ vetor.length;
        System.out.println();
        System.out.printf("Altura média %.2f%n", mediaAltura);
        double menores = 0;
        for (int i=0; i< vetor.length; i++){
            if (vetor[i].getIdade()<16){
                menores ++;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (menores/vetor.length*100));
        for (int i=0; i< vetor.length; i++){
            if (vetor[i].getIdade()<16){
                System.out.println(vetor[i].getNome());
            }
        }
        sc.close();
    }
}
