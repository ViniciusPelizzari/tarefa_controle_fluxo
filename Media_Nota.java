//DEUS seja louvado!

import java.util.Scanner;

/**
 * @author Vinícius Pelizzari
 */

// criando classe
public class Media_Nota {
    // criando método main
    public static void main(String[] args) {
        // forçando saída de dados
        System.out.flush();
        // criando objeto
        Scanner nt = new Scanner(System.in);
        // saída de dados
        System.out.println("Digite a 1º nota: ");
        // criando variável
        double nota1 = nt.nextDouble();
        // saída de dados
        System.out.println("Digite a 2º nota: ");
        // criando variável
        double nota2 = nt.nextDouble();
        // saída de dados
        System.out.println("Digite a 3º nota: ");
        // criando variável
        double nota3 = nt.nextDouble();
        // saída de dados
        System.out.println("Digite a 4º nota: ");
        // criando variável
        double nota4 = nt.nextDouble();

        // cálculo média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // condição aprovado - IF
        if (media >= 75) {
            // saída de dados
            System.out.print("A sua média foi: " + media + ".\nParabéns! Você está aprovado!");
            // condição recuperação - ELSE IF
        } else if (media <= 74.9 && media >= 50) {
            // saída de dados
            System.out.print("A sua média foi: " + media + ".\nInfelizmente, você está de recuperação!");
            // condição reprovado - ELSE
        } else {
            // saída de dados
            System.out.print("A sua média foi: " + media + ".\nInfelizmente, você está reprovado!");
        }
    }
}
