public class LCM {
    static int gcd(int a, int b){
        if(a == 0)  return b;
        if(b == 0)  return a;
        if(a >= b)  return gcd(a % b, b);
        else return gcd(a, b % a);
    }
    static int findLcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    static void lcm(int ... A){
        int res = A[0];
        for(int eachValue: A){
            res = findLcm(res, eachValue);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        lcm(12, 36);
    }
}
