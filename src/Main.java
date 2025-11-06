import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        exibeVetor(tamanho);
    }

    public static int preencheVetor(int tamanho) {
        if(tamanho == 0){
            return 0;
        }
        return preencheVetor(tamanho - 1);
    }

    public static int exibeVetor(int tamanho) {
        if(tamanho == 0){
            return 0;
        }
        System.out.println(preencheVetor(tamanho) + tamanho);
        return exibeVetor(tamanho - 1);

    }
}