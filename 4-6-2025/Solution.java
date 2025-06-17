import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

       
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

       
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0});
        }

        int val = 0;
        for (int i = 0; i < k; i++) {
            int[] cur = minHeap.poll();
            val = cur[0];
            int r = cur[1], c = cur[2];
            if (c + 1 < n) {
                minHeap.offer(new int[]{matrix[r][c + 1], r, c + 1});
            }
        }

        return val;
		}
		}