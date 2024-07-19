package it.saimao.Lesson35;

public class User {
    String name;
    int pin;

    String getName() {
        // Default Value
        if (name == null) name = "Sai Mao";
        return name;
    }

    // String string;
    void setName(String name) {
        if (name.length() < 3) return;
        this.name = name;
    }

    int getPin() {
        return pin;
    }

    void setPin(int pin) {
        this.pin = pin;
    }

    void setData(String name, int pin) {
        // Method Arguments
        // this => object
        setName(name);
        this.pin = pin;
    }


}
