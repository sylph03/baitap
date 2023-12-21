/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;
import javaapplication4.menu;
import javaapplication4.thucPham;
/**
 *
 * @author sylph
 */
public class main {
   public static void main(String[] args) {
       ArrayList<thucPham> tps = new ArrayList<>();
       tps.add(new thucPham(01, "Banana", (float) 0.5, "qua", "ngan duoi", "21-12-2023"));
       
       menu.showMenu(tps);
   }
}
