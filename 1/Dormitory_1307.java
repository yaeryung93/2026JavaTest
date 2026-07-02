// 1307 김예령
import java.util.Scanner;
public class Dormitory_1307{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("이름 : ");
        String name=sc.nextLine();
        System.out.print("학과명 : ");
        String sd=sc.next();
        System.out.print("전화번호 : ");
        String num=sc.next();
        System.out.print("집에서 학교까지의 거리 : ");
        Double km=sc.nextDouble();
        System.out.println();

        final double len=20.0;
        System.out.println("<< "+name+"("+sd+") 학생정보 >>");
        System.out.println("연락처 : "+num);
        System.out.println("집까지의 거리 : "+km);
        if(km>len) System.out.println("기숙사 입소 대상자");
        else System.out.println("기숙사 입소 대상자 아님");
    }
}
