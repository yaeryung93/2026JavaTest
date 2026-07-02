//1307 김예령
import java.util.Scanner;
public class GoStone_1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("바둑판의 크기 : ");
        int N= sc.nextInt();
        char[][] GS=new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                GS[i][j]='.';
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(GS[i][j]+" ");
            }
            System.out.println();
        }
        int menu=0;
        int Wcnt=0;
        int Bcnt=0;
        do {
            System.out.print("1.백돌 2.흑돌 3.현황 4.종료 : ");
            menu= sc.nextInt();

            if(menu==1){
                System.out.print("백돌 놓을 행 번호 : ");
                int row= sc.nextInt();
                System.out.print("백돌 놓을 열 번호 : ");
                int column= sc.nextInt();
                if(GS[row-1][column-1]=='W' || GS[row-1][column-1]=='B')
                    System.out.println("[오류] 이미 돌이 놓인 자리입니다.");
                else{
                    System.out.printf("%d행 %d열에 백돌(W) 배치 완료!\n",row,column);
                    GS[row-1][column-1]='W';
                    Wcnt++;
                }
                System.out.println();
            }
            else if(menu==2){
                System.out.print("흑돌 놓을 행 번호 : ");
                int row= sc.nextInt();
                System.out.print("흑돌 놓을 열 번호 : ");
                int column= sc.nextInt();

                if(GS[row-1][column-1]=='W' || GS[row-1][column-1]=='B')
                    System.out.println("[오류] 이미 돌이 놓인 자리입니다.");
                else{
                    System.out.printf("%d행 %d열에 흑돌(B) 배치 완료!\n",row,column);
                    GS[row-1][column-1]='B';
                    Bcnt++;
                }
                System.out.println();
            }
            else if(menu==3) {
                for (int i = 0; i < GS.length; i++) {
                    for (int j = 0; j < GS.length; j++) {
                        System.out.print(GS[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.printf("백돌 : %d개 흑돌 : %d개\n",Wcnt,Bcnt);
                System.out.println();
            }

        }while(menu!=4);
        System.out.println("프로그램을 종료합니다.");
    }
}
