import java.util.Scanner;

public class c03 {
    public void class03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
        System.out.printf("떡볶이 몇 인분 >> ");
        int tbk = scanner.nextInt();
        System.out.printf("김말이 몇 인분 >> ");
        int kmr = scanner.nextInt();
        System.out.printf("쫄면 몇 인분 >> ");
        int jjm = scanner.nextInt();
        int sum = (tbk * 2000) + (kmr * 1000) + (jjm * 3000);
        System.out.printf("전체 금액은 %d원입니다.", sum);

        scanner.close();
    }
}
