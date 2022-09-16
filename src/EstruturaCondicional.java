public class EstruturaCondicional {

    public static void main(String[] args) {
        
        // Estrutura condicional simples
        System.out.println("Estrutura condicional simples");
        int num1 = 10;
        int num2 = 5;
        if (num1 > num2) {
            System.out.println("num1 eh maior que num2");
        }

        // Estrutura condicional composta
        System.out.println("Estrutura condicional composta");
        int num3 = 10;
        int num4 = 5;
        if (num3 > num4) {
            System.out.println("num3 eh maior que num4");
        } else {
            System.out.println("num3 eh menor que num4");
        }

        // Estrutura condicional encadeada
        System.out.println("Estrutura condicional encadeada");
        int num5 = 10;
        int num6 = 5;
        int num7 = 15;
        if (num5 > num6) {
            System.out.println("num5 eh maior que num6");
        } else if (num5 > num7) {
            System.out.println("num5 eh maior que num7");
        } else {
            System.out.println("num5 eh menor que num6 e num7");
        }

        // Estrutura condicional com AND e OR
        System.out.println("Estrutura condicional com AND e OR");
        int num8 = 10;
        int num9 = 5;
        int num10 = 15;
        if (num8 > num9 && num8 > num10) {
            System.out.println("num8 eh maior que num9 e num10");
        } else if (num8 > num9 || num8 > num10) {
            System.out.println("num8 eh maior que num9 ou num10");
        } else {
            System.out.println("num8 eh menor que num9 e num10");
        }

        // varios if's repetidos
        System.out.println("varios if's repetidos");
        int num11 = 10;
        int num12 = 5;
        int num13 = 15;
        if (num11 > num12) 
{
            System.out.println("num11 eh maior que num12");
        }
        if (num11 > num13) {
            System.out.println("num11 eh maior que num13");
        }
        if (num11 > num12 && num11 > num13) {
            System.out.println("num11 eh maior que num12 e num13");
        }

        // if's aninhados
        System.out.println("if's aninhados");
        int num14 = 10;
        int num15 = 5;
        int num16 = 15;
        if (num14 > num15) {
            if (num14 > num16) {
                System.out.println("num14 eh maior que num15 e num16");
            }
        }

    }
    
}
