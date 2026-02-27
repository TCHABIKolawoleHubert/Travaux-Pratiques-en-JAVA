import java.util.Scanner;

public class calculatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        System.out.print("Choisissez une opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        double resultat = 0;

        switch (operation) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                } else {
                    System.out.println("Division par zéro impossible !");
                    return;
                }
                break;
            default:
                System.out.println("Opération invalide !");
                return;
        }

        System.out.println("Le résultat est : " + resultat);

        scanner.close();
    }
}