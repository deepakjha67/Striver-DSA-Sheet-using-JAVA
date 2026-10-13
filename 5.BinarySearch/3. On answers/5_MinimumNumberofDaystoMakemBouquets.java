/**

T.C : O(n * log(max_d)), n is the number of flowers and max_d is the highest value in the array bloomDay.
S.C : O(1)

Steps :

1 -> Binary Search On Answer
2 -> Make getNumOfBouquets:
    numberOfBouquets and Count

 */




class Solution {
    private int getNumOfBouquets(int[] bloomDay, int mid, int k){
        int numOfBouquets = 0;
        int ConsecutiveCount = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                ConsecutiveCount++;
            } else{
                ConsecutiveCount = 0;
            }
            if(ConsecutiveCount == k){
                numOfBouquets++;
                ConsecutiveCount = 0;
            }
        }
        return numOfBouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if (bloomDay.length < m * k) {
            return -1;
        }


        int startDay = 0;
        int endDay = Arrays.stream(bloomDay).max().getAsInt();
        int minDays = -1;

        while(startDay <= endDay){
            int mid = startDay +(endDay - startDay)/2;

            if(getNumOfBouquets(bloomDay, mid, k) >= m){
                minDays = mid;
                endDay = mid -1;
            } else{
                startDay = mid +1;
            }
        }
        return minDays;
    }

}