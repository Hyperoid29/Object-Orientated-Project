package CarShop;

// Sub class - CarWrap
public class CarWrap extends StockItem
{
    // Constructors
    public CarWrap() {
       super();  // invoke superclass' constructor 
    }
    public CarWrap(String stockName, String stockDescription, double stockPriceWithoutVAT, int variableQuantityInStock) {
       super(stockName, stockDescription, stockPriceWithoutVAT, variableQuantityInStock);  // invoke superclass' constructor 
    }
    
    // Override getters of StockName and StockDescription
    @Override
    public String getStockName() 
    {
        return "Car Wraps";
    }
    
    @Override
    public String getStockDescription() 
    {
       return "Car wraps with graphic designs";
    }
    
    // Override toString()
    @Override
    public String toString() {
       return super.toString();   
    }
}

