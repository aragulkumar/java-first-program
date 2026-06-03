public class loops {
    public static void main(String[] args){

        // for loop
        System.out.println("For Loop");
        for (int i=1; i <= 5; i++){
            System.out.println("Hiii" + i);
        }

        // While Loop

        System.out.println("While Loop");
        int j = 1;

        while (j<=5){
            System.out.println("While Loop" + j);
            j++;
        }

        // Do-Loop

        System.out.println("Do-Loop");
        int k = 1;
        do {
            System.out.println("Do-Loop number " + k);
            k++;
        } while (k <= 5);
    }
}
