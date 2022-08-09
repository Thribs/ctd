package me.thribs.supermarket;

import me.thribs.supermarket.model.Product;

public class ProductApi {
    
    public static double getDiscount(Product product) {
        
     if (product.getCategory().equals(Product.CATEGORY_CANNED_GOODS)) {
         return 0.1;
     }
        return 0.0;
    }
}
