public class Exemplo05 {
    public static void main(String[] args) {
        int valor = 5;

        if (valor % 2 == 0) {
            System.out.println("É par");
        }else {
            System.out.println("É impar");
        }

        switch (valor % 2){
            case 0:
                System.out.println("É par");
                break;
            default:
                System.out.println("É impar");
        }

        System.out.println(valor % 2 == 0 ? "É par" : "É impar");
    }
}
