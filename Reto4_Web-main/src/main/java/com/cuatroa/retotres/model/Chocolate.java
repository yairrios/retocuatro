package com.cuatroa.retotres.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Fabian Mendoza
 */
@Document(collection = "chocolates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chocolate {
    @Id
    private String reference;
    private String category;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
