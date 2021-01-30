import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comN = scanner.nextInt();
        int[] comIncome = new int[comN];
        double[] comTaxes = new double[comN];
        double[] comPayment = new double[comN];
        int highestT = 0;
        for (int i = 0;i < comN; i++)
        {
            comIncome[i] = scanner.nextInt();
        }
        for (int i = 0;i < comN; i++)
        {
            comTaxes[i] = scanner.nextInt();
        }

        for (int i = 0; i < comN;i++)
        {
            if ((comTaxes[i]==0) || (comIncome[i]==0)) {
                continue;
            }
            comPayment[i] = comIncome[i] * comTaxes[i] / 100;
        }
        for (int i = 1; i < comN; i++){
            if(( comPayment[i] > comPayment[i-1]) && (comPayment[i] > highestT)) {
                highestT = i;
            }
        }
        System.out.println(highestT+1);
        // System.out.println(Arrays.toString(comPayment));

    }
}