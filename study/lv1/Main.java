package study.lv1;

import java.util.Scanner;

// Lv 1. 기본적인 키오스크를 프로그래밍해보자
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // 피자 메뉴 출력, 실행시 햄버거 메뉴가 표시
            System.out.println("[ PIZZA MENU ]");
            System.out.println("1. 씨푸드킹\t\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("2. 립스테이크\t\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("3. 수퍼 슈프림\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("4. 직화 불고기\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("5. 베이컨 포테이토\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("6. 갈릭버터 쉬림프\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("7. 치즈 킹\t\t| W 23500 | 통새우와 통관자. 최강 씨푸드의 만남");
            System.out.println("0. \t종\t료\t| 프로그램을 종료합니다.");
            System.out.println("\n주문하실 Pizza를 선택해주세요.");

            // 피자 메뉴 선택,  Scanner로 숫자를 입력받아서 메뉴를 선택
            int sc = scanner.nextInt();


            // 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성
            // 반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료
            switch (sc) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                    System.out.println("씨푸드킹 피자를 주문하셨습니다.");
                    return;
                case 2:
                    System.out.println("립스테이크 피자를 주문하셨습니다.");
                    return;
                case 3:
                    System.out.println("수퍼 슈프림 피자를 주문하셨습니다.");
                    return;
                case 4:
                    System.out.println("직화 불고기 피자를 주문하셨습니다.");
                    return;
                case 5:
                    System.out.println("베이컨 포테이토 피자를 주문하셨습니다.");
                    return;
                case 6:
                    System.out.println("갈릭버터 쉬림프 피자를 주문하셨습니다.");
                    return;
                case 7:
                    System.out.println("치즈 킹 피자를 주문하셨습니다.");
                    return;
                default:
                    System.out.println("주문하실 번호를 잘못 입력하셨습니다. 다시 입력해주세요");
                    continue;
            }
        }
    }
}
