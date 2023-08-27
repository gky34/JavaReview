public abstract class Player
{
    private String name;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
/*
    The reason we made abstract class
        - There will be some class and extend this class and we don't want to create any object from this class
 */