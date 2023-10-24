package enums;

public enum Gender {
    MALE("Мужчина"),
    FEMALE("Женщина"),
    OTHER("Другое");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
