package Gamecode;

public class Link {

    private String text;
    private String reference;
    private List<Action> actions;


    Link(String text, String reference) {
        this.text = text;
        this.reference = reference;
    }

    public String getText() {
        return text;
    }

    public String getReference() {
        return reference;
    }


    public void addAction(Action action) {
        actions.add(action);
    }

    public List<Action> getActions(){
        return actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (text != null ? !text.equals(link.text) : link.text != null) return false;
        if (reference != null ? !reference.equals(link.reference) : link.reference != null) return false;
        return actions != null ? actions.equals(link.actions) : link.actions == null;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        result = 31 * result + (actions != null ? actions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Link{" +
                "text='" + text + '\'' +
                ", reference='" + reference + '\'' +
                ", actions=" + actions +
                '}';
    }
}
