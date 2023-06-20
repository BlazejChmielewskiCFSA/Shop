package pl.chmielewski.MyShop.BootsEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<ProductEntity, Long> {

}
