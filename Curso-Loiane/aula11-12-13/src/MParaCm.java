import java.util.Scanner;

public class MParaCm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a medida em metros: ");
        double metros = scan.nextDouble();
        System.out.println(metros + " metros = " + metros * 100 + " centímetros");

        scan.close();
    }
}