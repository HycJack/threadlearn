package com.hycjack.chapter02.test03.entity;

public class PublicVar {
    private String userName = "A";
    private String password = "AA";

    synchronized public void setValue(String userName, String password) {
        try{
            this.userName = userName;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name =" + Thread.currentThread().getName() + "userName= " + userName + "; password= " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     public void getVlaue() {
        System.out.println("getValue method thread name =" + Thread.currentThread().getName() + "userName= " + userName + "; password= " + password);
    }

}
