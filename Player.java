public class Player {

    private String name;
    private int runs;
    private int balls;
    private boolean out_notout;

    public Player(String name) {
        this.name = name;
        this.runs = 0;
        this.balls = 0;
        this.out_notout = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }


    public void addRuns(int runs) {
        this.runs += runs;
    }


    public boolean isOut_notout() {
        return out_notout;
    }

    public void setOut_notout(boolean out_notout) {
        this.out_notout = out_notout;
    }

    public void addBallFaced() {
        this.balls+=1;
    }
    public void setOut() {
        this.out_notout = true;
    }
}
