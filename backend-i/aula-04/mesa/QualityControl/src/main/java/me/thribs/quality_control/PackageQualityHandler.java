package me.thribs.quality_control;

public class PackageQualityHandler extends QualityHandler {
    
    @Override
    public void filter(Product product) {
        
        PackageCondition packageCondition = product.getPackageCondition();
        if (packageCondition == PackageCondition.MINT_CONDITION || packageCondition == PackageCondition.WELL) {
            System.out.println("Package condition is good");
        }
        else {
            System.out.println("Package condition is bad. Product rejected");
        }
        
    }
    
    
}
