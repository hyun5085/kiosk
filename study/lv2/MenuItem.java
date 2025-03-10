package study.lv2;

public class MenuItem {

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
