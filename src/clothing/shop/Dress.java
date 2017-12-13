package clothing.shop;

public class Dress extends Cloth{

    private static int countOfDresses;
    private static double dressSale;


    public Dress(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfDresses++;
        if(isOnSale()){
            dressSale += (this.calculatePriceAfterSale());
        }else {
            dressSale += (this.getPrice());
        }
    }

    public static double getDressSale() {
        return dressSale;
    }

    public static int getCountOfDresses() {
        return countOfDresses;
    }

    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice() * .3;
    }

    @Override
    public void printInformation() {
        if(isOnSale()) {
            System.out.println("The " + this.getColor() +
                    " dress " + this.getSize() + " is on sale." +
                    "The original price was " + this.getPrice() +
                    " SEK, now it is 70% off. " + this.calculatePriceAfterSale() + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " dress size " + this.getSize() +
                    " is not on sale and the price is "
                    + this.getPrice() + " SEK.");
        }
    }
}
