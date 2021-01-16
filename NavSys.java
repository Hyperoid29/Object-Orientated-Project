package CarShop;

// Sub class - NavSys
public class NavSys extends StockItem
{
    // Constructors
    public NavSys() {
       super();  // invoke superclass' constructor 
    }
    public NavSys(String stockName, String stockDescription, double stockPriceWithoutVAT, int variableQuantityInStock) {
       super(stockName, stockDescription, stockPriceWithoutVAT, variableQuantityInStock);  // invoke superclass' constructor 
    }
    
    // Override getters of StockName and StockDescription
    @Override
    public String getStockName() 
    {
        return "Navigation System";
    }
    
    @Override
    public String getStockDescription() 
    {
       return "GeoVision";
    }
    
    // Override toString()
    @Override
    public String toString() {
       return super.toString();   
    }
}
