public abstract class Product {

    private String productId;

    private String productName;

    private  String  availabaleNo;

    private  Double price;

    public Product() {

    }

    public Product(String productId, String productName, String availabaleNo, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.availabaleNo = availabaleNo;
        this.price = price;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAvailabaleNo() {
        return availabaleNo;
    }

    public void setAvailabaleNo(String availabaleNo) {
        this.availabaleNo = availabaleNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", availabaleNo='" + availabaleNo + '\'' +
                ", price=" + price +
                '}';
    }
}