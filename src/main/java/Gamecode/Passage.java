package Gamecode;

import java.util.List;

public class Passage {

    private String title;
    private String content;
    private List<Link> links;

    public Passage(String title, String content) {
        this.title = title;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<Link> getLinks() {
        return links;
    }

    public boolean hasLinks() {
        return !this.getLinks().isEmpty();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passage passage = (Passage) o;

        if (!title.equals(passage.title)) return false;
        if (!content.equals(passage.content)) return false;
        return links.equals(passage.links);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + content.hashCode();
        result = 31 * result + links.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Passage{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", links=" + links +
                '}';
    }
}
