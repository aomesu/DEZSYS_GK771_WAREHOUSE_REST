package rest.model;

public class ProductData {
    private String productID;
    private String productName;
    private String productCategory;
    private double productQuantity;
    private String productUnit;

    public ProductData(String productID, String productName, String productCategory, double productQuantity, String productUnit) {
        setProductID(productID);
        setProductUnit(productUnit);
        setProductQuantity(productQuantity);
        setProductCategory(productCategory);
        setProductName(productName);
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
