import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner; // Importa a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler a entrada do usuário
        // Configura o Scanner para usar o ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            // Solicita e lê o número da conta
            System.out.print("Por favor, digite o número da sua conta (exemplo 1021): ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()

            // Solicita e lê o número da agência
            System.out.print("Por favor, digite o número da sua agência (exemplo 067-8): ");
            String numeroAgencia = scanner.nextLine();

            // Solicita e lê o nome do cliente
            System.out.print("Por favor, digite o nome do cliente (exemplo Mario Andrade): ");
            String nomeCliente = scanner.nextLine();

            // Solicita e lê o saldo da conta
            System.out.print("Por favor, digite o saldo da conta (exemplo 237.48): ");
            double saldo = scanner.nextDouble();

            // Exibe a mensagem formatada com os dados fornecidos
            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                               numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}
