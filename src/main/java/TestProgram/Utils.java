package TestProgram;

import java.util.Scanner;

class Utils {
    static ProgramBody programBody = new ProgramBody();

    static String takeUserInput() {
        Scanner in = new Scanner(System.in);
        if (programBody.getName() == null) {
            System.out.print("Input command:  ");
            programBody.setName(in.next());

            while (!validProgramName(programBody.getName())) {
                System.out.println("Avaliable command: exit, text");
                programBody.setName(in.next());

            }
            in.close();
            System.out.println("Command Name: " + programBody.getName());
            return programBody.getName();
        }
        System.out.print("Input some text:  ");
        String someText = in.next();
        in.close();
        return someText;
    }

    private static boolean validProgramName(String name) {
        if (name.equals("text")) return true;
        if (name.equals("exit")) return true;
        System.out.println("Wrong command");
        return false;
    }
}
