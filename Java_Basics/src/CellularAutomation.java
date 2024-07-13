import java.util.*;
public class CellularAutomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cells = new int[8];
        for (int i = 0; i < 8; i++) {
            cells[i] = scanner.nextInt();
        }
        int days = scanner.nextInt();
        int[] result = simulate(cells, days);
        for (int i = 0; i < 8; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
    public static int[] simulate(int[] cells, int days) {
        int[] current = Arrays.copyOf(cells, cells.length);
        int[] next = new int[8];
        while (days > 0) {
            for (int i = 0; i < 8; i++) {
                int left = (i == 0) ? 0 : current[i - 1];
                int right = (i == 7) ? 0 : current[i + 1];
                next[i] = (left == right) ? 0 : 1;
            }
            current = Arrays.copyOf(next, next.length);
            days--;
        }
        return current;
    }
}