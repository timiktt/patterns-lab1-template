import java.util.Scanner;
public class TakeTea  extends MyCupOfDrink{
    private String type_tea;
    private String milkInCup = "No";

    @Override
    public void addMilkToCup() {
        Scanner input = new Scanner(System.in);
        System.out.println("Add milk in tea? 1 Y\n 2 N\n ");
        int select_milk = input.nextInt();
        if (select_milk == 1) {
            setMilkInCup();
        }
    }
    @Override
    public String typeOfDrink(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - green tea \n 2 - black tea");
        int select_type = input.nextInt();
        if (select_type == 1){
            setType_tea("green tea");
        } else if (select_type == 2) {
            setType_tea("black tea");
        }
        return getType_tea();
    }
    public String getType_tea(){
        return type_tea;
    }
    public void setType_tea(String type_tea){
        this.type_tea = type_tea;
    }
    public String isMilkInCup(){
        return milkInCup;
    }
    public void setMilkInCup(){
        this.milkInCup = "Yes";
    }
}
