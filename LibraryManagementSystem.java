public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Initialize arrays for fiction and non-fiction books
        String[] fictionBooks = {"To Kill a Mockingbird", "The Great Gatsby", "Pride and Prejudice", "The Catcher in the Rye", "1984"};
        String[] nonFictionBooks = {"The History of the Decline and Fall of the Roman Empire", "A Brief History of Time", "The Origin of Species", "The Wealth of Nations", "The Interpretation of Dreams"};

        // Merge the two arrays into a single array
        String[] inventory = mergeArrays(fictionBooks, nonFictionBooks);

        // Display the merged inventory
        System.out.println("Merged Inventory:");
        for (String book : inventory) {
            System.out.println(book);
        }
    }

    /**
     * Merges two arrays into a single array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return the merged array
     */
    public static String[] mergeArrays(String[] array1, String[] array2) {
        // Create a new array with the combined length of both arrays
        String[] mergedArray = new String[array1.length + array2.length];

        // Copy elements from the first array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from the second array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}