public class ForEachLoop {
    public static void main(String[] args) {
        int[] A = {10, 20, 30};
        //for(d_type loop_variable: collection_name){
            //body
        //}
        for(int eachValue: A){
            System.out.println(eachValue * eachValue);
        }
        String[] names = {"Alice", "Bob", "Charlie"};
        for(String eachValue: names){
            System.out.println(eachValue);
        }
        for(String eachValue:names){
            System.out.println(eachValue.charAt(0));
        }
    }
}
