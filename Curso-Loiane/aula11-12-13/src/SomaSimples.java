import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Entre com o segundo número: ");
        int num2 = scan.nextInt();
        System.out.println("A soma é: " + (num1 + num2));

        scan.close();
    }
}