public class DisasterEvent {
    private int eventId;
    private String eventType; // Enum as String
    private String description;
    private java.sql.Timestamp startDate;
    private java.sql.Timestamp endDate;
    private int affectedAreaId;
    private String severity; // Enum as String

    // Getters and Setters
    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Timestamp getStartDate() {
        return startDate;
    }
    public void setStartDate(java.sql.Timestamp startDate) {
        this.startDate = startDate;
    }

    public java.sql.Timestamp getEndDate() {
        return endDate;
    }
    public void setEndDate(java.sql.Timestamp endDate) {
        this.endDate = endDate;
    }

    public int getAffectedAreaId() {
        return affectedAreaId;
    }
    public void setAffectedAreaId(int affectedAreaId) {
        this.affectedAreaId = affectedAreaId;
    }

    public String getSeverity() {
        return severity;
    }
    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
