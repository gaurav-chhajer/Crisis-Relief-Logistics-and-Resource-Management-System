public class Resource {
    private int resourceId;
    private String resourceName;
    private String description;
    private String category; // Enum can be used as String initially
    private int quantity;
    private String unit;
    private java.sql.Date expirationDate;
    private int currentLocationId;

    // Getters and Setters
    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public java.sql.Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(java.sql.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCurrentLocationId() {
        return currentLocationId;
    }
    public void setCurrentLocationId(int currentLocationId) {
        this.currentLocationId = currentLocationId;
    }
}
