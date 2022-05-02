package chapter3;

public class Invoice {
    private  String partNo;
    private  String partDescription;
    private  int quantity;
    private  double pricePerItem;
    private double amount;


    public Invoice(){

    }
    public Invoice(String partNo, String partDescription, int quantity, double pricePerItem) {

        this.partNo = partNo;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount(){
      return  amount= getPricePerItem()*getQuantity();
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

}
