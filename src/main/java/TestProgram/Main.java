package TestProgram;

import static TestProgram.Utils.programBody;

public class Main {
    public static void main (String[] args){


//        programBody.setName("text");
        Utils.takeUserInput();
        if(
        programBody.getName().equals("text")){
            System.out.println(Utils.takeUserInput());
        }
    }
}
