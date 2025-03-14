package study.lv3;

import java.util.*;

public class Kiosk {
    private Scanner lv3scanner = new Scanner(System.in);
    private List<MenuItem> lv3PizzaList = new ArrayList<>();
    private List<MenuItem> lv3SideList = new ArrayList<>();

    // 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스
    // MenuItem을 관리하는 리스트가 필드로 존재
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
            int lv3selectNumber;
            while (true) {
                try {
                    // 🛒 메뉴 선택 안내
                    System.out.print("👉 선택하실 메뉴의 번호를 입력해주세요: ");
                    lv3selectNumber = lv3scanner.nextInt();
                    break; // 정상 입력이면 루프 종료
                } catch (InputMismatchException e) {
                    System.out.println("❌ 오류: 숫자를 입력해주세요!"); // 에러 메시지 출력
                    lv3scanner.nextLine(); // 잘못된 입력 제거
                }
            }

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
            int lv3selectItem;
            while (true) {
                try {
                    lv3selectItem = lv3scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("❌ 오류: 숫자를 입력해주세요!");
                    lv3scanner.nextLine(); // 잘못된 입력 제거
                }
            }

            if (lv3selectItem > 0 && lv3selectItem <= menuList.size()) { // 0이 아니라 1부터 시작
                System.out.println("주문하신 메뉴는 " + menuList.get(lv3selectItem - 1).getLv3Item() + " 입니다.");
                break;

                // 0을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다.
            } else if (lv3selectItem == 0){
                return;
            } else{
                System.out.println("⚠️ 잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }



}

