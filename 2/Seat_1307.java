import java.util.Scanner;
public class Seat_1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 0, width = 0;
        System.out.print("좌석 크기 : ");
        int n = sc.nextInt();
        String[][] seat = new String[n][n];
        System.out.println("=== 극장 좌석 예약 시스템 ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    seat[i][j]= "[ R ]";
                } 
                else {
                    seat[i][j] = "[ O ]";
                }
                System.out.print(seat[i][j]);
            }
            System.out.println();
        }
        while (true) {
            System.out.print("1.예약\t2.취소\t3.현황\t4.종료 : ");
            int select = sc.nextInt();

            if (select == 1) {
                System.out.print("예약할 행 번호 : ");
                width = sc.nextInt();
                System.out.print("예약할 열 번호 : ");
                height = sc.nextInt();
                System.out.printf("%d행 %d열 좌석 예약 완료!%n%n", width, height);
                seat[width-1][height-1] = "[ X ]";
            }
            if (select == 2) {
                seat[width-1][height-1] = "[ O ]";
                System.out.println();
            }
            if (select == 3) {
                System.out.println("=== 극장 좌석 예약 시스템 ===");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(seat[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            if (select == 4) {
                break;
            }
        }
    }
}
