import java.util.Scanner;
public abstract class MyCupOfDrink {
    protected int count_sugar;
    public void createCupOfDrink(){
        System.out.println("Your cup of black coffee");
    }
    public int addSugarInCup(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many sugar? 0\n 1\n 2\n 3\n");
        int select_sugar = input.nextInt();
        if (select_sugar == 0){
            setCount_sugar(0);
        }else if (select_sugar == 1){
            setCount_sugar(1);
        }else if(select_sugar == 2){
            setCount_sugar(2);
        }
        return getCount_sugar();
    }
    public void setCount_sugar(int count_sugar) {
        this.count_sugar = count_sugar;
    }

    public int getCount_sugar() {
        return count_sugar;
    }

    public abstract void addMilkToCup();
    public abstract String typeOfDrink();
    public abstract String isMilkInCup();
}
