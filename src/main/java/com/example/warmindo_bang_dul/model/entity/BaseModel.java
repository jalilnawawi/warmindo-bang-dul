package com.example.warmindo_bang_dul.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseModel implements Serializable {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = true, updatable = false)
    @CreatedDate
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date", nullable = true)
    @LastModifiedDate
    private Date updatedDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted_date")
    private Date deletedDate;
}
