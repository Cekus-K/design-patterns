package flyweight.homework.flyweight;

public abstract class ChessPiece {

    private String name;
    private int numberPosition;
    private String letterPosition;
    private Color color;

    protected ChessPiece(String name, int numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            default:
                throw new IllegalStateException("Incorrect color has been entered: " + color);
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}
