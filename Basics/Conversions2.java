public class Conversions2 {
    public static void main(String[] args) {

        //Converting a number in string to int -> parseInt(string_name);

        System.out.println(Integer.parseInt("1234"));
        int a = Integer.parseInt("123");
        System.out.println(a-23);

        //Converting from other system to decimal system-> Integer.parseInt(string_name, base_of_string);

        String b = "0010";  //binary to decimal
        System.out.println(Integer.parseInt(b, 2)); //2

        String h = "a"; //hexadecimal to decimal
        //capitals and smalls also working
        System.out.println(Integer.parseInt(h, 16)); //10

        String o = "215";   //octal to decimal
        System.out.println(Integer.parseInt(o, 8)); //141

        //Integer.toString(variable_name, base_of_system_to_convert);
        //converts decimal to other systems

        int d1 = 10;   //Decimal to binary
        System.out.println(Integer.toString(d1, 2)); //1010

        int d2 = 10;   //Decimal to hexadecimal
        System.out.println(Integer.toString(d2, 16));   //a

        int d3 = 9;  //Decimal to octal
        System.out.println(Integer.toString(d3, 8));    //11

        int num = 100;
        System.out.println((char)num);
        
    }
}
