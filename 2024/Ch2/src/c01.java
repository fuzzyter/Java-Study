import java.util.Scanner;

public class c01 {
    public void class01() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("$1=1200원입니다. 달러를 입력하세요 >> ");
        int money = scanner.nextInt();
        int won = money * 1200;
        System.out.printf("$%d는 %d원입니다.", money, won);
        scanner.close();
    }
}
