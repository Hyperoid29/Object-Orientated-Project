package CarShop;

// Sub class - CarWheel
public class CarWheel extends StockItem
{
    // Constructors
    public CarWheel() {
       super();  // invoke superclass' constructor 
    }
    public CarWheel(String stockName, String stockDescription, double stockPriceWithoutVAT, int variableQuantityInStock) {
       super(stockName, stockDescription, stockPriceWithoutVAT, variableQuantityInStock);  // invoke superclass' constructor 
    }
    
    // Override getters of StockName and StockDescription
    @Override
    public String getStockName() 
    {
        return "Car Wheels";
    }
    
    @Override
    public String getStockDescription() 
    {
       return "Alloy wheel with tyre";
    }
    
    // Override toString()
    @Override
    public String toString() {
       return super.toString();   
    }
}

