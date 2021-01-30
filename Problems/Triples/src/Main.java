import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int triple=0;
        for (int i=0; i < len; i++)  {
            array[i] = scanner.nextInt();
        }
        for(int i = 1; i < len-1; i++)
            if ((array[i]==array[i-1]+1)&&(array[i]==array[i+1]-1)){
                triple+=1;
        }
        System.out.println(triple);
    }
}