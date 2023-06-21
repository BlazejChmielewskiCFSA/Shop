package pl.chmielewski.MyShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.chmielewski.MyShop.bootsEntity.ProductEntity;
import pl.chmielewski.MyShop.bootsEntity.ProductRepo;
import pl.chmielewski.MyShop.exceptions.UserNotFounException;

import java.util.List;
import java.util.UUID;

@Service
public class BootsService {

    public final ProductRepo productRepo;

    @Autowired
    public BootsService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ProductEntity addBoots(ProductEntity productEntity){
        productEntity.setBootCode(UUID.randomUUID().toString());
        return productRepo.save(productEntity);
    }

    public List<ProductEntity> findAllBoots(){
        return productRepo.findAll();
    }

    public ProductEntity updateBoot(ProductEntity productEntity){
        return productRepo.save(productEntity);
    }

    public ProductEntity findBootById(Long id){
        return productRepo.findBootById(id)
                .orElseThrow(()-> new UserNotFounException("User by id: " + id + " was not found"));
    }

    public void deleteBoots(Long id){
        productRepo.deleteBootsById(id);
    }
}
