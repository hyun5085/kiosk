package study.lv4;

import java.util.*;

public class Kiosk {
    private Scanner lv4scanner = new Scanner(System.in);
    private List<Menu> lv4Menu;

    public Kiosk(List<Menu> lv4Menu) {
        this.lv4Menu = lv4Menu;
    }


    public void start() {

        // 🎉 환영 메시지
        System.out.println("==============================================");
        System.out.println("🍕 안녕하세요! 스파르타 피자에 오신 것을 환영합니다!🍕");
        System.out.println("==============================================");

        // 반복문 시작
        while (true) {
            // 📋 메뉴판 출력
            System.out.println("┌────────────────────────┐");
            System.out.println("│   📌  메뉴 선택 📌      │");
            System.out.println("└────────────────────────┘");

            // Main 에서 정의
            for (int i = 0; i < lv4Menu.size(); i++) {
                System.out.println((i + 1) + ". " + lv4Menu.get(i).getLv4Category());
            }

            System.out.println("0. 프로그램 종료");
            int lv4selectNumber;
                // 🛒 메뉴 선택 안내
            while (true) {
                try {
                    System.out.print("👉 선택하실 메뉴의 번호를 입력해주세요: ");
                    lv4selectNumber = lv4scanner.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("❌ 오류: 숫자를 입력해주세요!"); // 에러 메시지 출력
                    lv4scanner.nextLine(); // 버퍼에 남아 있는 잘못된 입력 제거
                }
            }

            if (lv4selectNumber == 0) {
                System.out.println("🖥️ 프로그램을 종료합니다.");
                break;
            } else if (lv4selectNumber > 0 && lv4selectNumber <= lv4Menu.size()) {
                showMenu(lv4Menu.get(lv4selectNumber - 1));

            } else {
                System.out.println("⚠️올바른 번호를 입력해주세요 :");
                continue;
            }



//            switch (lv4selectNumber) {
//                case 0:
//                    System.out.println("🖥️ 프로그램을 종료합니다.");
//                    return;
//                case 1:
//                    showMenu(lv4Menu.get(lv4selectNumber - 1));
//                    break;
//                case 2:
//                    showMenu(lv4Menu.get(lv4selectNumber - 1));
//                    break;
//                default:
//                    System.out.println("⚠️ 올바른 번호를 입력해주세요.");
//                    continue;
//            }
        }
    }

    public void showMenu(Menu lv4Menu){
        System.out.println(lv4Menu.getLv4Category());
        System.out.println("0. 뒤로 가기");
        List<MenuItem> lv4Item = lv4Menu.getLv4MenuItem();

        // 메뉴 보여주기
        for (int i = 0; i < lv4Item.size(); i++){
            System.out.println((i+1)+". "+lv4Item.get(i).getLv4Item()+" │ "+lv4Item.get(i).getLv4Price()+" │ "+lv4Item.get(i).getLv4Description());
        }

        while(true) {
            System.out.println("주문하실 메뉴의 번호를 입력해주세요.:");
            int lv4selectItem;
            while (true) {
                try {
                    lv4selectItem = lv4scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("❌ 오류: 숫자를 입력해주세요!");
                    lv4scanner.nextLine(); // 잘못된 입력 제거
                }
            }

            if (lv4selectItem > 0 && lv4selectItem <= lv4Item.size()) {
                System.out.println("주문하신 메뉴는 " + lv4Item.get(lv4selectItem - 1).getLv4Item() + " 입니다.\n");
                break;
            } else if (lv4selectItem == 0) {
                break;
            } else {
                System.out.println("⚠️ 잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

    }
}

