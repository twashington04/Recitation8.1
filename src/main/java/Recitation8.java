public class Recitation8 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    private static int findMin(int startIndex, int endIndex, int[] arr){
        int smallestNum = arr[startIndex];
        for(int i = startIndex; i <= endIndex; i++){
            if(smallestNum < arr[i]){
                smallestNum = arr[i];
            }
        }
        return smallestNum;
    }
    public static boolean lastItemReachable(int[] hopList){
        int Index = 0;
        while (Index < hopList.length - 1){
            if (hopList[Index] == 0){
                break;
            }
            Index += hopList[Index];
        }
        return Index == hopList.length - 1;

    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize){
        int[] arr = new int[numberList.length];
        int start = 0, end = windowSize -1, index = 0;
        while (end < numberList.length){
            int smallestNum = findMin(start,end,numberList);
            arr[index] = smallestNum;
            index++;
            start++;
            end++;
        }
        int[] ans = new int[index];
        System.arraycopy(arr,0,ans,0,ans.length);
        return ans;
    }
}
