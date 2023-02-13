import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as 4 notas bimestrais:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        System.out.println("A média é: " + (nota1 + nota2 + nota3 + nota4) / 4);

        scan.close();
    }
}