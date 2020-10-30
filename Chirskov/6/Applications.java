import java.util.*;

public class Applications {
    public static void main(String[] args) {
        List<Triple<String, Integer, Double>> applicationsList = new ArrayList<>();
        applicationsList.add(new Triple<>("Maps", 39, 4.5));
        applicationsList.add(new Triple<>("Music", 27, 3.7));
        applicationsList.add(new Triple<>("Search", 67, 1.3));
        applicationsList.add(new Triple<>("Notes", 39, 4.5));
        applicationsList.add(new Triple<>("Photo", 44, 2.7));
        applicationsList.add(new Triple<>("Camera", 54, 1.3));
        applicationsList.add(new Triple<>("Clock", 34, 3.5));
        applicationsList.add(new Triple<>("Weather", 23, 3.7));
        applicationsList.add(new Triple<>("Mail", 12, 2.3));
        printSortedByRating(applicationsList);
        printBestApps(applicationsList);
        printWorstApps(applicationsList);
    }

    static void printSortedByRating(List<Triple<String, Integer, Double>> applicationsList) {
        Collections.sort(applicationsList, (T, V) -> (Integer)V.getSecond() - (Integer)T.getSecond());
        System.out.println(applicationsList);
    }

    static void printBestApps(List<Triple<String, Integer, Double>> applicationsList) {
        StringBuilder builder = new StringBuilder("Список лучших приложений: ");
        for (Triple<String, Integer, Double> app : applicationsList) {
            if (app.getThird() > 4) {
                builder.append(app.getFirst()).append(", ");
            }
        }
        builder.delete(builder.length() - 2, builder.length() - 1);
        System.out.println(builder);
    }

    static void printWorstApps(List<Triple<String, Integer, Double>> applicationsList) {
        StringBuilder builder = new StringBuilder("Список худших приложений: ");
        for (Triple<String, Integer, Double> app : applicationsList) {
            if (app.getThird() < 2) {
                builder.append(app.getFirst()).append(", ");
            }
        }
        builder.delete(builder.length() - 2, builder.length() - 1);
        System.out.println(builder);
    }
}
