import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class PanthersGUI extends JFrame {
    private final List<Player> players;

    public PanthersGUI(List<Player> players) {
        this.players = players;

        setTitle("Carolina Panthers 2026 Player Explorer");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buildGUI();
    }

    private void buildGUI() {
        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel title = new JLabel("CAROLINA PANTHERS 2026", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));

        JButton viewButton = new JButton("View Roster");
        JButton searchButton = new JButton("Search Player");
        JButton positionButton = new JButton("Search by Position");
        JButton saveButton = new JButton("Save Player Information");
        JButton exitButton = new JButton("Exit");

        viewButton.addActionListener(e -> viewRoster());
        searchButton.addActionListener(e -> searchPlayer());
        positionButton.addActionListener(e -> searchPosition());
        saveButton.addActionListener(e -> savePlayer());
        exitButton.addActionListener(e -> System.exit(0));

        panel.add(title);
        panel.add(viewButton);
        panel.add(searchButton);
        panel.add(positionButton);
        panel.add(saveButton);
        panel.add(exitButton);

        add(panel);
    }

    private void viewRoster() {
        StringBuilder output = new StringBuilder("CAROLINA PANTHERS 2026 ROSTER\n\n");

        for (Player player : players) {
            output.append("#").append(player.getJerseyNumber())
                    .append(" ").append(player.getName())
                    .append(" - ").append(player.getPosition())
                    .append("\n");
        }

        showText(output.toString());
    }

    private void searchPlayer() {
        String search = JOptionPane.showInputDialog(
                this, "Enter a player's name:");

        if (search == null || search.trim().isEmpty()) {
            return;
        }

        StringBuilder output = new StringBuilder();
        String searchText = search.trim().toLowerCase();

        for (Player player : players) {
            if (player.getName().toLowerCase().contains(searchText)) {
                output.append(player).append("\n\n");
            }
        }

        if (output.length() == 0) {
            showText("No player was found matching: " + search);
        } else {
            showText(output.toString());
        }
    }

    private void searchPosition() {
        String position = JOptionPane.showInputDialog(
                this, "Enter a position (QB, RB, WR, TE, etc.):");

        if (position == null || position.trim().isEmpty()) {
            return;
        }

        StringBuilder output = new StringBuilder(
                "PLAYERS AT POSITION: " + position.toUpperCase() + "\n\n");

        for (Player player : players) {
            if (player.getPosition().equalsIgnoreCase(position.trim())) {
                output.append("#").append(player.getJerseyNumber())
                        .append(" ").append(player.getName())
                        .append("\n");
            }
        }

        showText(output.toString());
    }

    private void savePlayer() {
        String search = JOptionPane.showInputDialog(
                this, "Enter the player name to save:");

        if (search == null || search.trim().isEmpty()) {
            return;
        }

        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(search.trim())) {
                try {
                    PanthersFileManager.savePlayer(
                            player, "data/saved_players.txt");
                    showText("Player information was saved successfully.");
                } catch (IOException ex) {
                    showText("Unable to save the player information.\n"
                            + ex.getMessage());
                }
                return;
            }
        }

        showText("Player was not found.");
    }

    private void showText(String text) {
        JTextArea area = new JTextArea(text);
        area.setEditable(false);
        area.setLineWrap(false);
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setPreferredSize(new Dimension(550, 350));
        JOptionPane.showMessageDialog(this, scrollPane);
    }
}
