package com.example.lab12.Orders;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
    @Id
    private String id;
    private String status;
    private Date date;

    // Getters and Setters
}

