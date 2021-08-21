class DetalleVenta{
    String product;
    double price;
    int quantity;

    public Double subtotal(){
        return quantity * price;
    } 
}