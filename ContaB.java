import java.util.Scanner;

public class ContaB {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Olá! Para começar, digite o número da Agência: ");
        Integer numAgencia = entry.nextInt();
        entry.nextLine(); // Consumir quebra de linha pendente

        System.out.println("Agora, digite a Agência: ");
        String agencia = entry.nextLine();

        System.out.println("Por favor, nos informe seu nome: ");
        String nomeUser = entry.nextLine();

        double saldo = 219.12;

        System.out.printf(
                "Olá, %s! Sua conta foi criada com sucesso! Anote suas informacoes: \nNúmero: %d \nAgencia: %s \nSaldo: %.2f",
                nomeUser, numAgencia, agencia, saldo);

        entry.close();
    }
}
