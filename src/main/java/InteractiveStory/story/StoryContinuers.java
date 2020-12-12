package InteractiveStory.story;

import InteractiveStory.player.Reader;
import InteractiveStory.tools.Console;

import java.lang.invoke.SwitchPoint;

public class StoryContinuers {
    private Reader reader;
    private Integer selection;

    public StoryContinuers(String name) {
        this(new Reader(name));
    }

    public StoryContinuers(Reader reader) {
        this.reader = reader;
    }

    public void followButterfly(String name) {
        Console.print("\n%s chose the left path.\n\n" +
                "%s followed a butterfly down the sunny path to a moss covered rock.\n" +
                "%s found a chancleta!\n", name, name, name);
        reader.add("Chancleta");
    }

    public void getWolfDecision(String name) {
        selection =
                Console.getIntegerInput("%s sat on the rock to take a break.\n"
                        + "Just then, the Big Bad Wolf appeared from behind a tree.\n" +
                        "He smiled at %s with a ferocious grin.\n\n" +
                        "---------------------------------------------\n\n"
                        + "1. Talk to the wolf\n"
                        + "2. Run away", name, name);
        encounterWolfSwitch(selection, name);
    }

    public void encounterWolfSwitch(Integer selection, String name) {
        switch (selection) {
            case 1:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.storyEnderWolfChat(name);  //End Game
                break;
            case 2:
                stopAtLake(name);  //Continue to next method
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                getWolfDecision(name);  //Circle to previous decision menu
                break;
        }
    }

    public void stopAtLake(String name) {
        Console.print("\n%s ran and ran until they reached the lake at the edge of Grandma's property.\n" +
                "The sneaky wolf knew %s must be going to visit Grandma. \n" +
                "So he took the super secret back way to beat %s to Grandma's house.\n\n", name, name, name);
        lakeDecision(name);
    }

    public void lakeDecision(String name) {
        selection = Console.getIntegerInput("The lake was blue and beautiful.\n" +
                "%s saw something shiny in the water.\n\n" +
                "---------------------------------------\n\n" +
                "1. Pick up the shiny thing\n" +
                "2. Ignore the shiny thing and walk away", name);
        pickUpShinySwitch(selection, name);
    }

    public void pickUpShinySwitch(Integer selection, String name) {
        switch (selection) {
            case 1:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.storyEnderReachIntoWater(name);  //End Game
                break;
            case 2:
                fishGetTeeth(name);
                madeItToGrandmasDecision(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                lakeDecision(name); //Circle to previous decision menu
                break;
        }
    }

    private void fishGetTeeth(String name) {
        Console.print("\n%s finished resting and began to walk away toward Grandma's.\n" +
                "Just as %s turned, a fish swam passed the shiny object,\n" +
                "launching it from the water, and hitting %s in the head.\n" +
                "%s found a Grandma's teeth!\n", name, name, name, name);
        reader.add("Grandma's teeth");
    }

    private void madeItToGrandmasDecision(String name) {
        selection = Console.getIntegerInput("\n%s rubbed their head, and walked up the little path to Grandma's front door.\n" +
                "* Knock-knock *\n.\n..\n...\n..\n.\n* Knock-knock *\n\n" +
                "\"Grandma, I'm here.\" said %s.\n\n" +
                "\"Come in, my dear\" said the voice from inside.\n\n" +
                "----------------------------------------\n\n" +
                "1. Open the door and go inside\n" +
                "2. Tell Grandma your hands are full from gathering random stuff in the woods\n" +
                "    and make her open the door for you.", name, name);
        enterGrandmasHouseSwitch(selection, name);
    }

    private void enterGrandmasHouseSwitch(Integer selection, String name) {
        switch (selection) {
            case 1:
                encounterGrandma(name);
                break;
            case 2:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.storyEnderSassGrandma(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                madeItToGrandmasDecision(name);
                break;
        }
    }

    private void encounterGrandma(String name) {
        Console.print("\n%s walked into Grandma's house.\n" +
                "Poor old Grandma was lying in bed all covered up.\n\n", name);
        grandmaWolfDecision(name);
    }

    private void grandmaWolfDecision(String name) {
        selection = Console.getIntegerInput("Grandma is looking very strange.\n\n" +
                "------------------------------------\n\n" +
                "1. Comment on Grandma's appearance\n" +
                "2. Show Grandma all the cool stuff you brought\n", name);
        grandmaAppearanceSwitch(selection, name);
    }

    private void grandmaAppearanceSwitch(Integer selection, String name) {
        switch (selection) {
            case 1:
                whatBigEyes(name);
                break;
            case 2:
                showGoods(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                grandmaWolfDecision(name);
        }
    }

    private void whatBigEyes(String name) {
        Console.print("\n\"Grandma, what big eyes you have\" said %s.\n" +
                "\"The better to see you with, my dear.\" replied Grandma blinking her big black eyes.\n" +
                "\"Grandma, what big ears you have\" said %s.\n" +
                "\"The better to hear you with, my dear.\" said Grandma wiggling her big pointy ears.\n" +
                "\"Grandma, what big teeth you have\" said %s.\n" +
                "\"The better to eat you with, my dear!!!\"\n\n", name, name, name);
        wolfAttackDecision(name);
    }

    private void showGoods(String name) {
        //show teeth first, notice wolfGrandma has teeth
        //Offer switch to get chancleta
        //Beat wolf and rescue grandma, give teeth, eat cookies
    }

    private void wolfAttackDecision(String name) {
        selection = Console.getIntegerInput("Grandma leaped out of bed toward %s. It was THE WOLF!!!\n\n" +
                "------------------------------------------\n\n" +
                "1. Use *chancleta* to hit wolf\n" +
                "2. Let the wolf eat you\n", name);
        wolfAttackSwitch(selection, name);
    }

    private void wolfAttackSwitch(Integer selection, String name) {
        switch (selection){
            case 1:
                //remove chancleta from itemInventory
                fightStoryline(name);
            case 2:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.getEaten(name);
            default:
                Console.println("Incorrect selection. Please try again.\n");
                wolfAttackDecision(name);
        }
    }

    private void fightStoryline(String name) {
        Console.print("\n%s reacted quickly!\n" +
                "The second The Wolf lunged, %s whipped out the *chancleta* and smacked The Wolf into submission!!!\n" +
                "The Wolf ran away screaming and crying.\n" +
                "VICTORY!!!\n\n" +
                "Just then %s heard a rumble from inside the closet.\n" +
                "*chancleta* in hand, %s bravely opened the closet door.\n" +
                "It was Grandma! Safe and sound.\n\n", name, name, name, name);
        StoryEnders storyEnders = new StoryEnders(name);
        storyEnders.storyEnderEatCookiesWithGrandma(name);
    }


}