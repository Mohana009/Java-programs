public class Two_D_Array2 {
    public static void main(String[] args) {
        String[] moneyHeist = {"professor", "berlin", "tokyo"};
        String[] squidGame = {"player-456", "player-100", "player-222"};
        String[] breakingBad = {"walter", "jesse", "skyler"};
        String[][] webSeriesCast = {moneyHeist, squidGame, breakingBad};

        //outer loop runs on rows
        for(int i = 0; i < webSeriesCast.length; i++){
            //inner loop runs on columns
            for(int j = 0; j < webSeriesCast[i].length; j++){
                System.out.print(webSeriesCast[i][j] + " ");
            }
            System.out.println();
        }
    }
}
