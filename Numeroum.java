import java.util.Scanner;
public class Numeroum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n1 = new int[5];
       
        
        
        System.out.println("Informe 5 números inteiros: ");
        for(int numeros = 0;numeros< n1.length;numeros++){
            n1[numeros]=scanner.nextInt();
            
        }
        scanner.close();
        System.out.println("Os números informados foram: "+n1[0]+" "+n1[1]+" "+n1[2]+" "+n1[3]+" "+n1[4]);       
    }
}