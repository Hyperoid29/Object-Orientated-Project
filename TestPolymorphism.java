package CarShop;

import java.io.IOException;

public class TestPolymorphism 
{
    // Method for calling initial StockItem
    public static void itemInstance(StockItem s1) throws IOException
    {
        System.out.println(s1.toString());
        s1.setStockPriceWithoutVAT();
        System.out.println("Stock Price without VAT: " + s1.getStockPriceWithoutVAT());
        System.out.println("VAT percentage: " + s1.getVAT());
        System.out.println("Stock Price with VAT: " + s1.getStockPriceWithVAT());
        s1.addStock();
        s1.sellStock();
        System.out.println(); 
    }          
    public static void main(String[] args) throws IOException
    {
        StockItem [] s = new StockItem[4]; // Initialising array
        // Method binding
        s[0] = new NavSys(); 
        s[1] = new CarWheel();
        s[2] = new CarWrap();
        s[3] = new CarSeat();
        int i = 0;
        while (s[i].returnStock() >= 0 && s[i].returnStock() <= 100) // Stock Quantity should be between 0 and 100 - WHILE loop
        {
            // Initial StockItem - Unknown Item
            StockItem firstS = new StockItem();
            itemInstance(firstS);
            // FOR loop for s[i] array to go through all the sub-classes
            for(i=0; i< s.length; i++)
            { 
                System.out.println(s[i].toString()); 
                s[i].setStockPriceWithoutVAT();
                System.out.println("Stock Price without VAT: " + s[i].getStockPriceWithoutVAT());
                System.out.println("VAT percentage: " + s[i].getVAT());
                System.out.println("Stock Price with VAT: " + s[i].getStockPriceWithVAT());
                s[i].addStock();
                s[i].sellStock();
                System.out.println(); 
            }
            i = 0;
        }
    } 
}
