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

    public void twoStrings(String s1, String s2) {
        HashMap<Character, Integer> helper = new HashMap<Character, Integer>();
        if (s1.length() >= s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                helper.put(s1.charAt(i), 0);
            }
            for (int i = 0; i < s2.length(); i++) {
                if (helper.containsKey(s2.charAt(i))) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
            return;
        } else {
            for (int i = 0; i < s2.length(); i++) {
                helper.put(s2.charAt(i), 0);
            }
            for (int i = 0; i < s1.length(); i++) {
                if (helper.containsKey(s1.charAt(i))) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
            return;
        }
    }
}
