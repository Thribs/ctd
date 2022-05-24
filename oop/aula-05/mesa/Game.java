public class Game {
    public static void main(String[] args) {
        User john = new User("John", "john");
        john.addScore(100);
        john.addLevel(1);
        john.printInfo();
        john.resetScore();
        john.resetLevel();
        john.printInfo();
        john.bonusScore(100);
        john.printInfo();

        User jane = new User("Jane", "jane");
        jane.addScore(100);
        jane.addLevel(1);
        jane.printInfo();
        jane.resetScore();
        jane.resetLevel();
        jane.printInfo();
        jane.bonusScore(100);
        jane.printInfo();
    }
}