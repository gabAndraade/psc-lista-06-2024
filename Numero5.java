import java.util.Scanner;
public class Numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 20;
        int[] vetor = new int[tamanho];
        int[] par = new int[tamanho];
        int[] impar = new int[tamanho];
        System.out.println("Digite 20 números inteiros de sua escolha:");
        for(int i=0;i<tamanho;i++){            
            vetor[i]=scanner.nextInt();
            if (vetor[i] %2==0) {
                par[i]=vetor[i];
            }
            if (vetor[i]%2!=0) {
                impar[i]=vetor[i];
                
            }
        }
        System.out.println("Vetor de números inteiros: ");
        imprimir(vetor);
        System.out.println("Vetor de números pares: ");
        imprimir(par);
        System.out.println("Vetor de números ímpares: ");
        imprimir(impar);
        scanner.close();

    }
        
        
        public static void imprimir(int[] vetor) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != 0) {
                    System.out.print(vetor[i] + " ");
                }
            }
            System.out.println();
        
    }
}
