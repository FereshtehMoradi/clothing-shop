package clothing.shop;

public abstract class Cloth {

    private String color;
    private int size;
    private double price;
    private boolean onSale;

    private static int countOfCloths;
    private static double totalSale;


    public Cloth(String color, int size, double price, boolean onSale) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.onSale = onSale;
        countOfCloths++;
        if(isOnSale()){
            totalSale += (this.calculatePriceAfterSale());
        }else {
            totalSale += (this.getPrice());
        }
    }


    public static void printNumberOfCloths(){

        System.out.println("Total number of cloths are: " + Cloth.getCountOfCloths());
        System.out.println("Total number of dresses are: " + Dress.getCountOfDresses());
        System.out.println("Total number of pants are: " + Pants.getCountOfPants());
        System.out.println("Total number of T-shirts are: " + TShirt.getCountOfTShirts());
    }
    public static void printTotalSale(){

        System.out.println("Total sale of cloths are: " + Cloth.getTotalSale());
        System.out.println("Total sale of dresses are: " + Dress.getDressSale());
        System.out.println("Total sale of pants are: " + Pants.getPantsSale());
        System.out.println("Total sale of T-shirts are: " + TShirt.gettShirtSale());
    }
    public abstract double calculatePriceAfterSale();

    public abstract void printInformation();

    public static double getTotalSale() {
        return totalSale;
    }

    public static int getCountOfCloths(){
        return countOfCloths;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
