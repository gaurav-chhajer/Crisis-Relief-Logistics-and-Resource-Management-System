public class AuditLog {
    private int logId;
    private int userId;
    private String action;
    private java.sql.Timestamp actionDate;
    private String details;

    // Getters and Setters
    public int getLogId() {
        return logId;
    }
    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public java.sql.Timestamp getActionDate() {
        return actionDate;
    }
    public void setActionDate(java.sql.Timestamp actionDate) {
        this.actionDate = actionDate;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}
