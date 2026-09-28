public class Player {
    private String name;
    private String jerseyNumber;
    private String position;
    private String height;
    private String weight;
    private String college;

    public Player(String name, String jerseyNumber, String position,
                  String height, String weight, String college) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.college = college;
    }

    public String getName() { return name; }
    public String getJerseyNumber() { return jerseyNumber; }
    public String getPosition() { return position; }
    public String getHeight() { return height; }
    public String getWeight() { return weight; }
    public String getCollege() { return college; }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nJersey Number: #" + jerseyNumber
                + "\nPosition: " + position
                + "\nHeight: " + height
                + "\nWeight: " + weight + " lbs"
                + "\nCollege: " + college;
    }
}
