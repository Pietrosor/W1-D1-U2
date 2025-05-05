import java.util.Scanner;

public class Esercizio2 {
    static void frase(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserisci la prima stringa: ");
        String prima = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String seconda = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String terza = scanner.nextLine();

        String ordineNormale = prima+seconda+terza;
        System.out.println("in ordine "+ ordineNormale);

        String ordineInverso = terza+seconda+prima;
        System.out.println("inverso "+ordineInverso);
    }

    public static void main(String[] args) {
        frase();
    }
}
