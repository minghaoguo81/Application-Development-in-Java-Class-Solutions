public class CustomizedHelloWorld {

    private String greeting = "Hello World!"; //or null

    //print  greeting
    public void greet() {
        System.out.println(greeting);
    }

    //setter method to set customized greeting
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public static void main(String[] args) {
        CustomizedHelloWorld helloWorld = new CustomizedHelloWorld(); //Instantiate

        // Set a customized greeting
        helloWorld.setGreeting("Hello, Frank!");
        helloWorld.greet();
    }
}