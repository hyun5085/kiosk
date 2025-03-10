package study.lv3;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> lv3pizzaList = new ArrayList<>();
        List<MenuItem> lv3sideList = new ArrayList<>();

        lv3pizzaList.add(new MenuItem("씨푸드킹\t\t", 23500, "통새우와 통관자. 최강 씨푸드의 만남"));
        lv3pizzaList.add(new MenuItem("립스테이크 \t", 23500, "180g 갈비맛 스테이크가 통으로"));
        lv3pizzaList.add(new MenuItem("수퍼 슈프림 \t", 21500, "토마토소스, 야채, 고기, 모짜렐라의 환상 콤비!"));
        lv3pizzaList.add(new MenuItem("직화 불고기 \t", 21500, "정통불고기, 야채, 모짜렐라를 화끈하게 구운 피자"));
        lv3pizzaList.add(new MenuItem("베이컨 포테이토", 21500, "포테이토 큐브, 훈연베이컨에 타르타르소스로 마무리!"));
        lv3pizzaList.add(new MenuItem("갈릭버터 쉬림프", 21900, "통새우와 버터갈릭의 향긋하고 고소한 풍미가 가득!"));
        lv3pizzaList.add(new MenuItem("치즈 킹\t\t", 21900, "모짜렐라 치즈가 2배 이상 들어간 치즈 끝판왕"));
        lv3sideList.add(new MenuItem("바삭 감자\t", 1800, "크런치한 바삭함이 일품인 감자튀김"));
        lv3sideList.add(new MenuItem("어니언 링\t", 1800, "양파의 달콤함을 그대로 담아 튀겨낸 바삭한 어니언링"));
        lv3sideList.add(new MenuItem("베스트 샘플러\t", 7500, "윙3, 봉3, 어니언링4, 바삭한 감자와 그린살사&갈릭파마산 소스"));
        lv3sideList.add(new MenuItem("반반 샐러드\t", 3500, "고구마 샐러드, 토마토 후실리. 반반 제공되는 샐러드"));
        lv3sideList.add(new MenuItem("그린 샐러드\t", 3500, "신선한 채소에 레몬 갈릭 드레싱으로 상큼한 샐러드!"));

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
