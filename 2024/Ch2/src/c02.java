import java.util.Scanner;

public class c02 {
    public void class02() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("생일을 입력하세요 >> ");
        int birthday = scanner.nextInt();
        int year = birthday / 10000;
        int month = (birthday % 10000) /100 ; // 처음엔 (birthday - (year * 10000)) /100 ; 이랬는데 수정
        int day = birthday % 100;//(birthday - (year * 10000) - (month * 100));
        System.out.printf("%d년 %d월 %d일", year, month, day);

        scanner.close();
    }
}