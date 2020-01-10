package TestProgram;

import java.util.Scanner;

 class Utils {
     static String takeUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input main command: ");
        String commandName = in.next();
        while(!validProgramName(commandName)){
            System.out.println("Avaliable command: exit, text");
            commandName = in.next();

        }
        in.close();
        System.out.println("Command Name: " + commandName);
        return commandName;
    }

    private static boolean validProgramName(String name) {
        if (name.equals("text")) return true;
        if (name.equals("exit")) return true;
        System.out.println("Wrong command");
        return false;
    }
}
