/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.openmarket.domain.service;
import co.edu.unicauca.openmarket.access.IProductRepository;
import co.edu.unicauca.openmarket.domain.Category;

/**
 *
 * @author Nicolas
 */
public class CategoryService {
    private IProductRepository repository;
    public boolean addCategory(Category nuevo){
        return repository.saveCategory(nuevo);
    
    }
    
}
