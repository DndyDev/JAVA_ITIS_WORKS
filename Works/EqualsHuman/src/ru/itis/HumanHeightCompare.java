package ru.itis;

public class HumanHeightCompare implements Comparator {
    public int compare(Object a, Object b) {
        return ((Human)a).getHeight() - ((Human)b).getHeight();
    }
}
