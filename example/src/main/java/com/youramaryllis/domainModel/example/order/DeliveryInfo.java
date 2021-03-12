package com.youramaryllis.domainModel.example.order;

import com.youramaryllis.ddd.domainModel.annotations.ValueObject;

@ValueObject
public class DeliveryInfo {
    public String name;
    public Address address;
}
