import java.util.*;

class Movie{
    String name;
    String deractorName;
    int time;

    Movie(String name, String deractorName, int time) {
        this.name = name;
        this.deractorName = deractorName;
        this.time = time;
    }

    String getInfo() {
        if (name.length() >= 5) {
            if (deractorName.length() > 5) {
                return name + "\t" + deractorName + "\t" + time;
            }
            else {
                return name + "\t" + deractorName + "\t\t\t" + time;
            }

        } else {
            if (deractorName.length() > 5) {
                return name + "\t\t" + deractorName + "\t" + time;
            }
            else {
                return name + "\t\t" + deractorName + "\t\t\t" + time;
            }
        }
    }
}

public class MovieTest_1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String name = null;
        String deractorName = null;
        int time = 0;
        Movie[] movie = new Movie[5];
        String[] info = new String[5];
        for (int i = 0; i < info.length; i++) {
            System.out.printf("영화%d 제목 : ", i+1);
            name = sc.nextLine();
            System.out.printf("영화%d 감독명 : ", i+1);
            deractorName = sc.nextLine();
            System.out.printf("영화%d 상영시간(분) : ", i+1);
            time = sc.nextInt();
            sc.nextLine();
            movie[i] = new Movie(name, deractorName, time);
            info[i] = movie[i].getInfo();
            max += movie[i].time;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("영화제목\t\t감독명\t\t\t상영시간");
        for (int i = 0; i < 5; i++) {
            System.out.println(info[i]);
        }
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("총 상영시간 : " + max + "분");
    }
}
