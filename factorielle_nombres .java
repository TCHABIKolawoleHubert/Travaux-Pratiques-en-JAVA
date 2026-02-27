import java.util.Scanner;

public class factorielle_nombres  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            long factorielle = 1;

            for (int i = 1; i <= n; i++) {
                factorielle = factorielle * i;
            }

            System.out.println("La factorielle de " + n + " est : " + factorielle);
        }

        scanner.close();
    }
}