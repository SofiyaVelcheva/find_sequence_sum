import java.util.Scanner;

public class SequenceSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(getSequenceSum(i, j, k));
    }
    private static long getSequenceSum(int i, int j, int k) {
        long sequenceSum = i + j + k;
        for (int l = i + 1; l < j; l++) {
            sequenceSum += l;
        }
        for (int l = j - 1; l > k; l--) {
            sequenceSum += l;
        }
        return sequenceSum;
    }
}
