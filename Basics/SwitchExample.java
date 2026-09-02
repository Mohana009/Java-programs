public class SwitchExample {
    public static void main(String[] args) {
        String status = "Close";
        switch(status){
            case "Open":
                System.out.println("File is opened");
                break;
            case "Close":
                System.out.println("Flie is closed");
                break;
            default:
            System.out.println("Not a valid command");
        }
    }
}
