This is a java application that generates a summary report with the total number of phone numbers for each service provider.

The FileParser class contains 2 methods, a private file reader method and a public number documentation method.

File reader method, readFromFile(), takes in an object of Path Class that belongs to the java.nio.file package. The path object represents the txt file path.
A buffered reader is reads the file found in the path and returns a Stream of Strings.

The second method, numberDocumentation(), returns the total sum phone number that is categorized under each service provider and logs out a detailed phone number documentation.


