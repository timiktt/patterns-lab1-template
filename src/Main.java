import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select drink: 1 - black coffe 2 - create new coffe 3 - create new tea");
        int select_drink = input.nextInt();
        MyCupOfDrink  cup_drink;
        if (select_drink == 1){
            cup_drink = new TakeCoffe();
            cup_drink.createCupOfDrink();
        } else if (select_drink == 2) {
            cup_drink = new TakeCoffe();
            cup_drink.typeOfDrink();
            cup_drink.addSugarInCup();
            cup_drink.addMilkToCup();
            System.out.printf("You select : %s , sugar: %d , Milk: %s", ((TakeCoffe) cup_drink).getType_coffe(), cup_drink.getCount_sugar(), cup_drink.isMilkInCup());
        } else if (select_drink == 3) {
            cup_drink = new TakeTea();
            cup_drink.typeOfDrink();
            cup_drink.addSugarInCup();
            cup_drink.addMilkToCup();
            System.out.printf("You select : %s , sugar: %d , Milk: %s", ((TakeTea) cup_drink).getType_tea(), cup_drink.getCount_sugar(), cup_drink.isMilkInCup());
        }

    }
}