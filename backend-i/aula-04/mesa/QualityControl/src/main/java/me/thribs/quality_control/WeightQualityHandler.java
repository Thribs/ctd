package me.thribs.quality_control;

public class WeightQualityHandler extends QualityHandler {

    @Override
    public void filter(Product product) {
        if (this.next == null) { return; }
        
        double weight = product.getWeight();
        if (weight > 1200 && weight < 1300) {
            System.out.println("Weight is in range");
            this.next.filter(product);
        }
        else {
            System.out.println("Weight is out of range. Product rejected");
        }               
    }
    
}
