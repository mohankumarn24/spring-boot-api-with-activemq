package com.javatodev.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    private int itemId;
    private String itemName;
    private int itemQuantity;

    @Override
    public String toString(){
        return "Store{" +
                "item id ='"+ itemId +'\'' +
                ", item Name ='"+ itemName + '\'' +
                ", item Quantity ='"+ itemQuantity + '\'' +
                "}";

    }
}
