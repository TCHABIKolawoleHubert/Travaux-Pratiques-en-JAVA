import java.util.Scanner;

public class presentation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.println("Bienvenue " + prenom + " ! Vous avez " + age + " ans.");

        scanner.close();
    }
}