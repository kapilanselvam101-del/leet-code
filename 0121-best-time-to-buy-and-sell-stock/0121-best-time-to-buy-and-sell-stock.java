class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // lowest price seen so far
        int maxProfit = 0;                // best profit found

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // update profit if better
            }
        }
        return maxProfit;
    }
}