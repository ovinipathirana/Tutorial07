public class player {
    public class Player {
        private String Name;
        private int Age;
        private String playerType;
        private int runsScored;

        public Player(String Name,int Age,String playerType,int runsScored){
            this.Name=Name;
            this.Age=Age;
            this.playerType=playerType;
            this.runsScored=runsScored;

        }
        void runsAverage(){
            double runRate= runsScored/15;
            System.out.println("Runs Average : "+runRate);
        }
        void viewDetails(){
            System.out.println("Player name     : "+Name);
            System.out.println("Player age      : "+Age);
            System.out.println("Player type     : "+playerType);
            System.out.println("Runs score      : "+runsScored);
        }


        void bestPerformance(){

        }
        void getPlayerType(){

        }
    }

}
