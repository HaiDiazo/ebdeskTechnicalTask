package com.web.service.four2.restfullapi.ebdesk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_TB")
public class Product {

    @Id
    @Column(unique = true)
    private String id;
    private String name;
    private long price;
    private int quantity;
    private Date createdAt;
    private Date updateAt;

    public String messageMakeMe(Boolean alert)
    {
        if (alert){
            return "ID sudah ada!";
        }else{
            return "Berhasil!";
        }

    }

}
