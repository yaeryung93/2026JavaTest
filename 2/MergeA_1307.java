import java.util.*;
public class MergeA_1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][5];
        int[] allArr = new int[arr[0].length * arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("배열%d의 %d번방 입력 : ", i + 1, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("배열%d 데이터 : ", i + 1);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                allArr[c++] = arr[i][j];
            }
        }

        for (int i = 0; i < allArr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < allArr.length; j++) {
                if (allArr[j] < allArr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = allArr[i];
            allArr[i] = allArr[minIndex];
            allArr[minIndex] = temp;
        }

        System.out.print("전체 데이터 (오름차순) : ");
        for (int i = 0; i < allArr.length; i++) {
            System.out.print(allArr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < allArr.length; i++) {
            if (allArr[i] == allArr[i - 1]) {
                allArr[i] = 0;
            }
        }
        System.out.print("중복 제거된 데이터 : ");
        for (int i = 0; i < allArr.length; i++) {
            if (allArr[i] != 0) {
                System.out.print(allArr[i] + " ");
            }
        }
        System.out.println();
    }
}
