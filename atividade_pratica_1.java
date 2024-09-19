
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        // Loop continua até que uma divisão bem-sucedida ocorra
        while (!sucesso) {
            try {
                // Solicita e lê o numerador
                System.out.print("Digite o numerador: ");
                int numerador = Integer.parseInt(scanner.nextLine());

                // Solicita e lê o denominador
                System.out.print("Digite o denominador: ");
                int denominador = Integer.parseInt(scanner.nextLine());

                // Verifica se o denominador é zero e lança uma exceção se for
                if (denominador == 0) {
                    throw new ArithmeticException("O denominador não pode ser zero.");
                }

                // Realiza a divisão e exibe o resultado
                int resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);
                sucesso = true; // Define sucesso como true para sair do loop
            } catch (NumberFormatException e) {
                // Captura exceção se a entrada não for um número inteiro
                System.out.println("Entrada inválida. Por favor, insira números inteiros.");
            } catch (ArithmeticException e) {
                // Captura exceção se o denominador for zero
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}




