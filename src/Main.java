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
/* SUM OF THE VALUES OF 2 ARRAYS
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
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr1 = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++){
            arr1[i] = sc.nextInt();
            sum += arr1[i];
        }
        System.out.println(sum);
    }
}
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        double[] arr1 = new double[size];
        double [] arr2 = new double[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextDouble();
            arr2[i] = sc.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            double result = arr1[i] / arr2[i];
            //long rounded = Math.round(result);
            if (result > 0) {
                System.out.println((long) Math.floor(result + 0.5)+ " ");
            } else {
                System.out.println((long) Math.ceil(result - 0.5)+ " ");
            }

        }
    }
}
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];
        int [] arr3 = new int[size];

        for (int i = 0; i < size; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++){
            arr3[i] = Math.min(arr1[i], arr2[i]);
            System.out.println(arr3[i]+ " ");
        }
    }
}