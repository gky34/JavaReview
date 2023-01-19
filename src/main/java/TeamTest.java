public class TeamTest
{
    public static void main(String[] args)
    {
        FootballPlayer joe = new FootballPlayer("Joe");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<SoccerPlayer> liverPool = new Team("Liverpool");

//        Team<String> brokenTeam = new Team<>("this wont work");

//        liverPool.addPlayer(joe);
//        liverPool.addPlayer(pat);
        liverPool.addPlayer(beckham);

        System.out.println(liverPool.numPlayers());

    }
}
