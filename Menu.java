package Resturant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    public Menu(Date date, ArrayList<MenuItem> items) {
        this.lastUpdated = date;
        this.items = items;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public ArrayList<MenuItem> addItems(MenuItem item){

        this.items.add(item);
                return this.items;
    }

        public ArrayList<MenuItem>  removeItems(MenuItem item){
            int toBeRemoved = -1;
            for (int i = 0; i < items.size(); i++ ){
                if (items.get(i).equals(item)) {
                    toBeRemoved = i;
                }
             }

            this.items.remove(toBeRemoved);
            return this.items;
        }


        public String whenWasItUpdated(){
        return ("the menu was last updated on"+ this.lastUpdated);
        }

        public String printItem(MenuItem item){
        return(item.getDescription());
        }
        public void printMenu(){
        for(int i = 0; i< items.size(); i++){
            System.out.println(items.get(i).getDescription());
        }

        }



}

