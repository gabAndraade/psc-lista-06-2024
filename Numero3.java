import java.util.Scanner;
public class Numero3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Array {0,1,2,3}
    double[] notas = new double[4];
    double soma=0;
    
       
        for(int rodada =0;rodada<notas.length;rodada++){
            System.out.println("Informe a nota " + (rodada+1)+": ");
            notas[rodada]=scanner.nextDouble();
            soma+=notas[rodada];
        }
        
        double media = soma/notas.length;

        System.out.println("As notas informadas foram: ");
        for(int rodada =0;rodada<notas.length;rodada++){
            System.out.println("Nota "+(rodada+1)+": "+notas[rodada]);
        }
        System.out.println("A media das notas é: "+media);
        scanner.close();
        
        
        
        
        
    }
    
}
