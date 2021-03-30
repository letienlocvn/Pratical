/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loclt.shoe;

import java.io.Serializable;

/**
 *
 * @author WIN
 */
public class ShoeDTO implements Serializable {

    private int id;
    private String name;
    private String descreption;
    private float price;
    private int size;
    private int quantity;

    public ShoeDTO() {
    }

    public ShoeDTO(int id, String name, String descreption, float price, int size, int quantity) {
        this.id = id;
        this.name = name;
        this.descreption = descreption;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the descreption
     */
    public String getDescreption() {
        return descreption;
    }

    /**
     * @param descreption the descreption to set
     */
    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
