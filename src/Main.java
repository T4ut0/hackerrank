import javax.sound.midi.SysexMessage;

/*
    This java program contains implementations of several exercises from Hackerrank. Objects are initialized based on their categories.
    Author: Tuna Cinsoy
 */
public class Main {

    public static void main(String[] args) {
        // --- WARM UP ---
        hackerrankWarmUp warmUp = new hackerrankWarmUp();
        System.out.println("WARMUP:");

        // Test Case for SockMerchant
        int[] testArrayOfSockMerchant = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(warmUp.sockMerchant(9, testArrayOfSockMerchant));

        // Test Case for CountingValleys
        String testStringOfCountingValleys = "UDDDUDUU";
        System.out.println(warmUp.countingValleys(8, testStringOfCountingValleys));

        // Test Case for jumpingOnClouds
        int[] testArrayOfJumpingOnClouds = {0, 0, 1, 0, 0, 1, 0};
        System.out.print(warmUp.jumpingOnClouds(testArrayOfJumpingOnClouds));

        // Test Case for repeatedString
        String testStringOfRepeatedString = "aba";
        System.out.println(warmUp.repeatedString(testStringOfRepeatedString, 10));
        System.out.println();

        // --- ARRAYS ---
        hackerrankArrays arrays = new hackerrankArrays();
        System.out.println("ARRAYS:");

        // Test Case of 2D Array - DS
        int[][] testInputForHourglassSum = {
                {1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0},};
        System.out.println(arrays.hourglassSum(testInputForHourglassSum));

        // Test Case of Rotate Left
        int[] testArrayForRotateLeft = new int[5];
        testArrayForRotateLeft = arrays.initializeArray(testArrayForRotateLeft);
        System.out.print("Original Array: ");
        arrays.printArray(testArrayForRotateLeft);
        int[] rotatedArray = arrays.rotateLeft(testArrayForRotateLeft, 4);
        System.out.print("Rotated Array: ");
        arrays.printArray(rotatedArray);

        System.out.println();

        // Test Cases of New Year Chaos
        int[] testArrayForMinimumBribes1 = {2, 1, 5, 3, 4};
        arrays.minBribe(testArrayForMinimumBribes1);

        int[] testArrayForMinimumBribes2 = {1, 2, 5, 3, 4, 7, 8, 6};
        arrays.minBribe(testArrayForMinimumBribes2);

        int[] testArrayForMinimumBribes3 = {1, 2, 5, 3, 7, 8, 6, 4};
        arrays.minBribe(testArrayForMinimumBribes3);

        int[] testArrayForMinimumBribes4 = {5, 1, 2, 3, 7, 8, 6, 4};
        arrays.minBribe(testArrayForMinimumBribes4);

        System.out.println();

        //Test Cases of Minimum Swaps 2
        int[] testArrayForMinimumSwaps1 = {7,1,3,2,4,5,6};
        System.out.println("Minimum Swaps: " + arrays.minimumSwaps(testArrayForMinimumSwaps1));

        int[] testArrayForMinimumSwaps2 = {4,3,1,2};
        System.out.println("Minimum Swaps: " + arrays.minimumSwaps(testArrayForMinimumSwaps2));

        int[] testArrayForMinimumSwaps3 = {2,3,4,1,5};
        System.out.println("Minimum Swaps: " + arrays.minimumSwaps(testArrayForMinimumSwaps3));

        System.out.println();

        //Test Cases for Array Manipulation
        int[][] testArrayForArrayManipulation1 = {
                {1,2,100},{2,5,100},{3,4,100}
        };
        System.out.println(arrays.arrayManipulation(5,testArrayForArrayManipulation1));
        int[][] testArrayForArrayManipulation2 = {
                {1,5,3},{4,8,7},{6,9,1}
        };
        System.out.println(arrays.arrayManipulation(10,testArrayForArrayManipulation2));
        System.out.println();

        // --- DICTIONARIES & HASHMAPS ---
        hackerrankDictionariesHashmaps dictHash = new hackerrankDictionariesHashmaps();
        System.out.println("DICTIONARIES & HASHMAPS:");

        String[] magazine1 = {"two times three is not four"};
        String[] note1 = {"two times two is four"};
        dictHash.checkMagazine(magazine1,note1);
        System.out.println();

        String s1 = "ok";
        String s2 = "pil";
        dictHash.twoStrings(s1,s2);

    }
}
