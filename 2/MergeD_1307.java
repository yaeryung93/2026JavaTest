//1307 김예령
import java.util.Scanner;
public class MergeD_1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array1=new int[5];
        int[] array2=new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("배열1의 %d번방 입력 : ",i);
            array1[i]=sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("배열2의 %d번방 입력 : ",i);
            array2[i]=sc.nextInt();
        }
        System.out.print("\n배열1 데이터 : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }

        System.out.print("\n배열2 데이터 : ");
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        int[] total=new int[10];
        for (int i= 0; i <total.length; i++) {
            if(i<5)
                total[i]=array1[i];
            else
                total[i]=array2[i-5];
        }
        for (int i = 0; i < total.length; i++) {
            for (int j =(i+1); j < total.length; j++) {
                if(total[i]<total[j]){
                    int temp=total[i];
                    total[i]=total[j];
                    total[j]=temp;
                }
            }
        }
        System.out.print("\n전체 데이터(내림차순) : ");
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i]+" ");
        }

        System.out.print("\n중복 제거된 데이터 : ");
        for (int i = 0; i < total.length-1; i++) {
            if(total[i]!=total[i+1])
                System.out.print(total[i]+" ");
        }
    }
}
