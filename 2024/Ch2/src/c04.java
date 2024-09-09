import java.util.Scanner;

public class c04 {
    public void class04() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("여행지 >> ");
        String where = scanner.nextLine();
        System.out.printf("인원수 >> ");
        int people = scanner.nextInt();
        System.out.printf("숙박일 >> ");
        int day = scanner.nextInt();
        System.out.printf("1인당 항공료 >> ");
        int planeMoney = scanner.nextInt();
        System.out.printf("1방 숙박비 >> ");
        int roomMoney = scanner.nextInt();

        int room;

        if (people % 2 == 0){
            room = people / 2;
        }
        else {
            room = people / 2 + 1;
        }

        int sum = (planeMoney * people * 2) + (room * roomMoney);

        System.out.printf("%d명의 %s %d박 %d일 여행에는 방이 %d개 필요하며 경비는 %d원입니다.", people, where, day, day+1, room, sum);
        scanner.close();
    }
}
