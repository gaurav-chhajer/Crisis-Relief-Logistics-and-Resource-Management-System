public class Donation {
    private int donationId;
    private String donorName;
    private int resourceId;
    private int donatedQuantity;
    private java.sql.Timestamp donationDate;

    // Getters and Setters
    public int getDonationId() {
        return donationId;
    }
    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public String getDonorName() {
        return donorName;
    }
    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getResourceId() {
        return resourceId;
    }
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getDonatedQuantity() {
        return donatedQuantity;
    }
    public void setDonatedQuantity(int donatedQuantity) {
        this.donatedQuantity = donatedQuantity;
    }

    public java.sql.Timestamp getDonationDate() {
        return donationDate;
    }
    public void setDonationDate(java.sql.Timestamp donationDate) {
        this.donationDate = donationDate;
    }
}
