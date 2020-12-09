package InteractiveStory;

public class MainBook {
    public static void main(String[] args){
        Console console = new Console(System.in, System.out);
        Display loginMenu = new Display(console);
        loginMenu.runLoginMenu();

    }
}
