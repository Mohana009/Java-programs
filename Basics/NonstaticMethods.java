class NonstaticMethods{
    //need to work on this
    int getSum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        NonstaticMethods s = new NonstaticMethods();
        int sum = s.getSum(10, 20);
        System.out.println(sum);


        
    }
}