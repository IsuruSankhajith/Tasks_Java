
/*
218. The Skyline Problem
Hard
5.7K
257
Companies
A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.

The geometric information of each building is given in the array buildings where buildings[i] = [lefti, righti, heighti]:

lefti is the x coordinate of the left edge of the ith building.
righti is the x coordinate of the right edge of the ith building.
heighti is the height of the ith building.
You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.

The skyline should be represented as a list of "key points" sorted by their x-coordinate in the form [[x1,y1],[x2,y2],...]. Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list, which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost building ends. Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.

Note: There must be no consecutive horizontal lines of equal height in the output skyline. For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable; the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]

 

Example 1:


Input: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
Explanation:
Figure A shows the buildings of the input.
Figure B shows the skyline formed by those buildings. The red points in figure B represent the key points in the output list.
Example 2:

Input: buildings = [[0,2,3],[2,5,3]]
Output: [[0,3],[5,0]]
 

Constraints:

1 <= buildings.length <= 104
0 <= lefti < righti <= 231 - 1
1 <= heighti <= 231 - 1
buildings is sorted by lefti in non-decreasing order.
 */
import java.util.*;

class Building {
    int left, right, height;

    public Building(int left, int right, int height) {
        this.left = left;
        this.right = right;
        this.height = height;
    }
}

class CriticalPoint {
    int x, height;

    public CriticalPoint(int x, int height) {
        this.x = x;
        this.height = height;
    }
}

class Skyline {
    public List<List<Integer>> getSkyline(List<Building> buildings) {
        List<List<Integer>> result = new ArrayList<>();
        List<CriticalPoint> criticalPoints = new ArrayList<>();

        // Step 1: Identify critical points
        for (Building building : buildings) {
            criticalPoints.add(new CriticalPoint(building.left, -building.height));
            criticalPoints.add(new CriticalPoint(building.right, building.height));
        }

        // Sort critical points based on x-coordinate and height
        Collections.sort(criticalPoints, Comparator.comparingInt((CriticalPoint cp) -> cp.x).thenComparingInt(cp -> cp.height));

        // Step 2: Process critical points
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(0);
        int prevMaxHeight = 0;

        // Step 3: Generate resultant skyline
        for (CriticalPoint point : criticalPoints) {
            int x = point.x;
            int height = Math.abs(point.height);

            if (point.height < 0) { // Left edge
                maxHeap.offer(height);
            } else { // Right edge
                maxHeap.remove(height);
            }

            int currMaxHeight = maxHeap.peek();
            if (prevMaxHeight != currMaxHeight) {
                result.add(Arrays.asList(x, currMaxHeight));
                prevMaxHeight = currMaxHeight;
            }
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Skyline skylineSolver = new Skyline();
        List<Building> buildings = Arrays.asList(
            new Building(2, 9, 10),
            new Building(3, 7, 15),
            new Building(5, 12, 12),
            new Building(15, 20, 10),
            new Building(19, 24, 8)
        );

        List<List<Integer>> result = skylineSolver.getSkyline(buildings);
        System.out.println(result);
    }
}
