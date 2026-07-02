//1307 김예령
import java.util.Scanner;
public class ProductTest_1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product[] pro=new Product[5];
        int total=0;
        for (int i = 0; i < pro.length; i++) {
            pro[i]=new Product();
            System.out.printf("상품%d 구분 : ",(i+1));
            pro[i].type=sc.nextLine();

            System.out.printf("상품%d 상품명 : ",(i+1));
            pro[i].name=sc.nextLine();

            System.out.printf("상품%d 재고량 : ",(i+1));
            pro[i].amount=sc.nextInt();
            total+=pro[i].amount;

            System.out.printf("상품%d 단가 : ",(i+1));
            pro[i].mon=sc.nextInt();
            sc.nextLine();
        }

        System.out.println("구분  상품명  수량  단가   ");
        for (int i = 0; i < pro.length; i++) {
            pro[i].print();
        }
        System.out.printf("상품의 총 재고량 : %d",total);
    }
}
class Product{
    String type;
    String name;
    int mon;
    int amount;

    void print(){
        System.out.printf("%-4s %-5s %-4d %-5d\n",this.type,this.name,this.mon,this.amount);
    }
}
