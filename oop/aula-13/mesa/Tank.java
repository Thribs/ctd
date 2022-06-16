public class Tank extends CombatMachine implements AttackMachine, DefenseMachine {
    @Override
    public void attack() {
        System.out.println("Tank attacks");
    }
    @Override
    public void defend() {
        System.out.println("Tank defends");
    }
    @Override
    public void print() {
        System.out.println("I'm a tank!");
    }    
}
