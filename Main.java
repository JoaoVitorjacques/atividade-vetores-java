import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int i = 0;

        System.out.println("Digite 10 números diferentes:");

        while (i < 10) {
            System.out.print("Posição [" + i + "]: ");
            int numeroDigitado = leitor.nextInt();
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (vetor[j] == numeroDigitado) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Erro: O número " + numeroDigitado + " já foi digitado. Tente outro.");
            } else {
                vetor[i] = numeroDigitado;
                i++; 
            }
        }

        System.out.println("\nNúmeros digitados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        
        leitor.close();
    }
}