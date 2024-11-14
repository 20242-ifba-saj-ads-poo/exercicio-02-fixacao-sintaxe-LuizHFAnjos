public class Exercicio8 {
    public static void main(String[] args) {
        int nLinhas = 5;

        for(int i = 1; i <= nLinhas; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
