package InteractiveStoryTest;

import InteractiveStory.story.StoryEnders;
import org.junit.Assert;
import org.junit.Test;

public class GameEndersTest {
    @Test
    public void storyEnderRPTest() {
        //given
        String expectedName = "Bob";
        StoryEnders enders = new StoryEnders(expectedName);
        Boolean isGameOver = false;
        //when
        enders.storyEnderRightPath(expectedName);
        //then
        Assert.assertFalse(isGameOver);
    }

}
