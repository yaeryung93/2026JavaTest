import java.util.*;
class Member{
    String name;
    int age;
    int point;

    void setAge(int age) {
        if (age < 0) {
            System.out.println("유효하지 않는 나이입니다. ");
        } 
	    else {
            this.age = age;
        }
    }

    String getInfo() {
        return ("이름: " + name + " | 나이: " + age + "세 | 포인트: " + point);
    }
}

public class Member_1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member member = new Member();
        System.out.print("이름 : ");
        member.name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        member.setAge(age);
        System.out.print("포인트 : ");
        member.point = sc.nextInt();

        String info = member.getInfo();

        System.out.println(info);
        System.out.print("변경할 나이 : ");
        age = sc.nextInt();
        member.setAge(age);

        info = member.getInfo();
        System.out.println(info);
    }
}
