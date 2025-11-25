import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        if (tamanho <= 0){
            System.out.println("Tamanho precisa ser maior que 0!");
            return;
        }

        int[] vetor = new int[tamanho];
        System.out.println("Preenchendo vetor[" + tamanho + "]:");

        preencheVetor(vetor, 0);

        System.out.print("Vetor["+tamanho+"]: [ ");
        exibeVetor(vetor, 0, tamanho);
        System.out.print("]");
    }

    public static int preencheVetor(int[] vetor, int n) {
        Scanner sc = new Scanner(System.in);
        if(n >= vetor.length){
            return 0;
        }
        System.out.print("Vetor[" + n + "] = ");
        vetor[n] = sc.nextInt();
        return preencheVetor(vetor, n+1);
    }

    public static int exibeVetor(int[] vetor, int n, int tamanho) {
        if(n >= vetor.length){
            return 0;
        }
        System.out.print(vetor[n] + " ");
        return exibeVetor(vetor, n+1, tamanho);
    }
}
