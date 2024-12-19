import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double x;
        Double y;
        String operacao;


        System.out.println("Digite o primeiro valor");
        x = scanner.nextDouble();

        System.out.println("Digite a operação que deseja realizar: ( + , - , * , / )");
        operacao = scanner.next();

        System.out.println("Digite o segundo valor");
        y = scanner.nextDouble();

        System.out.println("Resultado = " + calculo(x, y, operacao));

    }
    public static Double calculo(Double x, Double y, String operacao){
        Double resposta = 0.0;
        switch (operacao){
            case "+":
                resposta = x + y;
                break;
            case "-":
                resposta = x - y;
                break;
            case "*":
                resposta = x * y;
                break;
            case "/":
                resposta = x / y;
                break;
            default:
                System.out.println("Opção inválida");
        }
        return (resposta);
    }
}
