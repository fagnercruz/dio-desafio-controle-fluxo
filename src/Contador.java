import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo parãmetro: ");
        int n2 = sc.nextInt();

        try {
            contagem(n1, n2);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    static void contagem(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2) {
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }

        int interacoes = n2 - n1;

        System.out.println("Total de interações: " + interacoes);
        for (int i = 0; i < interacoes; i++) {
            System.out.println("Imprimindo o número " +  (i + 1));
        }
    }
}
