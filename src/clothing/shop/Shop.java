package clothing.shop;

import java.util.ArrayList;

public class Shop {

    private static ArrayList<Cloth> myShop = new ArrayList<>();

    public static void main(String[] args) {

        Shop.initiateTheList();

        for (Cloth c : myShop){
            c.printInformation();
        }
        System.out.println("-----------------------------");
        Cloth.printNumberOfCloths();
        System.out.println("-----------------------------");
        Cloth.printTotalSale();
    }



    private static void initiateTheList(){

        myShop.add(new Dress("Red", 36, 500, true));
        myShop.add(new Dress("White", 36, 400, true));
        myShop.add(new Dress("Pink", 38, 250, false));
        myShop.add(new Dress("Purple", 38, 250, true));
        myShop.add(new TShirt("Red", 38, 150, false));
        myShop.add(new TShirt("Blue", 38, 150, false));
        myShop.add(new TShirt("Yellow", 38, 150, false));
        myShop.add(new TShirt("Brown", 38, 150, true));
        myShop.add(new TShirt("Purple", 38, 150, true));
        myShop.add(new Pants("Blue", 36, 350, true));
        myShop.add(new Pants("Blue", 38, 350, false));
        myShop.add(new Pants("Black", 36, 400, true));
        myShop.add(new Pants("Black", 38, 400, false));


    }
}