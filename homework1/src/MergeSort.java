package homework1.src;

public class MergeSort {
    public static int[] mergeSort(int[] input) {
        if (input.length <= 1) {
            return input;
        }
        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[input.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = input[i];
        }
        for (int i = mid; i < input.length; i++) {
            right[i - mid] = input[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }

}

