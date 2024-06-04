package Heranca2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as informações do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Limpar o buffer do scanner
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo: ");
        String tipo = scanner.nextLine();

        // Criar um objeto Pessoa com as informações fornecidas
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setTipo(tipo);

        // Exibir as informações do usuário e chamar os métodos
        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Tipo: " + pessoa.getTipo());

        // Chamar os métodos andar e falar
        pessoa.andar();
        System.out.println(pessoa.falar());

        scanner.close();
    }
}
