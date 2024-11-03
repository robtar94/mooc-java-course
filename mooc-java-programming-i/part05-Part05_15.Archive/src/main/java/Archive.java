public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true; // Check if both objects are the same instance
        }
        if (!(compared instanceof Archive)) {
            return false; // Check if the object is of the same class
        }
        Archive comparedArchive = (Archive) compared;

        // Use .equals() to compare the content of strings
        return this.identifier.equals(comparedArchive.identifier);
    }

}
