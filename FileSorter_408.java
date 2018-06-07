import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSorter_408 {
  public static String header = null;

  public FileSorter_408() {
  }

  public void sortFile(String inputFilePath, String outputFilePath) {
    try {
      //reading all lines from csv file and place lines in array list
      ArrayList<String> csvLines = readAllLinesFromCSVFile(inputFilePath);
      //convert array list of strings into arraylist of persons
      ArrayList<Person_408> persons = convertToPersons(csvLines);
      //sorting based on age asc
      Collections.sort(persons);
      //writing sorted persons data into a csv file
      writeCSV(outputFilePath, persons);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) throws IOException {
    FileSorter_408 fileSorter_408 = new FileSorter_408();
    fileSorter_408.sortFile("D:/GitlabWork/CSVRead/unsorted_data.csv", "D:/GitlabWork/CSVRead/sorted_data.csv");
  }

  public void writeCSV(String outputFilePath, List<Person_408> persons) throws IOException {
    File output = new File(outputFilePath);
    Path path = Paths.get(output.toURI());
    List<String> listPersons = new ArrayList<>();
    listPersons.add(header);
    for (Person_408 person : persons) {
      listPersons.add(person.toString());
    }
    Files.write(path, listPersons);
  }

  public ArrayList<String> readAllLinesFromCSVFile(String inputFilePath) throws IOException {
    ArrayList<String> csvLines = new ArrayList<>();
    FileReader fileReader = new FileReader(inputFilePath);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
      csvLines.add(line);
    }
    bufferedReader.close();
    return csvLines;
  }

  public ArrayList<Person_408> convertToPersons(ArrayList<String> csvLines) {
    ArrayList<Person_408> persons = new ArrayList<>();
    header = csvLines.get(0);
    csvLines.remove(0);
    for (String personStringLine : csvLines) {
      String[] parts = personStringLine.split(",");
      String name = parts[0];
      int age = Integer.valueOf(parts[1]);
      char gender = parts[2].charAt(0);
      Person_408 person = new Person_408(name, age, gender);
      persons.add(person);
    }
    return persons;
  }
}
