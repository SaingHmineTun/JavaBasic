package it.saimao.Lesson70_GenericClassAndMethod;

public class User<P, N> {
    String name;
    P password;
    N phoneNumber;


    public void setPassword(P p) {
        this.password = password;
    }

    public <I> I getValue(I i) {
        return i;
    }

}
