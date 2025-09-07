/* SUM OF A + B
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + b);
    }
}
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr1 = new int[size];
        int [] arr2 = new int[size];

        for (int i = 0; i < size; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++){
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr1[i] + arr2[i]);
        }
    }
}