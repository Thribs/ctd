public interface ShoppingCartState { 

    public void addItem(ShoppingCart cart, Item item);
    public void cancel(ShoppingCart cart);
    public void returnToPreviousState(ShoppingCart cart);
    public void goToNextState(ShoppingCart cart);
    
}
