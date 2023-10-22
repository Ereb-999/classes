import java.util.Objects;

public class Author {
    private final String authorName;
    private final String surnameName;
    private String patronic;
    public Author(String authorName, String surnameName){
        this.authorName = authorName;
        this.surnameName = surnameName;
        this.patronic = (patronic == null) ? "нет отчества" : patronic;
    }

    public String getAuthorName(){return this.authorName;}
    public String getSurnameName(){
        return this.surnameName;
    }
    @Override
    public String toString(){
        return authorName + " " + surnameName + " " + patronic;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(authorName, author.authorName) && Objects.equals(surnameName, author.surnameName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, surnameName);
    }
}
