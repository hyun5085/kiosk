package study.lv3;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> lv3pizzaList = new ArrayList<>();
        List<MenuItem> lv3sideList = new ArrayList<>();



        // 🎉 환영 메시지
        System.out.println("==============================================");
        System.out.println("🍕 안녕하세요! 스파르타 피자에 오신 것을 환영합니다!🍕");
        System.out.println("==============================================");

        while(true) {
            // 📋 메뉴판 출력
            System.out.println("┌────────────────────────┐");
            System.out.println("│   📌  메뉴 선택 📌      │");
            System.out.println("├──────────┬─────────────┤");
            System.out.println("│\t번호\t   │\t메 뉴\t │");
            System.out.println("├──────────┼─────────────┤");
            System.out.println("│\t1\t   │\t피 자\t │");
            System.out.println("│\t2\t   │\t사이드\t │");
//        System.out.println("│\t3\t   │\t음료수\t │");
//        System.out.println("│\t4\t   │\t주 류\t │");
            System.out.println("│\t0\t   │\t종 료\t │");
            System.out.println("└──────────┴─────────────┘");

            // 🛒 메뉴 선택 안내
            System.out.print("👉 선택하실 메뉴의 번호를 입력해주세요: ");

            // 입력값 받기
            int lv3selectNumber = scanner.nextInt();


            switch (lv3selectNumber) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                    for (int i = 0; i < lv3pizzaList.size(); i++) {
                        System.out.println("│ " + (i + 1) + "\t│\t" + lv3pizzaList.get(i).getLv3Item() + "\t│\t￦" + lv3pizzaList.get(i).getLv3Price() + "\t│\t" + lv3pizzaList.get(i).getLv3Description());
                    }
                    while (true) {
                        System.out.println("주문하실 피자의 번호를 입력해주세요:");
                        int lv3selectPizza = scanner.nextInt();

                        if (lv3selectPizza >= 0 && lv3selectPizza <= lv3pizzaList.size()) {
                            System.out.println("주문하신 메뉴는 " + lv3pizzaList.get(lv3selectPizza - 1).getLv3Item() + " 피자 입니다.");
                            break;
                        } else {
                            System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                            continue;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < lv3sideList.size(); i++) {
                        System.out.println("│ " + (i + 1) + "\t│\t" + lv3sideList.get(i).getLv3Item() + "\t│\t￦" + lv3sideList.get(i).getLv3Price() + "\t│\t" + lv3sideList.get(i).getLv3Description());
                    }
                    while (true) {
                        System.out.println("주문하실 사이드의 번호를 입력해주세요:");
                        int lv3selectside = scanner.nextInt();

                        if (lv3selectside >= 0 && lv3selectside <= lv3sideList.size()) {
                            System.out.println("주문하신 메뉴는 " + lv3sideList.get(lv3selectside - 1).getLv3Item() + "입니다.");
                            break;

                        } else {
                            System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                            continue;
                        }
                    }
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }
}
