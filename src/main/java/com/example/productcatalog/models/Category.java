package com.example.productcatalog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseModel{
    private String name;

    @OneToMany(mappedBy = "category")
    // Mapped by -> used to notifiy this the same relation with many to one product to catgory
    private List<Product> products = new ArrayList<>();

}
