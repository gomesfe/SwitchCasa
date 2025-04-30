import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vogal;

        System.out.println("Digite um caractere");
        vogal = sc.next();

        vogal.toLowerCase();

        switch (vogal){
            case "a", "e", "i", "o", "u":
                System.out.println("É uma vogal");
                break;

            default:
                System.out.println("Não é uma vogal");
        }

    }
}
