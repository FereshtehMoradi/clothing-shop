package clothing.shop;

public class Pants extends Cloth {

    private static int countOfPants;
    private static double pantsSale;


    public Pants(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfPants++;
        if(isOnSale()){
            pantsSale += (this.calculatePriceAfterSale());
        }else {
            pantsSale += (this.getPrice());
        }
    }

    public static double getPantsSale() {
        return pantsSale;
    }

    public static int getCountOfPants() {
        return countOfPants;
    }

    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice() * .5;
    }

    @Override
    public void printInformation() {
        if (isOnSale()) {
            System.out.println("The " + this.getColor() +
                    " pants " + this.getSize() + " is on sale." +
                    "The original price was " + this.getPrice() +
                    " SEK, now it is 50% off. " + this.calculatePriceAfterSale() + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " pants size " + this.getSize() +
                    " is not on sale and the price is "
                    + this.getPrice() + " SEK.");
        }

    }
}
