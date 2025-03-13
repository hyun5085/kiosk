package study.lv4;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> lv4PizzaList = new ArrayList<>();
        lv4PizzaList.add(new MenuItem("씨푸드킹", 23500, "통새우와 통관자. 최강 씨푸드의 만남"));
        lv4PizzaList.add(new MenuItem("립 스테이크", 23500, "180g 갈비맛 스테이크가 통으로"));
        lv4PizzaList.add(new MenuItem("수퍼 슈프림", 21500, "토마토소스, 야채, 고기, 모짜렐라의 환상 콤비!"));
        lv4PizzaList.add(new MenuItem("직화 불고기", 21500, "정통불고기, 야채, 모짜렐라를 화끈하게 구운 피자"));
        lv4PizzaList.add(new MenuItem("베이컨 포테이토", 21500, "포테이토 큐브, 훈연베이컨에 타르타르소스로 마무리!"));
        lv4PizzaList.add(new MenuItem("갈릭버터 쉬림프", 21900, "통새우와 버터갈릭의 향긋하고 고소한 풍미가 가득!"));
        lv4PizzaList.add(new MenuItem("치즈 킹", 21900, "모짜렐라 치즈가 2배 이상 들어간 치즈 끝판왕"));

        List<MenuItem> lv4SideList = new ArrayList<>();
        lv4SideList.add(new MenuItem("바삭 감자", 1800, "크런치한 바삭함이 일품인 감자튀김"));
        lv4SideList.add(new MenuItem("어니언 링", 1800, "양파의 달콤함을 그대로 담아 튀겨낸 바삭한 어니언링"));
        lv4SideList.add(new MenuItem("베스트 샘플러", 7500, "윙3, 봉3, 어니언링4, 바삭한 감자와 그린살사&갈릭파마산 소스"));
        lv4SideList.add(new MenuItem("반반 샐러드", 3500, "고구마 샐러드, 토마토 후실리. 반반 제공되는 샐러드"));
        lv4SideList.add(new MenuItem("그린 샐러드", 3500, "신선한 채소에 레몬 갈릭 드레싱으로 상큼한 샐러드!"));

        Menu lv4PizzaCategory = new Menu("피자",lv4PizzaList);
        Menu lv4SideCategory = new Menu("사이드",lv4SideList);

        // Kiosk Class - Start 함수
        // For 문을 쓰기 위한
        List<Menu> lv4AllMenus = new ArrayList<>();
        lv4AllMenus.add(lv4PizzaCategory);
        lv4AllMenus.add(lv4SideCategory);

        Kiosk kiosk = new Kiosk(lv4AllMenus);

        kiosk.start();



    }
}
