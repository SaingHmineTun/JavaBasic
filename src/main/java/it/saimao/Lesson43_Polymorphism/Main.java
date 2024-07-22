package it.saimao.Lesson43_Polymorphism;

import it.saimao.Lesson43_Polymorphism.children.AikKyaw;
import it.saimao.Lesson43_Polymorphism.children.NangTun;

public class Main {
    public static void main(String[] args) {
        Mother aikKyaw = new AikKyaw();
        System.out.println("Shop name - " + aikKyaw.shopName);
        aikKyaw.sellGoods(); // Aik Kyaw is selling goods!
        Mother nangTun = new NangTun();
        nangTun.sellGoods(); // Nang Tun & Mother is selling goods!
    }
}
