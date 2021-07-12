public class player {
    private String Name;
    private int Age;
    private String playerType;
    private int runsScored;

    public player(String Name, int Age, String playerType, int runsScored) {
        this.Name=Name;
        this.Age=Age;
        this.playerType=playerType;
        this.runsScored=runsScored;
    }

    public void viewDetails() {
        String name;
        System.out.println("Player name     : " + Name);
        System.out.println("Player age      : "+ Age );
        System.out.println("Player type     : "+playerType );
        System.out.println("Runs score      : "+runsScored );
    }
}

