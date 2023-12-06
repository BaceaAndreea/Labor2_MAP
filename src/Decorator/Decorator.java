package Decorator;

public interface Decorator {
    void displayDetails(Object object);

    default String addEmptySpace(int length) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < 33 - length; i++) {
            spaces.append(" ");
        }
        return spaces.toString();
    }
}
