import java.util.Random;

public class Match {
    private Team team1;
    private Team team2;
    private Team battingFirst;
    private Team battingSecond;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.battingFirst = null;
        this.battingSecond = null;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getBattingFirst() {
        return battingFirst;
    }

    public void setBattingFirst(Team battingFirst) {
        this.battingFirst = battingFirst;
    }

    public Team getBattingSecond() {
        return battingSecond;
    }

    public void setBattingSecond(Team battingSecond) {
        this.battingSecond = battingSecond;
    }

    public void conductToss(){
        Random random = new Random();
        if (random.nextBoolean()) {
            battingFirst = team1;
            battingSecond = team2;
        } else {
            battingFirst = team2;
            battingSecond = team1;
        }
        System.out.println(battingFirst.getName() + " will bat first.");
    }

    public void playInning(Team team)
    {
        Random random = new Random();
        for (int over = 1; over <= 20; over++) {
            System.out.println("Over: " + over);
            for (int ball = 1; ball <= 6 ; ball++) {
                int run= random.nextInt(7);
                boolean wicketfall=random.nextBoolean();
                Player batsmen=team.getPlayer().get(team.getWicket_fallen());
              if(wicketfall) {
                  System.out.println("Wicket out : " + batsmen.getName());
                  batsmen.setOut();
                  team.addWickets();

                  if (team.getWicket_fallen() == 11) {
                      System.out.println("All team out!!!");
                      System.out.println("Total Runs : "+team.getTotal_run());
                      return;
                  }
              }
               else {
                  System.out.println("Ball " + ball + ":"+ run + " Runs");
                  batsmen.addRuns(run);
                  batsmen.addBallFaced();
                  team.addRuns(run);

               }



              }
            team.addOvers();

            }
        }
     public void scoreDisplay(Team team)
     {
         System.out.println("Score Card for team: " + team.getName() + ": ");
         for (int i = 0; i < team.getPlayer().size(); i++) {
             System.out.println("Player " + i + ": " + team.getPlayer().get(i).getName());
             System.out.println("Runs "+ team.getPlayer().get(i).getRuns());
             System.out.println("Balls "+ team.getPlayer().get(i).getBalls());
             System.out.println("*********************************************");
         }
         System.out.println("Total Runs : "+team.getTotal_run()+" Total wickets : "+team.getWicket_fallen()+"Total overs : "+team.getOver_bowlled());

    }

    public void winningTeam()
    {
        if(team1.getTotal_run()>team2.getTotal_run())
        {
            System.out.println("Winning Team 1: " + team1.getName() + " with runs : "+team1.getTotal_run());
        }
        else if (team2.getTotal_run()>team1.getTotal_run()){
            System.out.println("Winning Team 2: " + team2.getName() + " with runs : "+team2.getTotal_run());
        }
        else {
            System.out.println("Match is tie...!!!");
        }
    }
}
