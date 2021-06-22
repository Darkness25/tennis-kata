public class Player {

    private String name;
    private Integer score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void wonPoint() {
        score += 1;
    }



    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer score() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
