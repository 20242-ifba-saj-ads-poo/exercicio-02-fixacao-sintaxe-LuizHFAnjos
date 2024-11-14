public class Exercicio5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
