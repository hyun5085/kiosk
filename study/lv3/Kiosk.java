package study.lv3;

import java.util.*;

public class Kiosk {
    private Scanner lv3scanner = new Scanner(System.in);
    private List<MenuItem> lv3PizzaList = new ArrayList<>();
    private List<MenuItem> lv3SideList = new ArrayList<>();

    public Kiosk(List<MenuItem> lv3PizzaList, List<MenuItem> lv3SideList){
        this.lv3PizzaList = lv3PizzaList;
        this.lv3SideList = lv3SideList;
    }


    public void start(){

        while(true) {

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
//        System.out.println("│\t3\t   │\t음료수\t │");
//        System.out.println("│\t4\t   │\t주 류\t │");
            System.out.println("│\t0\t   │\t종 료\t │");
            System.out.println("└──────────┴─────────────┘");

            // 🛒 메뉴 선택 안내
            System.out.print("👉 선택하실 메뉴의 번호를 입력해주세요: ");
            int lv3selectNumber = lv3scanner.nextInt();

            switch (lv3selectNumber) {
                case 0:
                    System.out.println("🛑 프로그램을 종료합니다.");
                    return;
                case 1:
                    lv3ShowMenu(lv3PizzaList, "🍕 피자 메뉴");
                    break;
                case 2:
                    lv3ShowMenu(lv3SideList, "🍟 사이드 메뉴");
                    break;
                default:
                    System.out.println("⚠️ 올바른 번호를 입력해주세요.");
                    continue;
            }
        }
    }

    public void lv3ShowMenu(List<MenuItem> menuList, String lv3Title) {
        System.out.println("[ "+ lv3Title+ " ]");
        System.out.println("0. 뒤로 가기");
        for (int i = 0; i < menuList.size(); i++) {
            MenuItem item = menuList.get(i);
            System.out.println((i + 1) + ". " + item.getLv3Item() + " - ￦" + item.getLv3Price() + " | " + item.getLv3Description());
        }
        while (true) {
            System.out.println("주문하실 메뉴의 번호를 입력해주세요:");
            int lv3selectItem = lv3scanner.nextInt();

            if (lv3selectItem > 0 && lv3selectItem <= menuList.size()) { // 0이 아니라 1부터 시작
                System.out.println("주문하신 메뉴는 " + menuList.get(lv3selectItem - 1).getLv3Item() + " 입니다.");
                break;
            } else if (lv3selectItem == 0){
                return;
            } else{
                System.out.println("⚠️ 잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }



}

