import java.util.*;
public class MinExclude_1307{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 10000.0;
        double sum = 0.0;
        double avg = 0.0;
        int cnt = 0;
        System.out.print("점수 개수 : ");
        int N = sc.nextInt();

        double[] scores = new double[N];
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번째 점수 : ");
            scores[i] = sc.nextDouble();
        }

        System.out.print("입력된 점수 : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (min>scores[i]) {
                min=scores[i];
            }
        }
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]==min) {
                scores[i]=0;
                cnt += 1;
                break;
            } else {
                continue;
            }
        }
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg=sum/(scores.length-cnt);

        System.out.println("제거된 최솟값 : " + min);
        System.out.printf("최솟값 제외 합계 : %.1f%n", sum);
        System.out.printf("최솟값 제외 평균 : %.2f%n", avg);
        sc.close();
    }
}