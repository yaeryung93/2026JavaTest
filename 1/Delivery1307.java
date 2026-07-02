// 1307 김예령
import java.util.Scanner;
public class Delivery1307 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("거리 : ");
        int dist = scan.nextInt();

        System.out.print("지역 코드 (1: 일반 / 2: 도서산간) : ");
        int code = scan.nextInt();

        if (dist <= 0 || !(code == 1 || code == 2)) System.out.println("잘못된 입력");
        else {
            int fare = dist * 500;
            if(code == 2) fare += 3500;
            int a = fare / 1000;
            int b = fare % 1000;
            System.out.println("택배요금 : " + (a == 0 ? "" : a + ",") + (b == 0 ? "000" : b));
        }
    }
}
