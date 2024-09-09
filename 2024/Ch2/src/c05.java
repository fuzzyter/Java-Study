import java.util.Scanner;

public class c05 {
    public void class05() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("학생1 >> ");
        String name1 = scanner.next();
        int late1 = scanner.nextInt();
        int no1 = scanner.nextInt();
        System.out.printf("학생2 >> ");
        String name2 = scanner.next();
        int late2 = scanner.nextInt();
        int no2 = scanner.nextInt();

        int minus1 = late1 * 3 + no1 * 8;
        int minus2 = late2 * 3 + no2 * 8;

        System.out.printf("%s의 감점은 %d, %s의 감점은 %d\n", name1, minus1, name2, minus2);

        if(minus1<minus2){
            System.out.printf("%s의 출석 점수가 더 높음. %s 출석 점수는 %d\n", name1, name1, 100 - minus1);
        } else if (minus2<minus1) {
            System.out.printf("%s의 출석 점수가 더 높음. %s 출석 점수는 %d\n", name2, name2, 100 - minus2);
        }
        else {
            System.out.printf("점수 동일\n");
        }

        scanner.close();
    }
}
