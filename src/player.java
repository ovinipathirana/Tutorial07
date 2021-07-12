public class player {
    private String Name;
    private int Age;
    private String playerType;
    private int runsScored;
    private int average;
    private String type;
    private String pType;

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
    public void averageRuns(int addScore){
        int average = addScore/15;
        System.out.println("Average runs of requested player is : "+average);

    }


    public void playersType(String pType) {
        System.out.println("Player type of requested player is: "+pType);
    }
}

