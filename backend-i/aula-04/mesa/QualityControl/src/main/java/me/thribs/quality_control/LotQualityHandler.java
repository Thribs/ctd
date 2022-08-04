package me.thribs.quality_control;

public class LotQualityHandler extends QualityHandler {

    @Override
    public void filter(Product product) {
        if (this.next == null) { return; }
        
        int lot = product.getLot();
        if (lot > 1000 && lot < 2000) {
            System.out.println("Lot is in range");
            this.next.filter(product);
        }
        else {
            System.out.println("Lot is out of range. Product rejected");
        }
        
    }
    
}