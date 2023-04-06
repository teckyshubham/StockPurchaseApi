package com.example.BaseConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    public String orderId;
    public String name;
    public int qty;
    public double price;

}
