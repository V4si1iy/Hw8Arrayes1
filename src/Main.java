import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int [] arr1 = new int[3];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        double [] arr2 = {1.57, 7.654, 9.986};
        char [] arr3 = {'H','W','8'};
        System.out.println("Задание 2");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("Задание 3");
        for (int i =2; i >=0; i--)
        {
            System.out.print(arr1[i] +  "," );
        }
        System.out.println();
        for (int i =2; i >=0; i--)
        {
            System.out.print(arr2[i] +  "," );
        }
        System.out.println();
        for (int i =2; i >=0; i--)
        {
            System.out.print(arr3[i] +  "," );
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание 4");
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 !=0)
                arr[i]++;

        }
        System.out.println(Arrays.toString(arr));
    }
}