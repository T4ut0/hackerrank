import java.util.HashMap;

public class hackerrankDictionariesHashmaps {

    public void checkMagazine(String[] magazine, String[] note) {

        if (note.length > magazine.length) {
            System.out.println("No");
            return;
        }
        HashMap<String, Integer> hashMagazine = new HashMap<String, Integer>();

        for (String s : magazine) {
            if (!hashMagazine.containsKey(s)) {
                hashMagazine.put(s, 1);
            } else {
                hashMagazine.put(s, hashMagazine.get(s) + 1);
            }
        }

        for (String s : note) {
            if (hashMagazine.containsKey(s)) {
                hashMagazine.put(s, hashMagazine.get(s) - 1);
                if (hashMagazine.get(s) < 0) {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
