public class MethodsWithVariableSizedArguments {
    static void add(int ... A){
        //the values you send will be stored in A as array of the data type provided
        int sum = 0;
        for(int eachValue: A){
            sum += eachValue;
        }
        System.out.println(sum);
    }
    static String add(String ... names){
        String res = "";
        for(String eachName: names){
            res += eachName.charAt(0);
        }
        return res;
    }
    public static void main(String[] args) {
        add(100);
        add(100, 200, 300);
        add(100, 200, 300, 400, 500, 600);
        System.out.println(add("pavan"));
        System.out.println(add("pavan", "ashok"));
        System.out.println(add("pavan", "ashok", "ganapathi"));
    }
}
