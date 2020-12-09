package InteractiveStory;

public class Display {
    private Console console;
    private boolean storyStarted = true;

    public Display(Console console) {
        this.console = console;
    }

    public String userWelcome(String name) {
        String output = console.print("Hi, " + name + ". Let's create a story.");
        return output;
    }

    public String runLoginMenu() {
        String output = null;
        while (storyStarted) {
            console.print("\n" +
                    "Welcome to your story!\n");
            String name = console.getStringInput("Please enter your name:  ");
            output = userWelcome(name);
            console.println(output);
        }
        return output;
    }
}
