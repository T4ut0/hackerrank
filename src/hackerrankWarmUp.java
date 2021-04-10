public class hackerrankWarmUp {

    public int sockMerchant(int n, int[] ar) {
        int[] doesHavePair = new int[n];
        for (int k = 0; k < n; k++) {
            doesHavePair[k] = 0;
        }

        int numberOfPairs = 0;

        for (int i = 0; i < n; i++) {
            int currentKeyInOuterLoop = ar[i];
            for (int j = i + 1; j < n; j++) {
                int currentKeyInInnerLoop = ar[j];

                if (currentKeyInOuterLoop == currentKeyInInnerLoop && doesHavePair[i] == 0 && doesHavePair[j] == 0) {
                    numberOfPairs++;
                    doesHavePair[i] = 1;
                    doesHavePair[j] = 1;
                    break;
                }
            }
        }
        return numberOfPairs;
    }

    public int countingValleys(int n, String s) {
        int countOfValleys = 0;
        int currentAltitude = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                currentAltitude--;

                if (currentAltitude < 0) {

                    for (int j = i + 1; j < n; j++) {
                        if (s.charAt(j) == 'D') {
                            currentAltitude--;
                        } else if (s.charAt(j) == 'U') {
                            currentAltitude++;
                        }

                        if (currentAltitude == 0) {
                            countOfValleys++;
                            i = j;
                            break;
                        }
                    }
                }
            } else if (s.charAt(i) == 'U') {
                currentAltitude++;
            }
        }

        return countOfValleys;
    }

    public int jumpingOnClouds(int[] c) {
        int countOfJumps = 0;

        for (int i = 0; i < (c.length - 1); ) {
            if ((i + 2 < c.length) && (c[i + 2] == 0)) {
                i = i + 2;
                countOfJumps++;
            } else if ((i + 1 < c.length) && (c[i + 1] == 0)) {
                i = i + 1;
                countOfJumps++;
            }
        }
        return countOfJumps;
    }

    public long repeatedString(String s, long n) {
        final long quotient = n / s.length();
        final long remainder = n % s.length();
        long aCount = 0;

        if ((s.length() == 1) && (s.charAt(0) == 'a')) {
            return n;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }
        aCount = aCount * quotient;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }

        return aCount;

    }
}
