
package emprestimo;
import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        float valor = scanner.nextFloat();

        System.out.print("Taxa mensal (em %): ");
        float taxa = scanner.nextFloat();

        System.out.print("Tempo (em meses): ");
        int tempo = scanner.nextInt();

        Emprestimo emprestimo = new Emprestimo(valor, taxa, tempo);
        float prestacao = emprestimo.calcularPrestacao();

        System.out.printf("Prestação: R$ %.5f%n", prestacao);

        scanner.close();
    }
}
