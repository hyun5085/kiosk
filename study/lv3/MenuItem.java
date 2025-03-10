package study.lv3;

public class MenuItem {

    // 속성
    private String lv3item;
    private int lv3price;
    private String lv3description;

    public MenuItem(String lv3item, int lv3price, String lv3description){
        this.lv3item = lv3item;
        this.lv3price = lv3price;
        this.lv3description = lv3description;
    }

    public String getLv3Item() {
        return lv3item;
    }

    public int getLv3Price() {
        return lv3price;
    }

    public String getLv3Description() {
        return lv3description;
    }


}
