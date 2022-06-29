public class Empty implements ShoppingCartState {

    public Empty(ShoppingCart cart) {
        cart.setState(this);
    }

    @Override
    public void addItem(ShoppingCart cart, Item item) {
        cart.addProduct(item);
        cart.setState(new InUse(cart));
    }

    @Override
    public void cancel(ShoppingCart cart) {
        throw new IllegalStateException("Cannot cancel an empty cart");
    }

    @Override
    public void returnToPreviousState(ShoppingCart cart) {
        throw new IllegalStateException("No previous state");
    }

    @Override
    public void goToNextState(ShoppingCart cart) {
        cart.setState(new InUse(cart));
    }

}
