import java.util.Scanner;
public class Numerosete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        double soma=0;
        double mult = 1;
        System.out.println("Digite 5 números inteiros: ");
        for(int i = 0; i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
            soma+=numeros[i];
            mult*=numeros[i];

        }
        System.out.println("Os números fornecidos foram: ");
        for(int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        System.out.println("Soma: "+soma);
        System.out.println("Multiplicação: "+mult);
        scanner.close();
    }
    
}
