package task5;

public class Author {
    private String fName;
    private String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (fName != null ? !fName.equals(author.fName) : author.fName != null) return false;
        return lName != null ? lName.equals(author.lName) : author.lName == null;
    }

    @Override
    public int hashCode() {
        int result = fName != null ? fName.hashCode() : 0;
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author: " + getfName() + " " + getlName();
    }

}