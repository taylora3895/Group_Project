import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class PanthersApp {
    public static void main(String[] args) {
        try {
            List<Player> players =
                    PanthersFileManager.readPlayers("data/panthers_players_2026.csv");

            SwingUtilities.invokeLater(() -> {
                PanthersGUI gui = new PanthersGUI(players);
                gui.setVisible(true);
            });
        } catch (IOException ex) {
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
