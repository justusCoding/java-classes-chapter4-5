package Resturant;


import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem(4.99, "Garlic linguine", "Dinner", true);
        MenuItem newItem2 = new MenuItem(6.99, "Really good steak", "Dinner", false);
        MenuItem newItem3 = new MenuItem(2.99, "Delicious wings", "Appetizer", true);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItems(newItem1);
        ourMenu.addItems(newItem2);
        ourMenu.addItems(newItem3);

        ourMenu.printMenu();

        ourMenu.printItem(newItem2);

        ourMenu.removeItems(newItem2);

        ourMenu.printMenu();
    }
}
