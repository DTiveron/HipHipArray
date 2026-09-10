public class ArrayReview{
    public static void main(String[] args) {
        
        /*
        The array is one of our foundational implementation dependent data structures.

        We will use the array to build our implementation independent data structures.
        
        */

        int[] scores = {60, 54, 39, 81};
        System.out.println(scores.length);
        System.out.println(scores[0]);

        scores[1] = 52;
        System.out.println(scores[1]);
        System.out.println(scores.toString());

        for(int s : scores){
            System.out.print(s + " ");
        }
        System.out.println();   
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        double[] grades = new double[5];
        for(double g : grades){
            System.out.print(g + " ");
        }
        System.out.println();
    }
}