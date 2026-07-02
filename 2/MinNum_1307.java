//1307 김예령
import java.util.Scanner;
public class MinNum_1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("배열의 크기 : ");
        int N=sc.nextInt();
        int[][] array=new int[N][N];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*100+1);
            }
        }
        System.out.printf("\n%d X %d 배열의 데이터 : \n",N,N);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int min=array[0][0];
        int MinIdx1=0;
        int MinIdx2=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]<min){
                    min=array[i][j];
                    MinIdx1=i;
                    MinIdx2=j;
                }
            }
        }
        System.out.println("최솟값 : "+min);
        System.out.printf("최솟값의 위치 : (%d, %d)",MinIdx1,MinIdx2);
    }
}
