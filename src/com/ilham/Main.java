/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class Main Handphone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProdoct();
        System.out.println("Android Key Store : " + android.getKeyStore() + "\n");
        
        BlackBerry bb = new BlackBerry("Black B", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProdoct();
        System.out.println("PIN : " + bb.getPinBB() + "\n");
        
        WindowsPhone windows = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windows.setWpKeyStore("UUUQIJWORJ");
        windows.displayProdoct();
        System.out.println("Wp Key Store : " + windows.getWpKeyStore() + "\n");
    }
    
}
