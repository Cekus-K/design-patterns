package flyweight.homework.flyweight;

class ColorRepository {

    static Color black = new Color(255, 255, 255);
    static Color white = new Color(0, 0, 0);

    static Color getBlack() {
        return black;
    }

    static Color getWhite() {
        return white;
    }
}
