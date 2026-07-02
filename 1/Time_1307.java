// 1307 김예령
import java.util.Scanner;
public class Time_1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력: ");
        int num = sc.nextInt();

        String result = switch (num) {
            case 0, 1, 2, 3, 4, 5       -> "새벽";
            case 6, 7, 8, 9, 10, 11     -> "오전";
            case 12, 13, 14, 15, 16, 17, 18 -> "오후";
            case 19, 20, 21, 22, 23     -> "밤";
            default -> "오류";
        };

        System.out.print("구분: " + result);
    }
}
