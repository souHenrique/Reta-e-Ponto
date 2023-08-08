import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quais as coordenadas do Ponto A? (x y):");
        double xA = scanner.nextDouble();
        double yA = scanner.nextDouble();
        Pontos pontoA = new Pontos(xA, yA);

        System.out.println("Quais as coordenadas do Ponto B? (x y):");
        double xB = scanner.nextDouble();
        double yB = scanner.nextDouble();
        Pontos pontoB = new Pontos(xB, yB);

        Reta reta = new Reta(pontoA, pontoB);
        double tamanhoReta = reta.TamanhoReta();

        System.out.println("O tamanho dessa reta é: " + tamanhoReta);
    }
}
