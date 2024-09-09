import java.util.Scanner;

public class c09 {
    public void class09() {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("점(x,y)의 좌표 입력 >> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (10 < x && x < 200 && 10 < y && y < 300) {
            System.out.printf("("+x+", "+y+")는 사각형 안에 있습니다.%n");
        }
        else if (10 <= x && x <= 200 && 10 <= y && y <= 300) {
            System.out.printf("("+x+", "+y+")는 사각형 선 상에 있습니다.%n");
        }
        else {
            System.out.printf("("+x+", "+y+")는 사각형 밖에 있습니다.%n");
        }

        scanner.close();

    }
}
