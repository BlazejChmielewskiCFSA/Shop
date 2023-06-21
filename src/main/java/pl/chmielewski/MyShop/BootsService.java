package pl.chmielewski.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.chmielewski.MyShop.BootsEntity.ProductEntity;
import pl.chmielewski.MyShop.BootsEntity.ProductRepo;
import java.util.List;
import java.util.UUID;

@Service
public class BootsService {

    public final ProductRepo productRepo;

    @Autowired
    public BootsService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void setBootCode(ProductEntity productEntity){
        productEntity.setBootCode(UUID.randomUUID().toString());
    }

    public List<ProductEntity> findAllBoots(){
        return productRepo.findAll();
    }

    public ProductEntity updateBoot(ProductEntity productEntity){
        return productRepo.save(productEntity);
    }

    public void deleteById(Long id){
        productRepo.deleteBootById(id);
    }
}
