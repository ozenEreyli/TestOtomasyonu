package tests;

public class Main {

    public static void main(String[] args){

        org.testng.TestNG.main(new String[]{"-d", "target/test-classes","tests.Test"});

    }

}
