package pl.chmielewski.MyShop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.chmielewski.MyShop.bootsEntity.ProductEntity;

import java.util.List;

@RestController()
@RequestMapping("/boots")
public class BootController {
    private final BootsService bootsService;

    public BootController(BootsService bootsService) {
        this.bootsService = bootsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductEntity>> getAllBoots(){
        List<ProductEntity> productEntities = bootsService.findAllBoots();
        return new ResponseEntity<>(productEntities, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ProductEntity> getBootsById(@PathVariable("id") Long id){
        ProductEntity productEntity = bootsService.findBootById(id);
        return new ResponseEntity<>(productEntity, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ProductEntity> addBoots(@RequestBody ProductEntity productEntity){
        ProductEntity newProductEntity = bootsService.addBoots(productEntity);
        return new ResponseEntity<>(newProductEntity, HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<ProductEntity> updateBoots(@RequestBody ProductEntity productEntity){
        ProductEntity updatedProductEntity = bootsService.addBoots(productEntity);
        return new ResponseEntity<>(updatedProductEntity, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updateBoots(@PathVariable("id") Long id){
        bootsService.deleteBoots(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
