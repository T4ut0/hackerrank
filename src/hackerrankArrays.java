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
        System.out.println(count);
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
                    int currentSum;
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

    public int minimumSwaps(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                continue;
            }
            swapCount++;
            int temp = arr[i];
            arr[i] = arr[temp - 1];
            arr[temp - 1] = temp;
            i--;
        }
        return swapCount;
    }

    public long arrayManipulation(int n, int[][] queries) {
        long[] computation = new long[n];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            computation[a] += k;
            if (b + 1 < n) {
                computation[b + 1] -= k;
            }
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computation[i];
            max = Math.max(max, sum);
        }

        return max;

    }
}
