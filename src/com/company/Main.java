package com.company;

public class Main {
    public static void main(String[] args) {
        Boss strong = new Boss();
        strong.setLife(400);
        strong.setDamage(300);
        strong.setLron("Owns lighting");
        System.out.println(strong.getLife() + " " + strong.getDamage() + "" + strong.getLron());
    }
}
