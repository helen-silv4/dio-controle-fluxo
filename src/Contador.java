import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o 1º parâmetro: ");
        int parametro1 = terminal.nextInt();

        System.out.print("Digite o 2º parâmetro: ");
        int parametro2 = terminal.nextInt();

        try{
            // chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException exception){
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        // validar se parametro1 é MAIOR que parametro2 e lançar a exceção
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametro2 - parametro1;

        // for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}