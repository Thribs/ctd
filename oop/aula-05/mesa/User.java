public class User {
    private String name;
    private String username;
    private int Score = 0;
    private int level = 1;

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getScore() {
        return Score;
    }
    private void setScore(int score) {
        Score = score;
    }
    public int getLevel() {
        return level;
    }
    private void setLevel(int level) {
        this.level = level;
    }
    public void addScore(int score) {
        setScore(getScore() + score);
    }
    public void addLevel(int level) {
        setLevel(getLevel() + level);
    }
    public void resetScore() {
        setScore(0);
    }
    public void resetLevel() {
        setLevel(1);
    }
    public void bonusScore(int bonus) {
        addScore(bonus);
    }
    public void printInfo() {
        System.out.println("A pontuação de " + getName() + " é " + getScore() + ", e seu nível é " + getLevel());
    }

}