package com.sowmik.arrays.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxValueOfEquation {
    public static void main(String[] args) {

    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>(new PairComparator());
        int ans = Integer.MIN_VALUE;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && points[i][0] - q.peek().second > k) {
                q.poll();
            }

            if (!q.isEmpty()) {
                ans = Math.max(ans, points[i][0] + points[i][1] + q.peek().first);
            }

            q.offer(new Pair(points[i][1] - points[i][0], points[i][0]));
        }

        return ans;
    }

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair p1, Pair p2) {
            return p2.first - p1.first;
        }
    }

}
