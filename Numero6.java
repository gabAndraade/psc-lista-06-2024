import java.util.Scanner;
public class Numero6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas= new double[4];
        int[] alunos = new int[10];
        int alunosAprov=0;
        
        for(int rodada = 0;rodada<alunos.length;rodada++){
        System.out.println("Informe as notas do aluno "+(rodada+1)+": ");
        double soma = 0;
            
            for(int i = 0; i<notas.length;i++){  
            notas[i]=scanner.nextDouble();
            soma+=notas[i];
            }
            double media = soma/notas.length;
            if (media>=7) {
            alunosAprov++;
            
        }
        }
        
        System.out.println("O número de alunos com a média maior ou igual a 7.0 é: "+alunosAprov);
         scanner.close();
        
    }
}