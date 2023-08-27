public class TeamTest
{
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        BaseballPlayer pat = new BaseballPlayer("Pat");

/*
      Team liverPool = new Team("Liverpool");

      Since we have constructor and not empty constructor we need to give a name while creating object
      The issue we had
        We can add any player above object created because we didn't specify the generic types
 */

        Team<SoccerPlayer> liverPool = new Team<>("Liverpool");

        /*
              Team<String> brokenTeam = new Team<>("this wont work");


         */

        liverPool.addPlayer(beckham);
//        liverPool.addPlayer(joe);
//        liverPool.addPlayer(pat);

        // we can't add it above name because they belong to another teams
        // so that's the reason we use the generics and sort the team members


        System.out.println(liverPool.numPlayers());
    }
}
/*
    new keyword always trigger the constructor always

 */