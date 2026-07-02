// 1307 김예령
import java.util.Scanner;
public class PassAverage_1307{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("학생 수 : ");
        int N=sc.nextInt();
        double ave=0;
        int count=0;
        for(int i=1; i<=N; i++){
            System.out.print(i+"번 학생 점수 : ");
            int grade=sc.nextInt();
            if(grade>=60){
                System.out.println(i+"번 학생 : "+grade+"점 - 합격");
                ave+=grade;
                count++;
            }
            else {
                System.out.println(i+"번 학생 : "+grade+"점 - 불합격");
            }
        }
        System.out.println("----------------");
        if(ave==0.0) System.out.print("합격자 평균 : -1");
        else System.out.print("합격자 평균 : "+(ave/count));
    }
}