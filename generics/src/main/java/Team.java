import java.util.ArrayList;

// We add type checking in class too so not everybody can join the team now
// We accept only types belongs the Player and we need to know what need to pass
public class Team <T extends Player>
{
    private String name;
    private ArrayList<T> members = new ArrayList();
    // Type checking is very important because we can add any team member
    // We add the type with T and we can do sort it based on the team player

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if (members.contains(player))
        {
            System.out.println(player.getName()+ " is already on the team ");
            return true;
        }else {
            members.add(player);
            System.out.println(player.getName()+ " picked for team " + this.name);
            return false;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }
}

/*
    We just want to create a team
        - Either they can sign up football, baseball, soccer team

    this represents the Object
    Left side is the object and right side is the parameter

 */