//1307 김예령
import java.util.Scanner;
public class Delivery_1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("수령인 : ");
        Delivery div=new Delivery();
        div.setRecipient(sc.nextLine());
        System.out.print("요금 : ");
        div.setFee(sc.nextInt());
        System.out.print("무게 : ");
        div.setWeight(sc.nextInt());
        div.getInfo();
        System.out.print("변경할 요금 : ");
        div.setFee(sc.nextInt());
        div.getInfo();
    }
}
class Delivery{
    private String recipient;
    private int fee;
    private int weight;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        if(fee<0) System.out.println("유효하지 않은 요금입니다.");
        else{
            this.fee = fee;
        }
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    String getInfo(){
        return "수령인: "+this.recipient+" | 요금: "+this.fee+"원 | 무게: "+this.weight+"kg\n";
    }
    void print(){
        System.out.printf("수령인: %s | 요금: %d원 | 무게: %dkg\n",this.recipient,this.fee,this.weight);
}
