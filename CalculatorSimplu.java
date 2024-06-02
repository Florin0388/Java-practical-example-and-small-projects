import java.util.Scanner;

public class CalculatorSimplu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nr1, nr2, rezultat;
        char operator;

        System.out.println("Calculator simplu");
        System.out.println("Introduceti primul nr: ");
        nr1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea nr: ");
        nr2 = scanner.nextDouble();

        System.out.println("Introduceti operatorul (+,-,*,/): ");
        operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                rezultat = nr1 + nr2;
                System.out.println("Rezultat: "+rezultat);
                break;
            case '-':
                rezultat = nr1 - nr2;
                System.out.println("Rezultat: " + rezultat);
            case '*':
                rezultat = nr1 * nr2;
                System.out.println("Rezultat: "+rezultat);
                break;
            case '/':
                if (nr2 != 0){
                    rezultat = nr1 / nr2;
                    System.out.println("Rezultat: "+ rezultat);
                } else {
                    System.out.println("Eroare: impartirea la 0");
                }
                break;
            default:
                System.out.println("Operatorul introdus nu este valid");
        }
        scanner.close();

    }
}
