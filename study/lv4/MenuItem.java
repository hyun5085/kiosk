package study.lv4;

public class MenuItem {
    // 속성
    private String lv4item;
    private int lv4price;
    private String lv4description;

    // 생성자
    public MenuItem(String lv4item, int lv4price, String lv4description){
        this.lv4item = lv4item;
        this.lv4price = lv4price;
        this.lv4description = lv4description;
    }

    // 게터
    public String getLv4Item() {
        return lv4item;
    }

    public int getLv4Price() {
        return lv4price;
    }

    public String getLv4Description() {
        return lv4description;
    }
}
