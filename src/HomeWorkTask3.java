import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {

        // TASK #1
        //changeNumb();

        // TASK #2
        //numbList();

        // TASK #3
        //multyplyNumbs();

        // TASK #4
        //twoLists();

        // TASK #5
        //arr(5, 19);

        // TASK #6
        //arrMaxMin(5);

        // TASK #7
        //checkBalance(new int[]{7, 3, 4, 5, 6, 6, 7});

        // TASK #8
        //movePosition(new int[]{1,2,3,4}, -1);
        // НЕ СМОГ РЕШИТЬ ДАННУЮ ЗАДАЧУ, НУЖНА ПОМОЩЬ :(

    }

    private static void movePosition(int[] arr, int n) {
        int firstNumb = arr[0];
        int lastNumb = arr[arr.length-1];
        if (n < 0){
            for (int i = arr.length-1; i > 0; i--) {
                int x = arr[i-1];
                System.out.println("x " + x);
                arr[i] = arr[i-1];
            }
            arr[arr.length-1] = lastNumb;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean checkBalance(int[] arr) {
        boolean check = false;
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println();
        int leftSum = 0;
        int rightSum = sum/2;
        if (sum % 2 == 0){
            for (int i : arr){
                if (leftSum == rightSum) {
                    check = true;
                    System.out.println(check);
                    return check;
                } else
                    leftSum += i;
            }
        }
        System.out.println(check);
        return check;
    }

    private static void arrMaxMin(int len) {
        int[] arr = new int[len];
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(20);
        }
        int min = arr[0];
        int max = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int j : arr){
            if (j > max)
                max = j;
        }
        for ( int k : arr){
            if (k < min)
                min = k;
        }
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }

    private static void arr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void twoLists() {
        int[][] twoLists = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < twoLists.length; i++){
            for (int j = 0, x = twoLists.length - 1; j < twoLists.length; j++, x--){
                twoLists[i][j] = rand.nextInt(20);
                if (i == j || i == x) twoLists[i][j] = 1;
                System.out.print(twoLists[i][j] + " ");
            }
            System.out.println();
        }
 }

    private static void multyplyNumbs() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Задайте собственную длинну списка:");
        int rangeNumb = scan.nextInt();
        int[] numbList = new int[rangeNumb];
        for (int i = 0; i < numbList.length; i++){
            numbList[i] = rand.nextInt(20);
            if (numbList[i] < 6)
                numbList[i] *= 2;
        }
        System.out.println(Arrays.toString(numbList));
    }

    private static void numbList() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте собственную длинну списка:");
        int rangeNumb = scan.nextInt();
        int[] numbList = new int[rangeNumb];
        for (int i = 0; i < numbList.length; i++){
            numbList[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbList));
    }

    private static void changeNumb() {
        Scanner scan = new Scanner(System.in);
        int[] binaryNumb = {1,0,1,0,0,1,0,1,1};
        System.out.println("Вот Ваш список: {1,0,1,0,0,1,0,1,1} ");
        System.out.println("А теперь введите '0' или '1' и увидите магию :)");
        int x = scan.nextInt();
        while (x != 0 && x != 1){
            System.out.println("Можно вводить только '0' или '1'");
            x = scan.nextInt();
        }
        if (x == 1){
            for (int i = 0; i < binaryNumb.length; i++)
                binaryNumb[i] = 1;
        } else {
            for (int j = 0; j < binaryNumb.length; j++)
                binaryNumb[j] = 0;
        }
        System.out.println(Arrays.toString(binaryNumb));
    }
}
