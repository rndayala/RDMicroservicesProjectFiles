package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@ToString
public class BaseEntity {
    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createdAt; // maps to column : `created_at` date NOT NULL

    @Column(updatable = false)
    @CreatedBy
    private String createdBy;        // maps to column : `created_by` varchar(20) NOT NULL

    @Column(insertable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt; // maps to column : `updated_at` date DEFAULT NULL

    @Column(insertable = false)
    @LastModifiedBy
    private String updatedBy;        // maps to column : `updated_by` varchar(20) DEFAULT NULL
}
