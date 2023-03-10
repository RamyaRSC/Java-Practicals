import java.util.Scanner;

class addmatrices {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 9 elements for 1st matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = S.nextInt();
            }
        }
        System.out.println("Enter 9 elements for 2st matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = S.nextInt();
            }
        }
        System.out.println("Result after Addition of above 2 matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result after Subtraction of above 2 matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}