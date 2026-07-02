// 1307 김예령
import java.util.Scanner;
public class Vote_1307{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age=sc.nextInt();
        if(age>=18) System.out.println("vote");
        else System.out.println("no vote");

        if(age>=65) System.out.println("free");
        else System.out.println("paid");
    }
}
