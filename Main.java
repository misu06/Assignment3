import java.util.Scanner;

public class Main {
    private Match match;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*******-----Welcome to Scorecard Application-----****");
        System.out.println("Press 1 for enter in App");
        System.out.println("Press 0 for exit App");
       int choice = input.nextInt();

       switch (choice) {


           case 1: {
               String team1name;
               while (true) {
                   System.out.println("Enter Team1 Name: ");
                   team1name = input.next();
                   if (!team1name.isEmpty()) {
                       break;
                   } else {
                       System.out.println("Team name cannot be empty");
                   }
               }
               Team team1 = new Team(team1name);
               System.out.println("Enter Team 1 : " + team1.getName() + " Player names :");
               for (int i = 1; i <= 11; i++) {
                   System.out.println("Enter Player " + i + " name : ");
                   String playerName = input.next();
                   if (playerName.isEmpty()) {
                       System.out.println("Player name cannot be empty");
                   } else {
                       team1.addPlayer(new Player(playerName));

                   }
               }

               String team2name;
               while (true) {
                   System.out.println("Enter Team2 Name: ");
                   team2name = input.next();
                   if (!team2name.isEmpty()) {
                       break;
                   } else {
                       System.out.println("Team name cannot be empty");
                   }
               }
               Team team2 = new Team(team2name);
               System.out.println("Enter Team 2 : " + team2.getName() + " Player names :");
               for (int m = 1; m <= 11; m++) {
                   System.out.println("Enter Player " + m + " name : ");
                   String playerName = input.next();
                   if (playerName.isEmpty()) {
                       System.out.println("Player name cannot be empty");
                   } else {
                       team2.addPlayer(new Player(playerName));

                   }
               }
               Match match = new Match(team1, team2);

               while (true) {
                   System.out.println("\n******---Match Menu*****---");
                   System.out.println("1. Conduct Toss");
                   System.out.println("2. Play Innings for " + team1name);
                   System.out.println("3. Play Innings for " + team2name);
                   System.out.println("4. Display Scorecard for " + team1name);
                   System.out.println("5. Display Scorecard for " + team2name);
                   System.out.println("6. Declare Match Winner");
                   System.out.println("7. Exit");
                   System.out.print("Choose given option: ");

                   int choice1 = input.nextInt();
                   input.nextLine();
                   switch (choice1) {
                       case 1: {
                           match.conductToss();
                       }
                       break;

                       case 2: {
                           match.playInning(team1);
                       }
                       break;

                       case 3: {
                           match.playInning(team2);
                       }
                       break;

                       case 4: {
                           match.scoreDisplay(team1);
                       }
                       break;

                       case 5: {
                           match.scoreDisplay(team2);
                       }
                       break;

                       case 6: {
                           match.winningTeam();
                       }
                       break;

                       case 7: {
                           System.out.println("Program exiting.....!");
                           return;
                       }

                       default: {
                           System.out.println("Invalid option!!!!");
                       }
                   }

               }

           }
           case 0: {
               System.out.println("Program exiting.....!");
               break;
           }
           default: {
               System.out.println("Invalid option!!!!");
           }
       }
               }

           }