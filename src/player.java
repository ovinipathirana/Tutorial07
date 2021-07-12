public class player {
    private String Name;
    private String Age;
    private String playerType;
    private String runsScored;

    public player(String Name, String Age, String playerType, String runsScored) {
        this.Name=Name;
        this.Age=Age;
        this.playerType=playerType;
        this.runsScored=runsScored;
    }

    public void viewDetails() {
        String name;
        System.out.println("Player name     : " + Name);
    }
}

