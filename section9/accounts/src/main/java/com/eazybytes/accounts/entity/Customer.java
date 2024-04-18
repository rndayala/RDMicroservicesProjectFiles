package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

// this is the entity class that represents customer table in the database
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;      // maps to column name : `customer_id`
    private String name;          // maps to column name : `name`
    private String email;         // maps to column name : `email`

    @Column(name = "mobile_number")
    private String mobileNumber;  // maps to column name : `mobile_number`
}
