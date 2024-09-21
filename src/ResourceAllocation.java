public class ResourceAllocation {
    private int allocationId;
    private int resourceId;
    private int eventId;
    private java.sql.Timestamp allocationDate;
    private String algorithmName;
    private int allocatedQuantity;

    // Getters and Setters
    public int getAllocationId() {
        return allocationId;
    }
    public void setAllocationId(int allocationId) {
        this.allocationId = allocationId;
    }

    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public java.sql.Timestamp getAllocationDate() {
        return allocationDate;
    }
    public void setAllocationDate(java.sql.Timestamp allocationDate) {
        this.allocationDate = allocationDate;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public int getAllocatedQuantity() {
        return allocatedQuantity;
    }
    public void setAllocatedQuantity(int allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }
}
