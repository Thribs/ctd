package me.thribs.dental_clinic.model;

public enum AccessLevel {
    // GUEST, USER, ADMIN

    GUEST("guest"), USER("user"), ADMIN("admin");

    private String label;

    private AccessLevel(String label) {
        this.label = label;
    }

    public static AccessLevel getByLabel(String label) {
        switch (label) {
            case "guest": return AccessLevel.GUEST;
            case "user": return AccessLevel.USER;
            case "admin": return AccessLevel.ADMIN;
            default: return null;
        }
    }

    public String getLabel() {
        return this.label;
    }
}
