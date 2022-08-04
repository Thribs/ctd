package me.thribs.quality_control;

public abstract class QualityHandler {

    protected QualityHandler next;

    public QualityHandler getNext() {
        return next;
    }

    public void setNext(QualityHandler next) {
        this.next = next;
    }

    public abstract void filter(Product product);
    
}
