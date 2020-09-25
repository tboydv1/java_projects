//This program represents items sold at a store and calculates invoice amount 
//@oluwatobi 

public class Invoice {

    //Instance variables 
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;

//constructor method for calss Invoice
    public Invoice(String listNo, String description, int itemTotal, double unitPrice)
    {
        this.number = listNo;
        this.description = description;

            if (itemTotal < 0)
            {
            itemTotal = 0;
            this.quantity = itemTotal;
            }
            this.quantity = itemTotal;
            

        if (unitPrice < 0.0 ){
            unitPrice = 0.0;
            this.pricePerItem = unitPrice;
            } 
            this.pricePerItem = unitPrice;
    }
    public void setQuantity(int itemTotal)
    {
        if (itemTotal < 0){
            itemTotal = 0;
            this.quantity = itemTotal;
        }
        this.quantity = itemTotal;

    }
    public String getNumber()
    {
        return number;
    }
    public String getDescription()
    {
        return description;
    }
    public int getQuantity()
    {
        return  quantity;
    }
    public double getUntitPrice()
    {
        return pricePerItem;
    }
    public double getInvoiceAmount()
    {
        return quantity * pricePerItem;
    }
    
}