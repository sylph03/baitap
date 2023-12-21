/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author sylph
 */
public class menu {
    public static void Menu() {
        System.out.println("Chon cac tuy chon ben duoi:");
        System.out.println("1. Them mon an moi");
        System.out.println("2. Tim kiem mon an theo ten");
        System.out.println("3. Loai bo thuc pham theo id");
        System.out.println("4. In danh sach thuc pham");
        System.out.println("5. thoat");
    }
    
    public static void addThucPham(ArrayList<thucPham> tps) {
        thucPham newTp = new thucPham();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id:");
        newTp.setId(sc.nextInt());
        boolean check = true;
        while(check){
            check = false;
            for(thucPham tp : tps){
                if(tp.getId() == newTp.getId()) {
                    System.out.print("id da ton tai! Nhap lai:");
                    check = true;
                }
            }
        }
        
        System.out.println("Nhap ten:");
        newTp.setName(sc.nextLine());
        
        System.out.println("Nhap khoi luong:");
        newTp.setWeight(sc.nextFloat());
        
        System.out.println("Nhap loai:");
        newTp.setType(sc.nextLine());
        
        System.out.println("Nhap dia diem:");
        newTp.setAddress(sc.nextLine());
        
        System.out.println("Nhap han su dung:");
        newTp.setHsd(sc.nextLine());
    
        tps.add(newTp);
    }
    
    public static void searchThucPham(ArrayList<thucPham> tps){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu khoa tim kiem:");
        String searchKey = sc.nextLine();
        boolean check = false;
        for(thucPham tp : tps) {
            if(tp.getName() == searchKey){
                System.out.println("Id: " + tp.getId());
                System.out.println("Ten: " + tp.getName());
                System.out.println("Khoi luong: " + tp.getWeight());
                System.out.println("Loai: " + tp.getType());
                System.out.println("Dia diem: " + tp.getAddress());
                System.out.println("Han su dung: " + tp.getHsd());
                
                check = true;
            }
        }
        if(!check) {
            System.out.println("Thuc pham khong ton tai!");
        }
    }
    
    public static void removeThucPham(ArrayList<thucPham> tps) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id thuc pham muon xoa: ");
        int id = sc.nextInt();
        boolean check = false;
        for(thucPham tp : tps){
            if(tp.getId() == id){
                System.out.print("Xac nhan xoa(y/n):");
                if(sc.nextLine() == "y"){
                   tps.remove(tp);
                } else {
                    return;
                }
                check = true;
            }
        }
        if(!check) {
            System.out.println("Thuc pham co id khong ton tai!");
        }
    }
    
    public static void showList(ArrayList<thucPham> tps) {
        for(thucPham tp : tps) {
            System.out.println("id " + tp.getId());
            System.out.println("ten " + tp.getName());
            System.out.println("trong luong: " + tp.getWeight());
            System.out.println("loai: " + tp.getType());
            System.out.println("dia diem: " + tp.getAddress());
            System.out.println("han su dung: " + tp.getHsd());
            System.out.println();
        }
    }
    
    public static void showMenu(ArrayList<thucPham> tps) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check) {
            Menu();
            int choose = sc.nextInt();
            String tieptuc;
            switch(choose) {
                case 1:
                    do {
                        addThucPham(tps);
                        System.out.println("Tiếp tục? (y/n)");
                        tieptuc = sc.nextLine();
                    } while(tieptuc == "y");
                    break;
                case 2:  
                    do {
                        searchThucPham(tps);
                        System.out.println("Tiếp tục? (y/n)");
                        tieptuc = sc.nextLine();
                    } while(tieptuc == "y");
                    break;
                case 3: 
                    do {
                        removeThucPham(tps);
                        System.out.println("Tiếp tục? (y/n)");
                        tieptuc = sc.nextLine();
                    } while(tieptuc == "y");
                    break;
                case 4:
                    showList(tps);
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.print("Không hợp lệ!");
            }
        }
    }
}

    
