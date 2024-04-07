import java.util.Scanner;
public class Numero4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] n = new char[10];
    int consoantes = 0;
    System.out.println("Digite 10 caracteres: ");
    for(int i = 0; i<n.length;i++){
        n[i]=scanner.next().charAt(0);
    }
    System.out.println("Consoantes: ");
    for (char c : n) {
        if (eConsoante(c)) {
            consoantes++;
            System.out.println(c);
        }
    }
    System.out.println("Consoantes contadas: "+consoantes);
    scanner.close();
    }
    public static boolean eConsoante(char c){
        return (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u');
    }
    
}
