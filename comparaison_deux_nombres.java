import java.util.Scanner;

public class comparaison_deux_nombres {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Demander les deux nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        // Comparaison
        if (nombre1 > nombre2) {
            System.out.println("Le plus grand nombre est : " + nombre1);
        } else if (nombre2 > nombre1) {
            System.out.println("Le plus grand nombre est : " + nombre2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

        scanner.close();
    }
}