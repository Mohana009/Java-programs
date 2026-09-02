public class Two_D_Array5 {
    public static void main(String[] args) {
        int[][] A = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        for(int[] eachArray: A){
            for(int eachValue: eachArray){
                System.out.print(eachValue + " ");
            }
            System.out.println();
        }

        String[][] names ={{"Alice", "Bob"}, {"Charlie", "David"}, {"Frank", "Garry"}};
        for(String[] eachArray: names){
            for(String eachValue: eachArray){
                System.out.print(eachValue + " ");
            }
            System.out.println();
        }
    }
}
