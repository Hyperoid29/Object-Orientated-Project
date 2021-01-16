package CarShop;

// Sub class - CarSeat
public class CarSeat extends StockItem
{
    // Constructors
    public CarSeat() {
       super();  // invoke superclass' constructor 
    }
    public CarSeat(String stockName, String stockDescription, double stockPriceWithoutVAT, int variableQuantityInStock) {
       super(stockName, stockDescription, stockPriceWithoutVAT, variableQuantityInStock);  // invoke superclass' constructor 
    }
    
    // Override getters of StockName and StockDescription
    @Override
    public String getStockName() 
    {
        return "Car Seats";
    }
    
    @Override
    public String getStockDescription() 
    {
       return "Leather car seats";
    }
    
    // Override toString()
    @Override
    public String toString() {
       return super.toString();   
    }
}

