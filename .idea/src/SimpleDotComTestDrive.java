public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationsCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "fault";

        if (result.equals("hit")) {
            testResult = "Pass";
        }

        System.out.println(testResult);
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