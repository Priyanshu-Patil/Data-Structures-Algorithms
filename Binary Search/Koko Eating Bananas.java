class Solution {
    
    private boolean canEatAll(int[] piles, int givenHour, int h) {
        int actualHour = 0;
        
        for (int x : piles) {
            actualHour += x / givenHour;
            
            if (x % givenHour != 0) {
                actualHour++;
            }
        }
        
        return actualHour <= h;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (canEatAll(piles, mid, h)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return end;
    }
}