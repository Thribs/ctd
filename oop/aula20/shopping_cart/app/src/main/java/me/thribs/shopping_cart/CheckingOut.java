public class CheckingOut implements ShoppingCartState {

    public CheckingOut(ShoppingCart cart) {
        cart.setState(this);
    }

    @Override
    public void addItem(ShoppingCart cart, Item item) {
        throw new IllegalStateException("Cannot add item to a checking out cart");
    }

    @Override
    public void cancel(ShoppingCart cart) {
        cart.setState(new Empty(cart));
    }

    @Override
    public void returnToPreviousState(ShoppingCart cart) {
        cart.setState(new InUse(cart));
    }

    @Override
    public void goToNextState(ShoppingCart cart) {
        cart.setState(new Finished(cart));
    }
    
}
