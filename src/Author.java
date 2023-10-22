public class Author {
    private String authorName;
    private String surnameName;
    public Author(String authorName, String surnameName){
        this.authorName = authorName;
        this.surnameName = surnameName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public String getSurnameName(){
        return this.surnameName;
    }
}
