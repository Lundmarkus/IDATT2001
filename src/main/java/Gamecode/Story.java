package Gamecode;

import java.util.Collection;
import java.util.Map;

public class Story {

    private String title;
    private Map<Link, Passage> passages;
    private Passage openingPassage;

    public Story(String title, Map<Link, Passage> passages, Passage openingPassage) {
        this.title = title;
        this.passages = passages;
        this.openingPassage = openingPassage;
    }

    public String getTitle() {
        return this.title;
    }

    public Passage getOpeningPassage() {
        return this.openingPassage;
    }


    public void addPassage(Passage passage){
        String title = passage.getTitle();
        Link link = new Link(title, title);
        passages.put(link, passage);
    }

    public Passage getPassage(Link link) {
        return passages.get(link);
    }

    public Collection<Passage> getPassage() {
        return passages.values();
    }




}
