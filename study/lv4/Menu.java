package study.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private String lv4Category;
    private List<MenuItem> lv4Item;


    // 생성자
    public Menu(String lv4Category, List<MenuItem> lv4Item){
        this.lv4Category = lv4Category;
        this.lv4Item = lv4Item;
    }

    // 게터
    public String getLv4Category(){
        return lv4Category;
    }
    // 게터
    public List<MenuItem> getLv4Item(){
        return lv4Item;
    }


}
