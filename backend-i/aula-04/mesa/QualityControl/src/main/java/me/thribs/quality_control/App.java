package me.thribs.quality_control;

public class App {
    public static void main(String[] args) {

        ProductHandler productHandler = new ProductHandler();

        productHandler.filter(new Product("Product 1", 3000, 1300, PackageCondition.MINT_CONDITION));
        productHandler.filter(new Product("Product 2", 1250, 900, PackageCondition.WELL));
        productHandler.filter(new Product("Product 3", 1280, 1200, PackageCondition.DAMAGED));
        productHandler.filter(new Product("Product 4", 1230, 1100, PackageCondition.MINT_CONDITION));


    }    
}
