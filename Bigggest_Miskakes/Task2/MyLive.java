package Bigggest_Miskakes.Task2;

public class MyLive {
    private int mistakes;
    private String complexity;

    public int getMistakes() {
        return mistakes;
    }

    public void setMistakes(int mistakes) {
        this.mistakes = mistakes;
    }

    public MyLive(int mistakes, String complexity, boolean depression) {
        this.mistakes = mistakes;
        this.complexity = complexity;
        this.depression = depression;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public boolean isDepression() {
        return depression;
    }

    public void setDepression(boolean depression) {
        this.depression = depression;
    }

    private boolean depression;

    @Override
    public String toString() {
        return "В жизни " + mistakes + ", Сложность " + complexity + ", Депрессия " + depression;
    }
}

