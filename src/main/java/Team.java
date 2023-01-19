import java.util.ArrayList;

public class Team<T extends Player>
{
    private String name;
    private ArrayList<T> member = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if (member.contains(player))
        {
            System.out.println((player).getName()+ " is already on the team ");
            return true;
        }else {
            member.add(player);
            System.out.println((player).getName()+ " picked for team " + this.name);
                    return false;
        }
    }
    public int numPlayers(){
        return this.member.size();
    }

}
