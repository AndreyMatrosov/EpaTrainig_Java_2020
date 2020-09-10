import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationsCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Input Number");

            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("hit")) {
                isAlive = false;
                System.out.println("it took" + numOfGuesses + "attempt(s)");
            }
        }
    }
}

class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationsCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "fault";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "sunk";
        }
        System.out.println(result);
        return result;
    }
}

class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}