public class Exercicio6 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int soma = 0;

        System.out.println(n1);
        System.out.println(n2);

        while(n2 <= 100){
            soma = n1 + n2;
            System.out.println(soma);

            n1 = n2;
            n2 = soma;
        }
    }
}
