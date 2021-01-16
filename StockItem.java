package CarShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Super class - StockItem
public class StockItem 
{
    // User Input - Allows user to input from keyboard
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream); 
    
    // Declaration of Instance Variables
    private String stockName, stockDescription;
    final String stockCode;
    private int variableQuantityInStock;
    private double stockPriceWithoutVAT, VAT;

    // Constructors - StockItem
    public StockItem() {
       this.stockName = "Unknown Stock Name";
       this.stockDescription = "Unknown Stock Description";
       this.stockCode = "W101";
       this.stockPriceWithoutVAT = 99.99;
       this.VAT = 17.5;
       this.variableQuantityInStock = 10;
    }
    public StockItem(String stockName, String stockDescription, double stockPriceWithoutVAT, int variableQuantityInStock) 
    {
       this.stockName = stockName;
       this.stockDescription = stockDescription;
       this.stockCode = "W101";
       this.stockPriceWithoutVAT = stockPriceWithoutVAT;
       this.VAT = 17.5;
       this.variableQuantityInStock = variableQuantityInStock;
    }

    // Getters and Setters of StockName
    public void setStockName(String stockName) 
    {
       this.stockName = stockName;
    }
    public String getStockName() 
    {
       return this.stockName;
    }
    
    // Getters and Setters of StockDescription
    public void setStockDescription(String stockDescription) 
    {
       this.stockDescription = stockDescription;
    }
    public String getStockDescription() 
    {
       return this.stockDescription;
    }
    
    // Getters of VAT
    public double getVAT() 
    {
        return VAT;
    }
    
    // Getters and Setters of Stock Price
    public void setStockPriceWithoutVAT() throws IOException 
    {
        System.out.print("How much are the stocks without VAT in pounds? ");
        while(true)
        {
            try
            {
                double stockPriceWithoutVAT = Double.parseDouble(bufRead.readLine());
                this.stockPriceWithoutVAT = stockPriceWithoutVAT;
                break;
            }
            catch(NumberFormatException ex1)
            {
                System.err.printf("\nException: %s\n", ex1);
                System.out.println("Error: Incorrect input was used");
                System.out.print("Please enter the price of the stock without the VAT in pounds: ");
            }
        } 
    }
    public double getStockPriceWithoutVAT() 
    {
        return stockPriceWithoutVAT;
    }
    public double getStockPriceWithVAT() 
    {
      return (((100 + VAT) * stockPriceWithoutVAT)/100);
    }
    
    // Stock Quantity - To add and sell stock using validation 
    public void addStock() throws IOException 
    {
        System.out.print("How much stocks would you like to add? ");
        while(true)
        {
            try
            {
                int addStock = Integer.parseInt(bufRead.readLine());
                int x = variableQuantityInStock;
                if (addStock > 1)
                {
                    x = x + addStock;
                    if (x <= 100)
                    {   
                        this.variableQuantityInStock = x;
                        System.out.println("Increasing " + addStock + " more units");
                        System.out.println("Total unit in Stock: " + (variableQuantityInStock));
                    }
                    else
                    {
                        System.out.println("Error: Stock cannot be more than 100");

                    }
                }
                else 
                {
                    System.out.println("Error: Value input is less than one");
                }
                break;
            }
            catch(NumberFormatException ex1)
            {
                System.err.printf("\nException: %s\n", ex1);
                System.out.println("Error: Incorrect input was used");
                System.out.print("Please enter a number of stocks you would like to add: ");
            }
        }
    }
    public void sellStock() throws IOException 
    {
        System.out.print("How much stocks would you like to sell? ");
        while(true)
        {
            try
            {
                int sellStock = Integer.parseInt(bufRead.readLine());
                int x = variableQuantityInStock;
                if (sellStock > 1)
                {
                    x = x - sellStock;
                    if (x >= 0)
                    {   
                        this.variableQuantityInStock = x;
                        System.out.println("Decreasing " + sellStock + " less units");
                        System.out.println("Total unit in Stock: " + (variableQuantityInStock));
                    }
                    else
                    {
                        System.out.println("Error: Not enough stock to sell");
                    }
                }
                else
                {
                    System.out.println("Error: Value input is less than one");
                }
                break;}
            catch(NumberFormatException ex1)
            {
                System.err.printf("\nException: %s\n", ex1);
                System.out.println("Error: Incorrect input was used");
                System.out.print("Please enter a number of stocks you would like to sell: ");
            }
        }
    }
    public int returnStock() 
    {
        return variableQuantityInStock;
    }

    // Override toString() and output chosen variables
    @Override
    public String toString() {
       return "Creating a stock with " + returnStock() + " units " + getStockName() + ", price " + getStockPriceWithoutVAT()  + " each, and item code " + this.stockCode + "\n"
            + "Printing item stock information: \n"
            + "Stock Type: " + getStockName() + "\n"
            + "Description: " + getStockDescription() + "\n"
            + "Stock Code: " + this.stockCode + "\n" 
            + "Stock Price without VAT: " + getStockPriceWithoutVAT()  + "\n" 
            + "Stock Price with VAT: " + getStockPriceWithVAT() + "\n" 
            + "Current Stock Items: " + returnStock() + "\n";
    }
}
