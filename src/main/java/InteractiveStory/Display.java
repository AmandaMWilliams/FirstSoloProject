package InteractiveStory;

public class Display {
    private Console console;

    public void loginMenu(Console console){
        this.console = console;
    }

    public String runLoginMenu(){
        String output = null;
        console.print("\n" +
                "Welcome to your story!\n");
        String name = console.getStringInput("Please enter your name:  ");
        output = userWelcome(name);
        console.println(output);
        return output;
    }

    public String userWelcome(String name){
        String output = null;
        return output;
    }
}
