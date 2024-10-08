package main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import dao.OrderProcessorRepositoryImpl;
import entity.Customers;
import entity.Products;

//import java.math.BigDecimal;

public class AddToCartTest {
    
    @Test
    public void testAddProductToCart() {
        Customers customer = new Customers(1, "John Doe", "john@example.com", "password123");
        Products product = new Products(2, "Smartphone", 800.00, "Flagship smartphone", 20);
        
        OrderProcessorRepositoryImpl repository = new OrderProcessorRepositoryImpl();
        
        boolean isProductAddedToCart = repository.addToCart(customer, product, 2);
        
        assertTrue(isProductAddedToCart);
    }
}
