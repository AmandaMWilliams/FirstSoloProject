package InteractiveStory.tools;

import InteractiveStory.Storyline;

public class Display extends Storyline {
    private Console console;
    private boolean storyStarted = true;

    public Display(Console console) {
        this.console = console;
    }


    public void runLoginMenu() {
            console.print("\n" +
                    "Welcome to your story!\n");
            String name = console.getStringInput("Please enter your name:  ");
            userWelcome(name);
    }

    public void userWelcome(String name) {
        console.print("Hi, " + name + ". Let's start the story.\n\n");
        name = "Little Red Riding " + name;
        storyScript1(name);
        storyDecision1();
    }


}