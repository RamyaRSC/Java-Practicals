import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter array");
        int arr[] = new int[5];
        int temp;
        for (int i = 0; i < 5; i++) {
            arr[i] = S.nextInt();
        }
        System.out.println("Ascending Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) // for des arr[i] < arr[j]

                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}