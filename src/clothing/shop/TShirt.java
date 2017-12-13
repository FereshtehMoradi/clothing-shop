package clothing.shop;

public class TShirt extends Cloth {

    private static int countOfTShirts;
    private static double tShirtSale;


    public TShirt(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfTShirts++;
        if(isOnSale()){
            tShirtSale += (this.calculatePriceAfterSale());
        }else {
            tShirtSale += (this.getPrice());
        }
    }

    public static double gettShirtSale() {
        return tShirtSale;
    }

    public static int getCountOfTShirts() {
        return countOfTShirts;
    }

    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice() * .7;
    }

    @Override
    public void printInformation() {
        if (isOnSale()) {
            System.out.println("The " + this.getColor() +
                    " T-shirt " + this.getSize() + " is on sale." +
                    "The original price was " + this.getPrice() +
                    " SEK, now it is 30% off. " + this.calculatePriceAfterSale() + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " T-shirt size " + this.getSize() +
                    " is not on sale and the price is "
                    + this.getPrice() + " SEK.");
        }

    }
}
