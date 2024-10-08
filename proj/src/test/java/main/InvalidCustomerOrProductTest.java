package main;
//import static org.junit.Assert.assertThrows;
import dao.OrderProcessorRepositoryImpl;
//import entity.Customers;
//import entity.Products;
import exception.CustomerNotFoundException;
import exception.ProductNotFoundException;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class InvalidCustomerOrProductTest {

    @Test
    public void testCustomerNotFoundException() {
        OrderProcessorRepositoryImpl repository = new OrderProcessorRepositoryImpl();
        int invalidCustomerId = 9999; // Assume this ID does not exist in the database
        
        // Act & Assert: Ensure CustomerNotFoundException is thrown
        assertThrows(CustomerNotFoundException.class, () -> {
            repository.getCustomerById(invalidCustomerId);
        });
    }

    @Test
    public void testProductNotFoundException() {
        OrderProcessorRepositoryImpl repository = new OrderProcessorRepositoryImpl();
        int invalidProductId = 9999; // Assume this ID does not exist in the database
        assertThrows(ProductNotFoundException.class, () -> {
            repository.getProductById(invalidProductId);
        });
    }
}
