import java.util.Scanner;

public class AvaliacaoNotaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vogal;

        System.out.println("Digite um caractere");
        vogal = sc.next();

        vogal.toUpperCase();

        if (vogal.equalsIgnoreCase("a") || vogal.equalsIgnoreCase("e") || vogal.equalsIgnoreCase("i") || vogal.equalsIgnoreCase("o") || vogal.equalsIgnoreCase("u") ){
            System.out.println("É uma vogal");
        } else {
            System.out.println("Não é uma vogal");
        }


    }
}
