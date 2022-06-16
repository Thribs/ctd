public class HeavyRobot extends CombatMachine implements AttackMachine, DefenseMachine, FlyingMachine {

    @Override
    public void attack() {
        System.out.println("HeavyRobot attacks");
    }
    @Override
    public void defend() {
        System.out.println("HeavyRobot defends");
    }
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
    @Override
    public void print() {
        System.out.println("I'm a heavy robot!");
    }   
    
}
