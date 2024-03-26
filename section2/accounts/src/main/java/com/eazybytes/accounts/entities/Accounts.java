package com.eazybytes.accounts.entities;

import jakarta.persistence.*;
import lombok.*;

// this is the entity class that represents accounts table in the database
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {
    @Column(name="customer_id")
    private Long customerId;      // maps to column name : `customer_id`

    @Column(name="account_number")
    @Id
    private Long accountNumber;   // maps to column name : `account_number`

    @Column(name="account_type")
    private String accountType;   // maps to column name : `account_type`

    @Column(name="branch_address")
    private String branchAddress; // maps to column name : `branch_address`
}
