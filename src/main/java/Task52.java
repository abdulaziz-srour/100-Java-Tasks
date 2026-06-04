public class Task52 {
    /**
     * Merges two pre-sorted integer arrays into a single, fully sorted integer array.
     * This method implements the two-pointer merge algorithm.
     * It compares elements from both arrays sequentially,
     * places the smaller element into the final array, and
     * then appends any remaining elements from the unfinished array.
     *
     * @param firstArray  the first pre-sorted input array
     * @param secondArray the second pre-sorted input array
     * @return a new sorted array containing all elements from both input arrays
     */
    int[] merge(int[] firstArray, int[] secondArray){
        int[] finalArray = new int[firstArray.length + secondArray.length];

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int finalArrayIndex = 0;

        while(firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length){
            if(firstArray[firstArrayIndex] < secondArray[secondArrayIndex]){
                finalArray[finalArrayIndex] = firstArray[firstArrayIndex];
                firstArrayIndex++;
            } else{
                finalArray[finalArrayIndex] = secondArray[secondArrayIndex];
                secondArrayIndex++;
            }
            finalArrayIndex++;
        }

        while (firstArrayIndex < firstArray.length){
            finalArray[finalArrayIndex] = firstArray[firstArrayIndex];
            firstArrayIndex++;
            finalArrayIndex++;
        }

        while(secondArrayIndex < secondArray.length){
            finalArray[finalArrayIndex] = secondArray[secondArrayIndex];
            secondArrayIndex++;
            finalArrayIndex++;
        }

        return finalArray;
    }
}
