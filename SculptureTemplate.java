 /** SculptureTemplate is an interface intended to maintain a global list of
    constants (final) accessible throughout the program. Naturally, nearly
    every class that needs the details of the file or fields would need to 
    implement it. This is a way around "global variables" done C/C++
*/
public interface SculptureTemplate {
    public static final int NUMBER_OF_FIELDS = 5;
    public static final String[] FIELD_LABELS = {"FID", "Title", "Location", "Artist", "Material"};
    public static final String[] FIELD_TYPES = {"Integer", "String", "String", "String", "String"}; // Not used
    public static final String FILE_NAME = "sculptures.txt";
    public static final String DELIMITER = ",";
    public static final int PRIMARY_KEY_FIELD_INDEX = 0; // Not used 
}
