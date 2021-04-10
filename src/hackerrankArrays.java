public class hackerrankArrays {

    public void minBribe(int[] q) {
        int count = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            int difference = q[i] - (i + 1);
            if (difference > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                int st = Math.max(0, q[i] - 2);
                for (int j = st; j < i; j++) {
                    if (q[j] > q[i]) {
                        count++;
                    }
                }
            }
        }
        System.err.println(count);
    }

    public int hourglassSum(int[][] arr) {
        int rowCount = arr[0].length;
        int columnCount = arr[1].length;

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < rowCount - 1; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (i >= rowCount - 2 || j >= columnCount - 2) {
                    continue;
                } else {
                    int currentSum = 0;
                    int firstRow = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                    int secondRow = arr[i + 1][j + 1];
                    int thirdRow = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                    currentSum = firstRow + secondRow + thirdRow;

                    if (currentSum > sum) {
                        sum = currentSum;
                    }
                }
            }
        }

        return sum;
    }

    public int[] rotateLeft(int[] a, int d) {
        int[] localArray = a;
        int iteration = 0;
        while (iteration != d) {
            int firstIndex = a[0];
            for (int i = 0; i < a.length; i++) {
                if (i + 1 == a.length) {
                    a[i] = firstIndex;
                    break;
                }
                a[i] = localArray[i + 1];
            }
            iteration++;
        }

        return a;

    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int[] initializeArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        return a;
    }
}
