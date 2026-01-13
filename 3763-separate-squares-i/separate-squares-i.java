
class Solution {
    public double separateSquares(int[][] squares) {

        // Step 1: Calculate total area
        double totalArea = 0;
        for (int[] sq : squares) {
            totalArea += (double) sq[2] * sq[2];
        }
        double halfArea = totalArea / 2.0;

        // Step 2: Create events (y, type, length)
        // type: +1 = start, -1 = end
        List<double[]> events = new ArrayList<>();
        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];
            events.add(new double[]{y, 1, l});      // start
            events.add(new double[]{y + l, -1, l}); // end
        }

        // Step 3: Sort events by y
        events.sort(Comparator.comparingDouble(a -> a[0]));

        double currWidth = 0;
        double currArea = 0;
        double prevY = events.get(0)[0];

        // Step 4: Sweep line
        for (double[] e : events) {
            double y = e[0];
            double areaAdded = currWidth * (y - prevY);

            // Check if we crossed half area
            if (currArea + areaAdded >= halfArea) {
                return prevY + (halfArea - currArea) / currWidth;
            }

            currArea += areaAdded;
            currWidth += e[1] * e[2];
            prevY = y;
        }

        return prevY; // fallback
    }
}
