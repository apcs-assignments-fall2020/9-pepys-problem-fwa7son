public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int x = 0;
        for (int i = 0; i < 10000; i++){
            for (int j = 0; j < 6; j++){
                int numbresult = (int)((Math.random() * 6) + 1);
                if (numbresult == 6){
                    x += 1;
                    break;
                }
            }
        }
        double result = (float)x / (float)10000* 100;
        return (result);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double total = 0.0;
        for (int i = 0; i < 10000; i++){
            int numb = 0;
            for (int x = 0; x < 12; x++){
                int random = (int)(Math.random()*6) + 1;
                if (random == 6){
                    numb += 1;
                }
                if (numb == 2){
                    total += 1;
                    break;
                }
            } 
        }
        return (total/10000.0)*100.0;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double total = 0.0;
        for (int i = 0; i < 10000; i++){
            int numb = 0;
            for (int x = 0; x < 18; x++){
                int random = (int)(Math.random()*6) + 1;
                if (random == 6){
                    numb += 1;
                }
                if (numb == 3){
                    total += 1;
                    break;
                }
            } 
        }
        return (total/10000.0)*100.0;
    }


    public static void main(String[] args) {
        System.out.println("The probability of rolling six dice and getting at least one 6: " + probabilityOneSix());
        System.out.println("The probability of rolling twelve dice and getting at least two 6s: " + probabilityTwoSixes());
        System.out.println("the probability of rolling 18 and getting 3 6s:" + probabilityThreeSixes());
    }
}
