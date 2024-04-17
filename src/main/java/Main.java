import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj znak:");
        char ramkaZnak = scanner.next().charAt(0);

        System.out.println("Podaj szerokość:");
        int szerokosc = scanner.nextInt();

        System.out.println("Podaj wysokość :");
        int wysokosc = scanner.nextInt();

        
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                if (i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1) {
                    System.out.print(ramkaZnak + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
