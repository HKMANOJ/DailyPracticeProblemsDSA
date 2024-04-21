class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        boolean[] visited = new boolean[n];

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == destination) {
                return true;
            }

            for (int i = 0; i < edges.length; i++) {
                int from = edges[i][0];
                int to = edges[i][1];

                if (from == node && !visited[to]) {
                    queue.add(to);
                    visited[to] = true;
                } else if (to == node && !visited[from]) {
                    queue.add(from);
                    visited[from] = true;
                }
            }
        }

        return false;
    }
    
}
