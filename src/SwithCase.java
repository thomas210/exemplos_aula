public class SwithCase {
    
    public static void main(String[] args) {
        
        // Switch Case
        System.out.println("Switch Case");
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("Valor 1");
                break;
            case 2:
                System.out.println("Valor 2");
                break;
            case 3:
                System.out.println("Valor 3");
                break;
            default:
                System.out.println("Valor nao encontrado");
                break;
        }

        // Switch Case com varios cases
        System.out.println("Switch Case com varios cases");
        int num2 = 2;
        switch (num2) {
            case 1:
            case 2:
            case 3:
                System.out.println("Valor 1, 2 ou 3");
                break;
            default:
                System.out.println("Valor nao encontrado");
                break;
        }

    }

}
