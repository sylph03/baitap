/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author sylph
 */
public class thucPham {
    private int id;
    private String name;
    private float weight;
    private String type;
    private String address;
    private String hsd;
    
    public thucPham(){}
    
    public thucPham(int id, String name, float weight, String type, String address, String hsd) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.address = address;
        this.hsd = hsd;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight(){
        return this.weight;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    
    public void setHsd(String hsd) {
        this.hsd = hsd;
    }
    public String getHsd(){
        return this.hsd;
    }
    
}
