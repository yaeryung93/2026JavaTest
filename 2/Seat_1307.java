import java.util.Scanner;
public class Seat_1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yesCount = 0, noCount = 0;
        int height, width;
        System.out.print("좌석 크기 : ");
        int n = sc.nextInt();
        String[][] seat = new String[n][n];
        System.out.println("=== 극장 좌석 예약 시스템 ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0){
                    seat[i][j] = "[ R ]";
                } 
		        else{
                    seat[i][j] = "[ O ]";
                }
                System.out.print(seat[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (seat[i][j].equals("[ R ]") || seat[i][j].equals("[ O ]")) {
                    yesCount++;
                }
                else {
                    noCount++;
                }
            }
        }
        System.out.printf("빈 자리 : %d개  |  예약된 자리 : %d개%n%n", yesCount, noCount);

        while (true) {
            System.out.print("1.예약\t2.취소\t3.현황\t4.종료 : ");
            int select = sc.nextInt();

            if (select == 1) {
                do {
                    System.out.print("예약할 행 번호 : ");
                    width = sc.nextInt();
                    System.out.print("예약할 열 번호 : ");
                    height = sc.nextInt();
                    if (height > n || height < 1 ||  width > n || width < 1) {
                        System.out.println("[오류] 정상적인 값을 입력해주시오! (1 ~ " + n + ")");
                    } else {
                        if (width == 1) {
                            if (seat[width-1][height-1].equals("[ R ]")) {
                                seat[width-1][height-1] = "[ X ]";
                                System.out.printf("%d행 %d열 좌석 예약 완료!%n%n", width, height);
                                break;
                            }
                            else {
                                System.out.println("[오류] 이미 예약된 자리입니다. ");
                                break;

                            }
                        }
                        else {
                            if (seat[width-1][height-1].equals("[ O ]")) {
                                seat[width-1][height-1] = "[ X ]";
                                System.out.printf("%d행 %d열 좌석 예약 완료!%n%n", width, height);
                                break;
                            }
                            else {
                                System.out.println("[오류] 이미 예약된 자리입니다. ");
                                break;
                            }
                        }
                    }
                }while ((width < 1 || height < 1) || (width > n || height > n));
            }
            if (select == 2) {
                do {
                    System.out.print("취소할 행 번호 : ");
                    width = sc.nextInt();
                    System.out.print("취소할 열 번호 : ");
                    height = sc.nextInt();

                    if (height > n || height < 1 || width > n || width < 1) {
                        System.out.println("[오류] 정상적인 값을 입력해주시오! (1 ~ " + n + ")");
                    } else {
                        if (seat[width-1][height-1].equals("[ X ]")) {
                            if (width == 1) {
                                seat[width - 1][height - 1] = "[ R ]";
                                System.out.printf("%d행 %d열 좌석 취소 완료!%n%n", width, height);
                            } else {
                                seat[width - 1][height - 1] = "[ O ]";
                                System.out.printf("%d행 %d열 좌석 취소 완료!%n%n", width, height);
                            }
                        } else {
                            System.out.println("[오류] 예약하지 않은 자리 입니다. ");
                            break ;
                        }
                    }
                }  while ((width < 1 || height < 1) || (width > n || height > n));
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
                yesCount = 0;
                noCount = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (seat[i][j].equals("[ R ]") || seat[i][j].equals("[ O ]")) {
                            yesCount++;
                        }
                        else {
                            noCount++;
                        }
                    }
                }
                System.out.printf("빈 자리 : %d개  |  예약된 자리 : %d개%n%n", yesCount, noCount);
            }
            if(select == 4){
                break;
            }
        }
    }
}
