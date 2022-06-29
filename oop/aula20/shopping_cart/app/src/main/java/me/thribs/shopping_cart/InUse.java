public class InUse implements ShoppingCartState {

    public InUse(ShoppingCart cart) {
        cart.setState(this);
    }

    @Override
    public void addItem(ShoppingCart cart, Item item) {
        cart.addProduct(item);
    }

    @Override
    public void cancel(ShoppingCart cart) {
        cart.setState(new Empty(cart));
    }

    @Override
    public void returnToPreviousState(ShoppingCart cart) {
        cart.setState(new Empty(cart));
    }

    @Override
    public void goToNextState(ShoppingCart cart) {
        cart.setState(new CheckingOut(cart));
    }
}