import java.util.Scanner;
public class TakeCoffe extends MyCupOfDrink {
    private String type_coffe;
    private String milkInCup = "No";
    @Override
    public void addMilkToCup() {
        Scanner input = new Scanner(System.in);
        System.out.println("Add milk in coffe? 1 Y\n 2 N\n ");
        int select_milk = input.nextInt();
        if (select_milk == 1) {
            setMilkInCup();
        }
    }
    @Override
    public String typeOfDrink(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - grain coffee \n 2 - capsule coffee");
        int select_type = input.nextInt();
        if (select_type == 1){
            setType_coffe("grain coffee");
        } else if (select_type == 2) {
            setType_coffe("capsule coffee");
        }
        return getType_coffe();
    }

    public void setMilkInCup(){
        this.milkInCup = "Yes";
    }

    public String getType_coffe(){
        return type_coffe;
    }

    public void setType_coffe(String type_coffe){
        this.type_coffe = type_coffe;
    }
    public String isMilkInCup(){
        return milkInCup;
    }
}
