package study.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private String lv4Category;
    private List<MenuItem> lv4MenuItem;

    // 생성자
    public Menu(String lv4Category, List<MenuItem> lv4MenuItem){
        this.lv4Category = lv4Category;
        this.lv4MenuItem = lv4MenuItem;
    }

    // 게터
    public String getLv4Category(){
        return lv4Category;
    }

    public List<MenuItem> getLv4MenuItem() {
        return lv4MenuItem;
    }
}
