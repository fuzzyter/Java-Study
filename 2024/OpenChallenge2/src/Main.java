import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String start = "계속";
        while (start.equals("계속")){
            System.out.printf("철수 >> ");
            String player1 = scanner.next();
            System.out.printf("영희 >> ");
            String player2 = scanner.next();

            if (player1.equals(player2)) {
                System.out.println("비겼습니다.");
            }
            else if(player1.equals("가위")){
                if(player2.equals("바위"))
                    System.out.println("영희가 이겼습니다.");
                else if (player2.equals("보")) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if(player1.equals("바위")){
                if(player2.equals("보"))
                    System.out.println("영희가 이겼습니다.");
                else if (player2.equals("가위")) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if(player1.equals("보")){
                if(player2.equals("가위"))
                    System.out.println("영희가 이겼습니다.");
                else if (player2.equals("바위")) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
            System.out.println("\n계속하려면 '계속'을, 그만하려면 '그만'을 입력해 주세요.");
            System.out.printf(">> ");
            start = scanner.next();
            System.out.printf("\n");
            if(!start.equals("계속")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}