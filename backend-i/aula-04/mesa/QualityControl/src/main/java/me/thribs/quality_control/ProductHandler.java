package me.thribs.quality_control;

public class ProductHandler {
        
    private QualityHandler lotQualityHandler = new LotQualityHandler();
    private QualityHandler weightQualityHandler = new WeightQualityHandler();
    private QualityHandler packageQualityHandler = new PackageQualityHandler();

    public ProductHandler() {
        lotQualityHandler.setNext(weightQualityHandler);
        weightQualityHandler.setNext(packageQualityHandler);
        
    }

    public void filter(Product product) {
        lotQualityHandler.filter(product);
    }
        
}
