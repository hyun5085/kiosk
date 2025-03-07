package study.lv1;

public class SelectMenu {

    // 속성
    private String pizza;
    private int price;
    private String description;

    public  SelectMenu (String pizza, int price, String description){
        this.pizza = pizza;
        this.price = price;
        this.description = description;
    }

    public String getPizza() {
        return pizza;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void printMenu(){
        System.out.println("│ "+pizza + "\t│\t" +"￦"+ price + "\t│\t" + description);
    }

}
