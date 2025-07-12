class Assigment6{

    public static void secondStep() {
        System.out.println("Second Step started");
        System.out.println("Second step ended");
    }
    public static void firstStep() {
        System.out.println("First Step started");
        secondStep();
        System.out.println("First step ended");
    }
    public static void main(String args[]){
        System.out.println("Main Started");
        firstStep();
        
        System.out.println("Main Ended");
    }

}