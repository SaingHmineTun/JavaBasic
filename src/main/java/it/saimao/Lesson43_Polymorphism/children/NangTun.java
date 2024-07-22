package it.saimao.Lesson43_Polymorphism.children;

import it.saimao.Lesson43_Polymorphism.Mother;

public class NangTun extends Mother {
    public void sellGoods() {
        System.out.print("Nang Tun & ");
        super.sellGoods();
    }
}
