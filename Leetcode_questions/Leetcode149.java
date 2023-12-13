
/*
149. Max Points on a Line
Hard
4K
453
Companies
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

 

Example 1:


Input: points = [[1,1],[2,2],[3,3]]
Output: 3
Example 2:


Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
Output: 4
 

Constraints:

1 <= points.length <= 300
points[i].length == 2
-104 <= xi, yi <= 104
All the points are unique.
 */
class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }
        
        int maxPoints = 0;
        
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopes = new HashMap<>();
            int overlappingPoints = 0;
            int currentMax = 0;
            
            for (int j = i + 1; j < points.length; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                
                if (x1 == x2 && y1 == y2) {
                    overlappingPoints++;
                    continue;
                }
                
                int dx = x2 - x1;
                int dy = y2 - y1;
                
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;
                
                String slope = dy + "/" + dx;
                slopes.put(slope, slopes.getOrDefault(slope, 0) + 1);
                currentMax = Math.max(currentMax, slopes.get(slope));
            }
            maxPoints = Math.max(maxPoints, currentMax + overlappingPoints + 1);
        }
        return maxPoints;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

/////////////

import java.util.HashMap;
import java.util.Map;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEqual(Point other) {
        return this.x == other.x && this.y == other.y;
    }

    public String calculateSlope(Point other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;

        if (dx == 0) {
            return "inf";
        }

        int gcd = gcd(dx, dy);
        dx /= gcd;
        dy /= gcd;

        return dy + "/" + dx;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length <= 2) {
            return points.length;
        }

        int maxPoints = 0;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopes = new HashMap<>();
            int overlappingPoints = 0;
            int currentMax = 0;

            for (int j = i + 1; j < points.length; j++) {
                if (points[i].isEqual(points[j])) {
                    overlappingPoints++;
                    continue;
                }

                String slope = points[i].calculateSlope(points[j]);
                slopes.put(slope, slopes.getOrDefault(slope, 0) + 1);
                currentMax = Math.max(currentMax, slopes.get(slope));
            }
            maxPoints = Math.max(maxPoints, currentMax + overlappingPoints + 1);
        }
        return maxPoints;
    }

    public static void main(String[] args) {
        Point[] points1 = {new Point(1, 1), new Point(2, 2), new Point(3, 3)};
        Point[] points2 = {new Point(1, 1), new Point(3, 2), new Point(5, 3),
                           new Point(4, 1), new Point(2, 3), new Point(1, 4)};

        Solution solution = new Solution();

        System.out.println(solution.maxPoints(points1)); // Output: 3
        System.out.println(solution.maxPoints(points2)); // Output: 4
    }
}
