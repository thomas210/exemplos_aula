public class Operadores {
    
    public static void main(String[] args) {
        
        // operadores aritmetricos
        System.out.println("Operadores aritmetricos");
        int num1 = 10;
        int num2 = 5;
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + resto);

        // concatenacao de strings
        System.out.println("Concatenacao de strings");
        String nome = "Joao";
        String sobrenome = "Silva";
        String nome_completo = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nome_completo);

        // operadores de atribuicao
        System.out.println("Operadores de atribuicao");
        int num3 = 10;
        num3 += 5; // num3 = num3 + 5
        System.out.println("num3 += 5: " + num3);
        num3 -= 5; // num3 = num3 - 5
        System.out.println("num3 -= 5: " + num3);
        num3 *= 5; // num3 = num3 * 5
        System.out.println("num3 *= 5: " + num3);
        num3 /= 5; // num3 = num3 / 5
        System.out.println("num3 /= 5: " + num3);
        num3 %= 5; // num3 = num3 % 5
        System.out.println("num3 %= 5: " + num3);

        // operadores de comparacao
        System.out.println("Operadores de comparacao");
        int num4 = 10;
        int num5 = 5;
        boolean igual = num4 == num5;
        boolean diferente = num4 != num5;
        boolean maior = num4 > num5;
        boolean menor = num4 < num5;
        boolean maior_igual = num4 >= num5;
        boolean menor_igual = num4 <= num5;
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou igual: " + maior_igual);
        System.out.println("Menor ou igual: " + menor_igual);

        // operadores logicos
        System.out.println("Operadores logicos");
        boolean verdadeiro = true;
        boolean falso = false;
        boolean and = verdadeiro && falso;
        boolean or = verdadeiro || falso;
        boolean not = !verdadeiro;
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);

        // operadores de incremento e decremento
        System.out.println("Operadores de incremento e decremento");
        int num6 = 10;
        num6++;
        System.out.println("num6++: " + num6);
        num6--;
        System.out.println("num6--: " + num6);
        ++num6;
        System.out.println("++num6: " + num6);
        --num6;
        System.out.println("--num6: " + num6);

        // operadores ternarios
        System.out.println("Operadores ternarios");
        int num7 = 10;
        int num8 = 5;
        int maior_num = num7 > num8 ? num7 : num8;
        System.out.println("Maior numero: " + maior_num);

    }
}
