import java.util.Scanner;

public class NomeDoMesSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor");
        x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Seu valor é igual a 1");
                break;
            case 2:
                System.out.println("Seu valor é igual a 2");
                break;
            case 3:
                System.out.println("Seu valor é igual a 3");
                break;
            default:
                System.out.println("Você digitou o valor diferente de 1, 2 e 3");
        }


    }
}
