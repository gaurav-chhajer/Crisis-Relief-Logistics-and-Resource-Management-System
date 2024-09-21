public class Request {
    private int requestId;
    private int requestingLocationId;
    private int resourceId;
    private int requestedQuantity;
    private java.sql.Timestamp requestDate;
    private String status; // Enum as String
    private String urgency; // Enum as String

    // Getters and Setters
    public int getRequestId() {
        return requestId;
    }
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getRequestingLocationId() {
        return requestingLocationId;
    }
    public void setRequestingLocationId(int requestingLocationId) {
        this.requestingLocationId = requestingLocationId;
    }

    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }
    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public java.sql.Timestamp getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(java.sql.Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrgency() {
        return urgency;
    }
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
}
