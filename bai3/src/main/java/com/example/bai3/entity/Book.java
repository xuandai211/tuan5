package com.example.bai3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import com.example.bai3.Validator.annotation.ValidCategoryId;
import com.example.bai3.Validator.annotation.ValidUserId;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Title must be empty")
    @Size(max = 50,min=1,message = "Title must be less than 50 charatecrs")
    private String title;

    @Column(name = "author",length = 50)
    @Size(max=50,message = "Author must be less than 50 charatecrs")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Pirce is required")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    @ValidUserId
    private User user;
}
