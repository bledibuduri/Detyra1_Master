import java.io.*;

// Detyra 2: Fajllat
public class FileHandler {

    // Metodë për përpunimin e statistikave
    public static void processStatistics(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Lexojme statistikën nga fajlli i hyrjes statistics.txt, me kontroll për null
            String line;
            int numLines = 0, numWords = 0, numChars = 0;

            // Lexojmë dhe përpunonjmë numrin e rreshtave
            if ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    numLines = Integer.parseInt(parts[1]); // Numri i rreshtave
                } else {
                    System.err.println("Format gabim i vlerës: " + line);
                }
            }

            // Lexojmë dhe përpunonjmë numrin e fjalëve
            if ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    numWords = Integer.parseInt(parts[1]); // Numri i fjalëve
                } else {
                    System.err.println("Format gabim i vlerës: " + line);
                }
            }

            // Lexojmë dhe përpunonojmë numrin e karaktereve
            if ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    numChars = Integer.parseInt(parts[1]); // Numri i karaktereve
                } else {
                    System.err.println("Format gabim i vlerës: " + line);
                }
            }

            // Kontrollojmë nëse numrat janë më të mëdhenj se zero për të shmangur ndarjen me zero
            if (numLines > 0 && numWords > 0) {
                // Llogarisim sa fjalë dhe karaktere duhet të shënohen si rezultat
                int wordsPerLine = numWords / numLines;
                int charsPerWord = numChars / numWords;

                // Ndërtojmë përmbajtjen për output
                StringBuilder lineBuilder = new StringBuilder();
                String word = "a".repeat(charsPerWord); // Fjalë me karaktere të përsëritura
                for (int i = 0; i < wordsPerLine; i++) {
                    lineBuilder.append(word).append(" ");
                }

                // Shkruajmë rezultatin në fajllin e daljes
                String outputLine = lineBuilder.toString().trim();
                for (int i = 0; i < numLines; i++) {
                    writer.write(outputLine);
                    writer.newLine();
                }
            } else {
                // Shtojmë një mesazh gabimi në rast se ka zero rreshta ose fjalë
                System.err.println("Gabim: Statistikë e pavlefshme (zero rreshta ose fjalë).");
            }

        } catch (IOException e) {
            // Trajtojmë gabimet e I/O gjatë leximit dhe shkrimit të fajllit
            System.err.println("Gabim gjatë operacioneve të I/O: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Trajtojmë gabimet nëse nuk mund të konvertohen numrat nga teksti
            System.err.println("Gabim gjatë analizës së numrave në fajll: " + e.getMessage());
        }
    }

    // Metoda kryesore për të demonstruar FileHandler dhe përdorimin e tij
    public static void main(String[] args) {
        // Shembull për përdorimin e FileHandler
        FileHandler.processStatistics("statistics.txt", "output.txt");
    }
}
