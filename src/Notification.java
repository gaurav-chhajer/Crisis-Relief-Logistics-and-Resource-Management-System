public class Notification {
    private int notificationId;
    private int userId;
    private String message;
    private java.sql.Timestamp createdAt;
    private boolean isRead;

    // Getters and Setters
    public int getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public java.sql.Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isRead() {
        return isRead;
    }
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }
}
