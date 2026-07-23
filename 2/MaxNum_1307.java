import java.util.*;
public class MaxNum_1307{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.print("배열의 크기 : ");
        int arrLength = sc.nextInt();

        int[][] arr = new int[arrLength][arrLength];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100) + 1;
            }
        }
        System.out.printf("%d X %d 배열의 데이터 : %n", arrLength, arrLength);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("\t" + arr[i][j]);
                if (max < arr[i][j]) {
                    max = arr[i][j];
                } 
            }
            System.out.println();
        }

        System.out.println("최대값 : " + max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max != arr[i][j]) {
                    continue;
                }
                System.out.printf("최댓값의 위치 : (%d,%d)%n", i, j);
            }
        }
    }
}
