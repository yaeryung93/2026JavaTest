// 1307 김예령
import java.util.Scanner;
public class MaxExclude_1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("점수 개수 : ");
        int N=sc.nextInt();
        double[] num=new double[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("%d번째 점수 : ",(i+1));
            num[i]=sc.nextDouble();
        }
        System.out.print("입력 점수 : ");
        for (int i = 0; i <N; i++) {
            System.out.print(num[i]+" ");
        }
        int MaxIdx=0;
        for (int i = 1; i < N; i++) {
            if(num[i]>num[MaxIdx])
                MaxIdx=i;
        }
        double sum=0;
        System.out.println("\n제거된 최고점 : "+num[MaxIdx]);
        for (int i = 0; i < N; i++) {
            if(i==MaxIdx) continue;
            else sum+=num[i];
        }
        System.out.println("최고점 제외 합계 : "+sum);
        System.out.printf("최고점 제외 평균 : %.2f",sum/(N-1));
    }
}
