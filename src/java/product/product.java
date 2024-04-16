/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author SIM ASHAD
 */


public class product {
    private int id;
    private String name;
    private String category;
    public byte[] imageData;
    private String description;
    private double price;

    public product( int id, byte[] imageData, String name, String category , String description, double price) {
        
        this.id = id;
        this.imageData= imageData;
        this.name = name;
        this.category = category;
         
        this.description = description;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public byte[] getImageData() {
        return imageData;
    }

    

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
