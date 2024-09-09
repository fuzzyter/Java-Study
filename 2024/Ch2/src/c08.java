import java.util.Scanner;

public class c08 {
    public void class08() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("연산 입력 >> ");
        double num1 = scanner.nextDouble();
        String op = scanner.next();
        double num2 = scanner.nextDouble();

        double result;

        switch (op){
            case "곱하기":
                result = num1 * num2;
                break;
            case "나누기":
                if(num2==0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                result = num1 / num2;
                break;
            case "더하기":
                result = num1 + num2;
                break;
            case "빼기":
                result = num1 - num2;
                break;
            default:
                System.out.println("사칙연산이 아닙니다.");
                return;
        }
        System.out.print(num1+" "+op+" "+num2+"의 계산 결과는 "+result);
        scanner.close();
    }
}
