public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello world!");
        System.out.println("Original SringBuffer: " + sb);
        //To remove a character
        sb.deleteCharAt(5); //' ' space is removed
        System.out.println("After removing character at index 5: " + sb);
        //To delete
        int start = 4;
        int end = 7;
        sb.delete(start, end);
        System.out.println("After deleing: " + sb);
    }
}
