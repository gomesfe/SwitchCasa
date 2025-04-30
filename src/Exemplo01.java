import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um numero");
        x = sc.nextInt();

        if ( x == 1) {
            System.out.println("Seu numero é igual a 1");
        }
        else if (x == 2 ){
            System.out.println("Seu numero é igual a 2");
        }else if (x == 3){

            System.out.println("Seu numero é igual a 3");
        }else {

            System.out.println("Você digitou um numero diferente de 1, 2 e 3");
        }




    }
}
