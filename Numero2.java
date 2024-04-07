
import java.util.Scanner;
public class Numero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] n=new double[10];
        
        System.out.println("Informe 10 números de sua escolha: ");
        for(int numeros=0;numeros<n.length;numeros++){
            n[numeros]=scanner.nextDouble();           
        }
        System.out.println("Ordem inversa: ");
        for(int numeros = n.length-1;numeros>=0;numeros--){
            System.out.println(n[numeros]);
        }
        scanner.close();
        
        
    }
    
}
