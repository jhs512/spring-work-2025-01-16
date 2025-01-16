package com.ll.domain.product.product.entity;

import com.ll.domain.member.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    private Member owner;
}
