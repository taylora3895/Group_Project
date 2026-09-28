/*
 * CAROLINA PANTHERS 2026 GROUP PROJECT - WORKING DRAFT
 *
 * Development notes:
 * 1. The group already had a PanthersPlayers2026.java file using arrays
 *    and JOptionPane. That file is preserved separately in the project.
 * 2. This draft tests a different approach using a Player class.
 * 3. Player information is read from an external CSV file instead of
 *    being stored directly in the Java source.
 * 4. Swing is used for the GUI.
 * 5. File output is being tested by saving a selected player's information.
 *
 * This is intentionally a development version. Additional comments and
 * notes are included to document the work before the final cleanup.
 */

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class PanthersApp {
    public static void main(String[] args) {

        // DEVELOPMENT TEST:
        // The CSV file must be in the data folder relative to the project.
        String playerFile = "data/panthers_players_2026.csv";

        try {
            // Read the player information from the external data file.
            List<Player> players =
                    PanthersFileManager.readPlayers(playerFile);

            // TESTING THE NUMBER OF RECORDS LOADED.
            System.out.println("Players loaded: " + players.size());

            // Start the Swing GUI.
            SwingUtilities.invokeLater(() -> {
                PanthersGUI gui = new PanthersGUI(players);
                gui.setVisible(true);
            });

        } catch (IOException ex) {
            // DEVELOPMENT ERROR MESSAGE.
            System.out.println("File error: " + ex.getMessage());

            JOptionPane.showMessageDialog(
                    null,
                    "The Panthers player data file could not be loaded.\n"
                            + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
