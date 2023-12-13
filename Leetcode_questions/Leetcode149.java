
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
from collections import defaultdict

def maxPoints(points):
    if len(points) <= 1:
        return len(points)

    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a

    def slope(point1, point2):
        if point1[0] == point2[0]:
            return float('inf')  # Vertical line
        dx = point2[0] - point1[0]
        dy = point2[1] - point1[1]
        common_factor = gcd(dx, dy)
        return (dx // common_factor, dy // common_factor)

    max_points = 1

    for i in range(len(points) - 1):
        slope_count = defaultdict(int)
        same_point_count = 0
        local_max = 1

        for j in range(i + 1, len(points)):
            if points[i] == points[j]:
                same_point_count += 1
            else:
                s = slope(points[i], points[j])
                slope_count[s] += 1
                local_max = max(local_max, slope_count[s])

        local_max += same_point_count + 1
        max_points = max(max_points, local_max)

    return max_points

# Example usage:
points1 = [[1, 1], [2, 2], [3, 3]]
print(maxPoints(points1))  # Output: 3

points2 = [[1, 1], [3, 2], [5, 3], [4, 1], [2, 3], [1, 4]]
print(maxPoints(points2))  # Output: 4
