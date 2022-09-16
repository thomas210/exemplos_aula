import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        
        // // leitura de valores numericos usando a classe Scanner
        Scanner input = new Scanner(System.in);

        // leitura de valores numericos
        System.out.println("Digite um numero inteiro: ");
        int num_inteiro = input.nextInt();
        System.out.println("Valor inteiro: " + num_inteiro);

        System.out.println("Digite um numero float: ");
        float num_float = input.nextFloat();
        System.out.println("Valor float: " + num_float);

        System.out.println("Digite um numero double: ");
        double num_double = input.nextDouble();
        System.out.println("Valor double: " + num_double);

        // leitura de valores do tipo char
        System.out.println("Digite um caractere: ");
        char letra = input.next().charAt(0);
        System.out.println("Valor char: " + letra);

        // leitura de valores do tipo String
        System.out.println("Digite uma frase: ");
        String frase = input.next();
        System.out.println("Valor String: " + frase);

        // // leitura de valores do tipo boolean
        // System.out.println("Digite um valor booleano: ");
        // boolean bool = input.nextBoolean();
        // System.out.println("Valor boolean: " + bool);

        // ler o texto de uma linha com espacos
        System.out.println("Digite uma frase com espacos: ");
        String frase2 = input.nextLine();
        System.out.println("Valor String: " + frase2);

        // close() -> fecha o scanner
        input.close();
    }
    
}
