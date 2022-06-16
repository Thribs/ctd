public class LightRobot extends CombatMachine implements AttackMachine, DefenseMachine, FlyingMachine {

    @Override
    public void attack() {
        System.out.println("LightRobot attacks");
    }
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
    @Override
    public void defend() {
        System.out.println("I'm defending!");
    }
    @Override
    public void print() {
        System.out.println("I'm a light robot!");
    }
    
    
}
