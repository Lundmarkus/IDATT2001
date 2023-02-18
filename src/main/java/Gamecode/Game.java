package Gamecode;

public class Game {

    private Player player;
    private Story story;
    private List<Goal> goals;


    Game(Player player, Story story, List<goal> goals) {
        this.player = player;
        this.story = story;
        this.goals = goals;
    }



    private Player getPlayer() {
        return this.player;
    }


    private Story getStory(){
        return this.story;
    }


    private List<Goal> getGoals{
        return this.goals;
    }


    public Passage begin() {
        return this.story.getOpeningPassage();
    }

    public Passage go(Link link) {
        return
    }

}
