// 1307 김예령
import java.util.Scanner;
public class Reverse_1307{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("A : ");
        int A=sc.nextInt();
        System.out.print("B : ");
        int B=sc.nextInt();

        if(A>B){
            for(int i=A; i>=B; i--){
                System.out.print(i+" ");
            }
        }
        else{
            for(int i=B; i>=A; i--){
                System.out.print(i+" ");
            }
        }
    }
}