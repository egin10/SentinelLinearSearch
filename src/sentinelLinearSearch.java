public class sentinelLinearSearch {
    // Function to search x in the given array
    private static int arr[] = { 2, 3, 18, 23, 26, 28, 35 };
    private static int n = arr.length;
    public static int sentinelSearch(int x)
    {
        // Last element of the array
        int last = arr[n - 1];

        // Element to be searched is
        // placed at the last index
        arr[n - 1] = x;
        int i = 0;

        while (arr[i] != x)
            i++;

        // Put the last element back
        arr[n - 1] = last;

        if ((i < n - 1) || (x == arr[n - 1]))
            System.out.println(x + " is present at index " + i);
        else
            System.out.println("Not found");

        return i;
    }

    // Driver code
    public static void main (String[] args)
    {
        int x = 1;
        int result = sentinelSearch(x);
        System.out.println(result);
    }
}
