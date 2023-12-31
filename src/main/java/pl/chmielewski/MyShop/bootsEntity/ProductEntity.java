package pl.chmielewski.MyShop.bootsEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bootCode;
    private String name;
    private BigDecimal price;
    private String imageURL;
    private int discount;
    @Enumerated(EnumType.STRING)
    private Color color;
}
