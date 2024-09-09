import java.util.Scanner;

public class c12 {
    public void class12() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 상태 입력 >> ");
        int status = scanner.nextInt();

        if ((status & 0b10000000) == 0) {
            System.out.print("자동차는 정지 상태이고 ");
        } else {
            System.out.print("자동차는 달리는 상태이고 ");
        }

        if ((status & 0b01000000) == 0) {
            System.out.print("에어컨이 꺼진 상태이고 ");
        } else {
            System.out.print("에어컨이 켜진 상태이고 ");
        }

        System.out.print("온도는 "+(status & 0b00111111)+"도이다.");

        scanner.close();

    }
}
