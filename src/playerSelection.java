

import java.util.Scanner;

public class playerSelection {
    public static void main(String[] args) {
        int firstLargestNumber = 0;
        int secondLargestNumber = 0;
        int firstMax=0;
        int secondMax=0;

        String[] playerNames = {"Kumar Sangakkara", "Mahela Jayawardhana", "Tilakarathne Dilshan", "Upul Tharanga", "Devon Conway", "Glenn Maxwell", "Kane Williamson", "Dhananjaya De Sliva", "Kevin Peterson", "Faf Du Plessis"};
        String[] playerAge = {"43", "44", "44", "36", "30", "32", "30", "30", "41", "36"};
        String[] playertype = {"batsman","batsman","batsman","batsman","batsman","batsman","batsman","batsman","batsman","batsman"};
        String[] runScored = {"1382", "1493", "1153", "407", "473", "1780", "1805", "334", "1176", "1528"};

        int[] intPlayerAge = new int[playerAge.length];
        for (int i = 0; i < intPlayerAge.length; i++) {
            intPlayerAge[i] = Integer.parseInt(playerAge[i]);
        }
        int[] intRunScored = new int[runScored.length];
        for (int i = 0; i < intRunScored.length; i++) {
            intRunScored[i] = Integer.parseInt(runScored[i]);
        }

        System.out.println("Add a palyer name           : Enter A");
        System.out.println("View all player             : Enter V");
        System.out.println("Display two best batmans    : Enter B");
        System.out.println("To exit                     : Enter E");
        System.out.println(" ");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a letter to continue the program.");
        String letter = input1.nextLine();

        switch (letter) {
            case "A":
                playerNames = addPlayer(playerNames);
                System.out.println("new version:");
                printAge(playerNames);

                playerAge = addAge(playerAge);
                System.out.println("new version:");
                printAge(playerAge);

                playertype = addPlayertype(playertype);
                System.out.println("new version:");
                printType(playertype);

                runScored = addRuns(runScored);
                System.out.println("new version:");
                printRuns(runScored);

                break;
            case "V":
                System.out.println("new version:");
                printWords(playerNames);
                break;

            case "B":

                for(int i:intRunScored){
                    if (firstLargestNumber<i){
                        secondLargestNumber=firstLargestNumber;
                        firstLargestNumber=i;
                        System.out.println(i);
                    }
                    else if(firstLargestNumber<i){
                        secondLargestNumber=i;
                    }
                }
                for(int i=0; i<intRunScored.length;i++){
                    if(intRunScored[i]==firstLargestNumber){
                        firstMax=i;
                    }
                for(int j=0; j<intRunScored.length;j++){
                    if(intRunScored[j]==secondLargestNumber){
                        secondMax=j;
                    }
                }

                }
                System.out.println(playerNames[firstMax]);
                System.out.println(playerNames[secondMax]);
                System.out.println("first largest number: "+firstLargestNumber);
                System.out.println("second largest number: "+secondLargestNumber);
        }
    }



    public static String[] addPlayer (String[]playerNames){
        String[] morePlayers = new String[playerNames.length + 1];
        for (int i = 0; i < playerNames.length; i++) {
            morePlayers[i] = playerNames[i];
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the player name: ");
        morePlayers[morePlayers.length - 1] = input2.nextLine();
        return morePlayers;
    }
    public static void printWords (String[]playerNames){
        for (int i = 0; i < playerNames.length; i++) {
            System.out.print(playerNames[i] + " ");
        }
        System.out.println(" ");

    }

    public static String[] addAge (String[] playerAge){
        String[] moreAge = new String[playerAge.length + 1];
        for (int i = 0; i < playerAge.length; i++) {
            moreAge[i] = String.valueOf(playerAge[i]);
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the player age: ");
        moreAge[moreAge.length - 1] = input2.nextLine();
        return moreAge;
    }
    public static void printAge (String[]playerAge){
        for (int i = 0; i < playerAge.length; i++) {
            System.out.print(playerAge[i] + " ");
        }
        System.out.println(" ");

    }

    public static String[] addPlayertype (String[]playertype){
        String[] morePlayers = new String[playertype.length + 1];
        for (int i = 0; i < playertype.length; i++) {
            morePlayers[i] = playertype[i];
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the player type: ");
        morePlayers[morePlayers.length - 1] = input2.nextLine();
        return morePlayers;
    }
    public static void printType(String[]playertype){
        for (int i = 0; i < playertype.length; i++) {
            System.out.print(playertype[i] + " ");
        }
        System.out.println(" ");

    }

    public static String[] addRuns (String[] runScord){
        String[] morePlayers = new String[runScord.length + 1];
        for (int i = 0; i < runScord.length; i++) {
            morePlayers[i] = runScord[i];
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the player runs: ");
        morePlayers[morePlayers.length - 1] = input2.nextLine();
        return morePlayers;
    }
    public static void printRuns (String[]runScord){
        for (int i = 0; i < runScord.length; i++) {
            System.out.print(runScord[i] + " ");
        }
        System.out.println(" ");

    }

}
