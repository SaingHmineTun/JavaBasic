package it.saimao.Lesson58_Enum;

public enum Priority {
    HIGH("High"), MEDIUM("Medium"), LOW("Low");
    private String name;
    Priority(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
