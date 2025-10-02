class Solution {
    public int maxBottlesDrunk(int numB, int numE) {
        int drink = numB;
        
        while(numB >= numE){
            // System.out.println(numB +" " + drink + " " + numE);
            numB = numB - numE+1;
            drink++;
            numE++;
            System.out.println(numB +" " + drink + " " + numE);
        }
        return drink;
    }
}