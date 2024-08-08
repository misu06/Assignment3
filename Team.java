import java.util.ArrayList;

public class Team {
    private ArrayList<Player> player = new ArrayList();
    private String name;
    private int total_run;
    private int wicket_fallen;
    private int over_bowlled;



    public Team(String name) {
        this.name = name;
        this.player = new ArrayList<>();
        this.total_run = 0;
        this.wicket_fallen = 0;
        this.over_bowlled = 0;
    }
    public ArrayList<Player> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_run() {
        return total_run;
    }

    public void setTotal_run(int total_run) {
        this.total_run = total_run;
    }

    public int getWicket_fallen() {
        return wicket_fallen;
    }

    public void setWicket_fallen(int wicket_fallen) {
        this.wicket_fallen = wicket_fallen;
    }

    public int getOver_bowlled() {
        return over_bowlled;
    }

    public void setOver_bowlled(int over_bowlled) {
        this.over_bowlled = over_bowlled;
    }
    public void addRuns(int run) {
        this.total_run += run;
    }

    public void addWickets() {
        this.wicket_fallen+=1;
    }



    public void addOvers() {
        this.over_bowlled+=1;
    }

    public void addPlayer(Player player) {
        this.player.add(player);

    }

}
