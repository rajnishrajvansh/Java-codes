import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Hyena {
    private String id;
    private String name;
    private Date birthDate;
    private String color;
    private String gender;
    private int weight;
    private String origin;
    private Date arrivalDate;

    public Hyena(String id, String name, Date birthDate, String color, String gender, int weight, String origin, Date arrivalDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
        this.origin = origin;
        this.arrivalDate = arrivalDate;
    }

    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "• Hyena Habitat:\n\n" +
                "• " + id + "; " + name + "; birth date: " + dateFormat.format(birthDate) +
                "; " + color + " color; " + gender + "; " + weight + " pounds; from " + origin +
                "; arrived " + dateFormat.format(arrivalDate);
    }
}

public class FileHandling {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String[] attributes = parts[0].split(" ");

                String id = "Hy01"; // Assuming Hyena IDs are generated sequentially
                String name = attributes[4];
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date birthDate = dateFormat.parse(attributes[0]);
                String color = parts[3];
                String gender = attributes[3];
                int weight = Integer.parseInt(parts[4].split(" ")[0]);
                String origin = parts[7];
                Date arrivalDate = new Date(); // Assuming arrival date is the current date

                Hyena hyena = new Hyena(id, name, birthDate, color, gender, weight, origin, arrivalDate);
                writer.write(hyena.toString());
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Output has been written to " + outputFileName);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
