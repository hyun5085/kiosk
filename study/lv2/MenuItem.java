package study.lv2;

// MenuItem 클래스 생성하기
public class MenuItem {

    //설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 Item만 관리합니다.
    //클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.
    // 속성
    private String lv2item;
    private int lv2price;
    private String lv2description;

    public MenuItem(String lv2item, int lv2price, String lv2description){
        this.lv2item = lv2item;
        this.lv2price = lv2price;
        this.lv2description = lv2description;
    }

    public String getLv2Item() {
        return lv2item;
    }

    public int getLv2Price() {
        return lv2price;
    }

    public String getLv2Description() {
        return lv2description;
    }


}
