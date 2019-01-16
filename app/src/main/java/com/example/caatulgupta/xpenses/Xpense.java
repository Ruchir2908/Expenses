package com.example.caatulgupta.xpenses;

public class Xpense {

    private String XpenseName;
    private int XpenseAmount;

    public Xpense() {
    }

    public Xpense(String name, int amount){
        this.XpenseName = name;
        this.XpenseAmount = amount;
    }

    public int getXpenseAmount() {
        return XpenseAmount;
    }

    public String getXpenseName() {
        return XpenseName;
    }

    public void setXpenseAmount(int xpenseAmount) {
        XpenseAmount = xpenseAmount;
    }

    public void setXpenseName(String xpenseName) {
        XpenseName = xpenseName;
    }
}
