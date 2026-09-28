import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PanthersFileManager {

    public static List<Player> readPlayers(String fileName) throws IOException {
        List<Player> players = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // Skip CSV header

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length >= 6) {
                    players.add(new Player(
                            data[0].trim(),
                            data[1].trim(),
                            data[2].trim(),
                            data[3].trim(),
                            data[4].trim(),
                            data[5].trim()
                    ));
                }
            }
        }

        return players;
    }

    public static void savePlayer(Player player, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Saved Panthers Player");
            writer.println("---------------------");
            writer.println(player);
            writer.println();
        }
    }
}
