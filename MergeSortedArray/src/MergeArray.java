public class MergeArray {
    public static void main (String[] args) {
        int[] array1 = {2, 4, 6, 8};
        int[] array2 = {1, 3, 5, 7, 9};

        int[] mergedArray = mergeSortedArray(array1, array2);
        System.out.print("Merged list : ");
        for (int i : mergedArray)
            System.out.print(i + " ");
    }

    private static int[] mergeSortedArray(int[] array1, int[] array2) {
        int[] mergedArrayOutput = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j])
                mergedArrayOutput[k++] = array1[i++];
            else
                mergedArrayOutput[k++] = array2[j++];
        }
        // Add remaining elements from array
        while (i < array1.length)
            mergedArrayOutput[k++] = array1[i++];

        while (j < array2.length)
            mergedArrayOutput[k++] = array2[j++];

        return mergedArrayOutput;
    }


}
