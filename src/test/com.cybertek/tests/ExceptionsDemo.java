package tests;

import java.util.NoSuchElementException;

public class ExceptionsDemo {
//    public static void main(String[] args) {
//
//public boolean elmentDisplayed (By by){
//     try{
//         return  driver.findElement(by).isDispplayed();
//     }catch(NoSuchElementException e){
//         return false;
//     }
//        }
//
//        public boolean elmentDisplayedS (By by){
//
//         //if the locator matches the list will not able
//         //
//            return driver.findElement(by).isEmpty;
//
//        }

public static void main(String[] args) {
    // I teach on Tuesdays      --> normal flow
    // if I get sick,           ---> problem, issue
    // some will replace me      --> alternative flow

    try {
        System.out.println("Maruf is teaching on Tue");
    } catch (Exception e){
        System.out.println("Akbar will take over");
    }
}
}