package org.example;

import java.text.MessageFormat;

public class Player {
    private String name;
    private String costume;
    private int piecesOfCandy;

    public void setName(String name) {
        this.name = name;
    }
    public void setCostume(String costume){
        this.costume = costume;
    }
    public void setPiecesOfCandy(int candy){
        this.piecesOfCandy = candy;
    }

    public int getPiecesOfCandy() {
        return piecesOfCandy;
    }

    public String getName() {
        return name;
    }

    public String getCostume() {
        return costume;
    }

    public void TrickOrTreat(){
        int min = 1;
        int max = 4;
        int randInt = (int)Math.floor(Math.random() * (max - min +1) +min);

        switch (randInt){
            case 1:
                min = 5;
                max = 15;
                int randCand = (int) Math.floor(Math.random() * (max - min +1) +min);
                int canNum = randCand;
                randCand += getPiecesOfCandy();
                setPiecesOfCandy(randCand);
                System.out.println(MessageFormat.format("{0}: Trick or Treat!", getName()));
                System.out.println(MessageFormat.format("Homeowner: what a cool {0} Here is {1} pieces of candy.", getCostume(), canNum));
                System.out.println(MessageFormat.format("[The Homeowner Drops {0} pieces of candy into your bucket]", canNum));
                System.out.println(MessageFormat.format("{0}: Sweet! Thank you!", getName()));
                System.out.println("Homeowner: Happy Halloween\n");
                System.out.println(MessageFormat.format("[You are carrying {0} pieces of candy]", getPiecesOfCandy()));
                break;
            case 2:
                System.out.println(MessageFormat.format("{0}: Trick or Treat!", getName()));
                System.out.println(MessageFormat.format("Homeowner: A {0}! That costume is too Scary!", getCostume()));
                System.out.println("[The Homeowner pelts you with rocks before going back inside their home!]\n");
                System.out.println(MessageFormat.format( "[You are carrying {0} pieces of candy]", getPiecesOfCandy()));
                break;
            case 3:
                System.out.println(MessageFormat.format("{0}: Trick or Treat!", getName()));
                System.out.println(MessageFormat.format("Homeowner: A {0}! That costume is too Scary!", getCostume()));
                System.out.println("[The Homeowner puts rocks inside your bucket!]\n");
                System.out.println(MessageFormat.format( "[You are carrying {0} pieces of candy]", getPiecesOfCandy()));
                break;
            case 4:
                min = 5;
                max = 15;
                randCand = (int) Math.floor(Math.random() * (max - min +1) +min);
                canNum = randCand;
                randCand += getPiecesOfCandy();
                setPiecesOfCandy(randCand);
                System.out.println(MessageFormat.format("{0}: Trick or Treat!", getName()));
                System.out.println(MessageFormat.format("Homeowner: A {0} what a creative costume! Here is {1} pieces of candy.", getCostume(), canNum));
                System.out.println(MessageFormat.format("[The Homeowner Drops {0} pieces of candy into your bucket]", canNum));
                System.out.println(MessageFormat.format("{0}: Sweet! Thank you!", getName()));
                System.out.println("Homeowner: Happy Halloween\n");
                System.out.println(MessageFormat.format("[You are carrying {0} pieces of candy]", getPiecesOfCandy()));
                break;
        }

    }
}
