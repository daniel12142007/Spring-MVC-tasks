package spring.model.enums;

public enum Studentforms {
    OFFLINE("OFFLINE"),
    ONLINE("ONLINE");
    private String format;

    Studentforms(String format) {
        this.format = format;
    }
}
