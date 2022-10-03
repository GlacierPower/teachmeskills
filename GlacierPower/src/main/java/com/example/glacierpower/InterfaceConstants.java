package com.example.glacierpower;

public class InterfaceConstants implements  IAuthorization {
    public static void main(String[] args) {
        InterfaceConstants testConst = new InterfaceConstants();
        testConst.login(userIsNotLoggedIn);

    }

    @Override
    public void login(boolean userISLoggedIn) {
        if (userISLoggedIn){
            System.out.println("User is logged in");
        }
         if (!userIsNotLoggedIn) {
            System.out.println("User is not logged in");
        }
    }
}

interface IAuthorization{
    boolean userIsNotLoggedIn =false; // this is const ( can't be changed)
    boolean userISLoggedIn = true; // this is const

    void login(boolean userISLoggedIn);
}
