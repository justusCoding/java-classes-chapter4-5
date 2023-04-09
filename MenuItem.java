package Resturant;

import java.util.Objects;

public class MenuItem {

    private double price;



    private String description;


    private String category;


    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isNew() {
        return isNew;
    }

    public void isItNew(){
        if(this.isNew){
            System.out.println("the item is new");
        }else {
            System.out.println("this item is not new");
        }
    }



    public boolean equals(MenuItem comparison) {
        if (comparison == this) {
            return true;
        }

        if (comparison == null) {
            return false;
        }

        if (comparison.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) comparison;
        return theItem.getDescription() == getDescription();
    }


}

