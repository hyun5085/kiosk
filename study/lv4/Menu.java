package study.lv4;

import java.util.List;


// Menu 클래스 생성하기
public class Menu {

    //  버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함
    //List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
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
