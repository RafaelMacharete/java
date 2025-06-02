import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Type the values to fit the matriz 3x3: ");
        for (int idx_i = 0; idx_i < 3; idx_i++) {
            for (int idx_j = 0; idx_j < 3; idx_j++) {
                System.out.print("Posição [" + idx_i + "]" + "[" + idx_j + "]");
                matriz[idx_i][idx_j] = scanner.nextInt();
            }
        }

        System.out.println("\n__________________Matriz Digitada__________________");
        for (int idx_i = 0; idx_i < 3; idx_i++) {
            for (int idx_j = 0; idx_j < 3; idx_j++) {
                System.out.print(matriz[idx_i][idx_j] + '\t');
            }
            System.out.println();
        }
        scanner.close();

    }
}