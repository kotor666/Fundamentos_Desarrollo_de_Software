
package co.edu.unicauca.openmarket.access;

import co.edu.unicauca.openmarket.domain.Product;
import java.util.List;

/**
 *
 * @author 
 */
public interface IProductRepository {
    boolean save(Product newProduct);
    
    boolean edit(Long id, Product product);
    
    boolean delete(Long id);

    /**
     *
     * @param id
     * @return
     */
    Product findById(Long id);


   
    
    
    List<Product> findAll();

    public List<Product> findByName(String Name);
    
    public List<Product> findByCategory(String category);
    
}
