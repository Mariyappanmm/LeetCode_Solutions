class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for(int i = 0; i < nums.length; i++) {

            // if current index is unreachable
            if(i > maxReach)
                return false;

            // update farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);

            // already can reach last index
            if(maxReach >= nums.length - 1)
                return true;
        }

        return true;
    }
}