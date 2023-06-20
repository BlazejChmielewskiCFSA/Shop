package pl.chmielewski.MyShop.BootsEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private String imageURL;
    private Color color;
    private int discount;

    public ProductEntity(String name, BigDecimal price, String imageURL, Color color, int discount) {
        this.name = name;
        this.price = price;
        this.imageURL = imageURL;
        this.color = color;
        this.discount = discount;
    }
}
