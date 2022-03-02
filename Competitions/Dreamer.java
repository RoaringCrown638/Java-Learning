package Competitions;

public class Dreamer {
    private boolean limbo = false;
    private int level = 0;
    private String name = "";

    public Dreamer(String name) {
        this.name = name;
    }

    public void addLevel() {
        this.level += 1;
    }

    public void removeLevel() {
        this.level -= 1;
    }

    public void setLimbo() {
        this.limbo = true;
    }

    public boolean getStatus() {
        return this.limbo;
    }

    public String getName() {
        return this.name;
    }
}
