import javax.swing.JOptionPane; 
 
public class PanthersPlayers2026 { 
 
    public static void main(String[] args) { 
 
       // Carolina Panthers 2026 Active Roster 
 
String[] playerNames = { 
    "Jonathon Brooks", 
    "Bobby Brown III", 
    "Derrick Brown", 
    "Corey Bullock", 
    "Claudin Cherelus", 
    "Jalen Coker", 
    "AJ Dillon", 
    "TeRah Edwards", 
    "Akayleb Evans", 
    "Mitchell Evans", 
    "Ryan Fitzgerald", 
    "Stone Forsythe", 
    "Luke Fortner", 
    "Feleipe Franks", 
    "Monroe Freeling", 
    "Trevis Gipson", 
    "Aaron Hall", 
    "Sam Hecht", 
    "Jaycee Horn", 
    "Jimmy Horn Jr.", 
    "Chuba Hubbard", 
    "Robert Hunt", 
    "Lee Hunter", 
    "Thomas Incoom", 
    "Cam Jackson", 
    "Mike Jackson", 
    "JJ Jansen", 
    "Patrick Jones II", 
    "Haynes King", 
    "Jackson Kuwatch", 
    "Will Lee III", 
    "Xavier Legette", 
    "Damien Lewis", 
    "Devin Lloyd", 
    "Sam Martin", 
    "Tetairoa McMillan", 
    "John Metchie III", 
    "Tre'von Moehrig", 
    "Bobby Okereke", 
    "Jaelan Phillips", 
    "Kenny Pickett", 
    "Lathan Ransom", 
    "Albert Reese", 
    "Ja'Tavion Sanders", 
    "Nick Scott", 
    "Chau Smith-Wade", 
    "Brycen Tremayne", 
    "Tommy Tremble", 
    "Princely Umanmielen", 
    "Rasheed Walker", 
    "Darren Waller", 
    "Zakee Wheatley", 
    "Bryce Young" 
}; 
 
String[] jerseyNumbers = { 
    "25", "97", "95", "67", "53", 
    "18", "28", "93", "29", "84", 
    "10", "73", "77", "81", "57", 
    "52", "94", "75", "8", "15", 
    "30", "50", "92", "48", "99", 
    "2", "44", "91", "16", "46", 
    "24", "17", "68", "55", "6", 
    "4", "13", "7", "58", "5", 
    "12", "22", "76", "0", "21", 
    "26", "87", "82", "3", "63", 
    "88", "20", "9" 
}; 
 
String[] positions = { 
    "RB", "DT", "DT", "OT", "LB", 
    "WR", "RB", "DT", "CB", "TE", 
    "K", "T", "C", "TE", "T", 
    "OLB", "DT", "C", "CB", "WR", 
    "RB", "G", "DT", "OLB", "DT", 
    "CB", "LS", "OLB", "QB", "LB", 
    "CB", "WR", "G", "LB", "P", 
    "WR", "WR", "S", "LB", "OLB", 
    "QB", "S", "T", "TE", "S", 
    "CB", "WR", "TE", "OLB", "T", 
    "TE", "S", "QB" 
}; 
 
String[] heights = { 
    "6-0", "6-4", "6-5", "6-3", "6-2", 
    "6-3", "6-0", "6-2", "6-2", "6-5", 
    "5-11", "6-8", "6-4", "6-6", "6-7", 
    "6-4", "6-4", "6-4", "6-1", "5-8", 
    "6-1", "6-6", "6-4", "6-4", "6-6", 
    "6-1", "6-2", "6-4", "6-3", "6-4", 
    "6-1", "6-3", "6-2", "6-3", "6-1", 
    "6-4", "6-0", "6-2", "6-2", "6-5", 
    "6-3", "6-0", "6-7", "6-4", "5-11", 
    "5-11", "6-4", "6-4", "6-4", "6-6", 
    "6-6", "6-2", "5-10" 
}; 
 
String[] weights = { 
    "216", "330", "330", "325", "237", 
    "215", "248", "305", "205", "265", 
    "201", "315", "305", "252", "323", 
    "264", "300", "305", "212", "180", 
    "216", "335", "315", "248", "340", 
    "210", "245", "260", "215", "234", 
    "195", "218", "335", "243", "207", 
    "220", "204", "215", "235", "265", 
    "218", "202", "325", "243", "200", 
    "192", "212", "247", "255", "328", 
    "238", "204", "204" 
}; 
 
String[] colleges = { 
    "Texas", 
    "Texas A&M", 
    "Auburn", 
    "Maryland", 
    "Alcorn State", 
    "Holy Cross", 
    "Boston College", 
    "Illinois", 
    "Missouri", 
    "Notre Dame", 
    "Florida State", 
    "Florida", 
    "Kentucky", 
    "Arkansas", 
    "Georgia", 
    "Tulsa", 
    "Duke", 
    "Kansas State", 
    "South Carolina", 
    "Colorado", 
    "Oklahoma State", 
    "Louisiana-Lafayette", 
    "Texas Tech", 
    "Central Michigan", 
    "Florida", 
    "Miami", 
    "Notre Dame", 
    "Pittsburgh", 
    "Georgia Tech", 
    "Miami (Ohio)", 
    "Texas A&M", 
    "South Carolina", 
    "LSU", 
    "Utah", 
    "Appalachian State", 
    "Arizona", 
    "Alabama", 
    "TCU", 
    "Stanford", 
    "Miami", 
    "Pittsburgh", 
    "Ohio State", 
    "Mississippi State", 
    "Texas", 
    "Penn State", 
    "Washington State", 
    "Stanford", 
    "Notre Dame", 
    "Mississippi", 
    "Penn State", 
    "Georgia Tech", 
    "Penn State", 
    "Alabama" 
}; 
 
while (true) {

    String choice;

    choice = JOptionPane.showInputDialog(
        null,
        "Carolina Panthers 2026 Player Explorer\n\n" +
        "1. View Players\n" +
        "2. Search Player\n" +
        "3. View Players by Position\n" +
        "4. Exit\n\n" +
        "Enter your choice:"
    );

    if (choice == null) {
        break;
    }

    else if (choice.equals("1")) {

    String rosterChoice = JOptionPane.showInputDialog(
        null,
        "CAROLINA PANTHERS 2026 ROSTER\n\n" +
        "1. Offense\n" +
        "2. Defense\n" +
        "3. Special Teams\n\n" +
        "Enter your choice:"
    );

    if (rosterChoice != null) {

        String roster = "";
        boolean playersFound = false;

        // OFFENSE
        if (rosterChoice.equals("1")) {

            roster = "CAROLINA PANTHERS 2026 - OFFENSE\n\n";

            for (int i = 0; i < playerNames.length; i++) {

                if (positions[i].equals("QB") ||
                    positions[i].equals("RB") ||
                    positions[i].equals("WR") ||
                    positions[i].equals("TE") ||
                    positions[i].equals("T") ||
                    positions[i].equals("OT") ||
                    positions[i].equals("G") ||
                    positions[i].equals("C")) {

                    roster += "#" + jerseyNumbers[i] + " "
                            + playerNames[i] + " - "
                            + positions[i] + "\n";

                    playersFound = true;
                }
            }
        }

        // DEFENSE
        else if (rosterChoice.equals("2")) {

            roster = "CAROLINA PANTHERS 2026 - DEFENSE\n\n";

            for (int i = 0; i < playerNames.length; i++) {

                if (positions[i].equals("DT") ||
                    positions[i].equals("LB") ||
                    positions[i].equals("OLB") ||
                    positions[i].equals("CB") ||
                    positions[i].equals("S")) {

                    roster += "#" + jerseyNumbers[i] + " "
                            + playerNames[i] + " - "
                            + positions[i] + "\n";

                    playersFound = true;
                }
            }
        }

        // SPECIAL TEAMS
        else if (rosterChoice.equals("3")) {

            roster = "CAROLINA PANTHERS 2026 - SPECIAL TEAMS\n\n";

            for (int i = 0; i < playerNames.length; i++) {

                if (positions[i].equals("K") ||
                    positions[i].equals("P") ||
                    positions[i].equals("LS")) {

                    roster += "#" + jerseyNumbers[i] + " "
                            + playerNames[i] + " - "
                            + positions[i] + "\n";

                    playersFound = true;
                }
            }
        }

        else {

            JOptionPane.showMessageDialog(
                null,
                "Invalid choice. Please select 1, 2, or 3."
            );
        }

        if (playersFound) {

            JOptionPane.showMessageDialog(
                null,
                roster
            );
        }
    }
}
 
    else if (choice.equals("2")) {

    String searchName = JOptionPane.showInputDialog(
        null,
        "Enter a player's first name, last name, or full name:"
    );

    if (searchName != null) {

        String results = "MATCHING CAROLINA PANTHERS PLAYERS\n\n";
        boolean playerFound = false;

        for (int i = 0; i < playerNames.length; i++) {

            if (playerNames[i].toLowerCase()
                    .contains(searchName.toLowerCase())) {

                results +=
                    "Name: " + playerNames[i] + "\n" +
                    "Jersey Number: #" + jerseyNumbers[i] + "\n" +
                    "Position: " + positions[i] + "\n" +
                    "Height: " + heights[i] + "\n" +
                    "Weight: " + weights[i] + " lbs\n" +
                    "College: " + colleges[i] + "\n\n";

                playerFound = true;
            }
        }

        if (playerFound) {

            JOptionPane.showMessageDialog(
                null,
                results
            );

        } else {

            JOptionPane.showMessageDialog(
                null,
                "Player not found on the 2026 Carolina Panthers roster."
            );
        }
    }
}
 
    else if (choice.equals("3")) { 
 
        String position = JOptionPane.showInputDialog( 
            null, 
            "Enter a position:\n" + 
            "QB, RB, WR, TE, T, OT, G, C, DT, LB, OLB, CB, S, K, P, LS" 
        ); 
 
        if (position != null) { 
 
            String results = "PLAYERS AT POSITION: " 
                    + position.toUpperCase() + "\n\n"; 
 
            boolean foundPosition = false; 
 
            for (int i = 0; i < positions.length; i++) { 
 
                if (positions[i].equalsIgnoreCase(position)) { 
 
                    results += "#" + jerseyNumbers[i] + " " 
                            + playerNames[i] + "\n"; 
 
                    foundPosition = true; 
                } 
            } 
 
            if (foundPosition) { 
 
                JOptionPane.showMessageDialog( 
                    null, 
                    results 
                ); 
 
            } else { 
 
                JOptionPane.showMessageDialog( 
                    null, 
                    "No players found at that position." 
                ); 
            } 
        } 
    } 
 
    else if (choice.equals("4")) {

    JOptionPane.showMessageDialog(
        null,
        "Thank you for using the Carolina Panthers 2026 Player Explorer! KEEP POUNDING!"
    );
    break;
}
 
    else { 
        JOptionPane.showMessageDialog( 
            null, 
            "Invalid choice. Please select 1, 2, 3, or 4." 
        ); 
    } 
 
}   
 
}   
 
}   