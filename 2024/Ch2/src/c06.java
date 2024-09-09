import java.util.Scanner;

public class c06 {
    public void class06() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("나이를 입력하세요 >> ");
        int age = scanner.nextInt();

        if(age<=0){
            System.out.println("나이는 양수로만 입력하세요.");
            return;
        }

        int red = age / 10;
        int blue = age % 10 / 5;
        int yellow = age % 5;
        System.out.printf("빨간 초 %d개, 파란 초 %d개, 노란 초 %d개. 총 %d개가 필요합니다.", red, blue, yellow, red+blue+yellow);

        scanner.close();
    }
}
