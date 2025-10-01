class Solution {
    public int numWaterBottles(int bottle, int numE) {
        int tc= bottle;
        tc += bottle/numE;
        bottle = bottle/numE + bottle%numE;
        while(bottle/numE >=1){
            tc +=bottle/numE;
            bottle = bottle/numE + bottle%numE;
        }
        return tc;
    }
}