class Solution {
    public int maxBottlesDrunk(int numB, int numE) {
        int drink = numB;
        while(numB >= numE){
            numB = numB - numE+1;
            drink++;
            numE++;
        }
        return drink;
    }
}