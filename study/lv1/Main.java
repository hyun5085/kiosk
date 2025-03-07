package study.lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SelectMenu> pizzaList = new ArrayList<>();

        pizzaList.add(new SelectMenu("씨푸드킹\t", 23500, "통새우와 통관자. 최강 씨푸드의 만남"));
        pizzaList.add(new SelectMenu("립스테이크\t", 23500, "180g 갈비맛 스테이크가 통으로"));
        pizzaList.add(new SelectMenu("수퍼 슈프림\t", 21500, "토마토소스, 야채, 고기, 모짜렐라의 환상 콤비!"));
        pizzaList.add(new SelectMenu("직화 불고기\t", 21500, "정통불고기, 야채, 모짜렐라를 화끈하게 구운 피자"));
        pizzaList.add(new SelectMenu("베이컨 포테이토", 21500, "포테이토 큐브, 훈연베이컨에 타르타르소스로 마무리!"));
        pizzaList.add(new SelectMenu("갈릭버터 쉬림프", 21900, "통새우와 버터갈릭의 향긋하고 고소한 풍미가 가득!"));
        pizzaList.add(new SelectMenu("치즈 킹\t", 21900, "모짜렐라 치즈가 2배 이상 들어간 치즈 끝판왕"));

        // 🎉 환영 메시지
        System.out.println("==============================================");
        System.out.println("🍕 안녕하세요! 스파르타 피자에 오신 것을 환영합니다!🍕");
        System.out.println("==============================================");

        // 📋 메뉴판 출력
        System.out.println("┌────────────────────────┐");
        System.out.println("│   📌  메뉴 선택 📌      │");
        System.out.println("├──────────┬─────────────┤");
        System.out.println("│\t번호\t   │\t메 뉴\t │");
        System.out.println("├──────────┼─────────────┤");
        System.out.println("│\t1\t   │\t피 자\t │");
        System.out.println("│\t2\t   │\t사이드\t │");
        System.out.println("│\t3\t   │\t음료수\t │");
        System.out.println("│\t4\t   │\t주 류\t │");
        System.out.println("└──────────┴─────────────┘");

        // 🛒 메뉴 선택 안내
        System.out.print("👉 선택하실 메뉴의 번호를 입력해주세요: ");

        // 입력값 받기
        int selectNumber = scanner.nextInt();
        switch (selectNumber){
            case 1:
                for (SelectMenu pizzaMenu : pizzaList) {
                    pizzaMenu.printMenu(); //
                }
        }


        // ✨ 선택한 메뉴 출력
        

        // 리소스 닫기
        scanner.close();
    }
}
