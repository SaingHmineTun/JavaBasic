package it.saimao.Lesson57_Record;

import java.util.Objects;

public class UserClass {
    private String name;
    private int age;

    public UserClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserClass userClass = (UserClass) o;
        return age == userClass.age && Objects.equals(name, userClass.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
