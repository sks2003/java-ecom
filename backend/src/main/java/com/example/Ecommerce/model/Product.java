package com.example.Ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public Product(int id) {
        this.id=id;
    }

    //hibernate requires a no argument default constructor
    public Product() {

    }

    // Manually add getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getBrand() { return brand; }
    public BigDecimal getPrice() { return price; }
    public String getCategory() { return category; }
    public Date getReleaseDate() { return releaseDate; }
    public boolean isProductAvailable() { return productAvailable; }
    public int getStockQuantity() { return stockQuantity; }
    public String getImageName() { return imageName; }
    public String getImageType() { return imageType; }
    public byte[] getImageData() { return imageData; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setCategory(String category) { this.category = category; }
    public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }
    public void setProductAvailable(boolean productAvailable) { this.productAvailable = productAvailable; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    public void setImageName(String imageName) { this.imageName = imageName; }
    public void setImageType(String imageType) { this.imageType = imageType; }
    public void setImageData(byte[] imageData) { this.imageData = imageData; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                ", productAvailable=" + productAvailable +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
