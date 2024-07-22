package it.saimao.Lesson35_MethodParameter;

public class User {
    String name;
    int pin;

    String getName() {
        // Default Value
        if (name == null) name = "Sai Mao";
        return name;
    }

    // Single parameter method
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

    // Multiple parameter method
    void setData(String name, int pin) {
        setName(name);
        this.pin = pin;
    }


}
