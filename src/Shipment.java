public class Shipment {
    private int shipmentId;
    private int resourceId;
    private int fromLocationId;
    private int toLocationId;
    private int quantity;
    private java.sql.Timestamp shipmentDate;
    private java.sql.Timestamp arrivalDate;
    private String status; // Enum as String

    // Getters and Setters
    public int getShipmentId() {
        return shipmentId;
    }
    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getFromLocationId() {
        return fromLocationId;
    }
    public void setFromLocationId(int fromLocationId) {
        this.fromLocationId = fromLocationId;
    }

    public int getToLocationId() {
        return toLocationId;
    }
    public void setToLocationId(int toLocationId) {
        this.toLocationId = toLocationId;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public java.sql.Timestamp getShipmentDate() {
        return shipmentDate;
    }
    public void setShipmentDate(java.sql.Timestamp shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public java.sql.Timestamp getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(java.sql.Timestamp arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
