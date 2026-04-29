import java.util.*;

public class Solution {

    static class Pair {
        int node;
        int idx;

        Pair(int node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    static class State implements Comparable<State> {
        long dist;
        int node;

        State(long dist, int node) {
            this.dist = dist;
            this.node = node;
        }

        public int compareTo(State other) {
            return Long.compare(this.dist, other.dist);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        int[] uArr = new int[M];
        int[] vArr = new int[M];
        long[] weight = new long[M];

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();

            uArr[i] = u;
            vArr[i] = v;
            weight[i] = w;

            adj.get(u).add(new Pair(v, i));
            adj.get(v).add(new Pair(u, i));
        }

        final long INF = (long) 1e18;

        while (Q-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int L = sc.nextInt();
                int R = sc.nextInt();
                long X = sc.nextLong();

                for (int i = L - 1; i <= R - 1; i++) {
                    weight[i] += X;
                }
            } else {
                int src = sc.nextInt();
                int dest = sc.nextInt();

                long[] dist = new long[N + 1];
                Arrays.fill(dist, INF);

                PriorityQueue<State> pq = new PriorityQueue<>();

                dist[src] = 0;
                pq.add(new State(0, src));

                while (!pq.isEmpty()) {
                    State cur = pq.poll();

                    long d = cur.dist;
                    int node = cur.node;

                    if (d > dist[node]) continue;

                    for (Pair edge : adj.get(node)) {
                        int next = edge.node;
                        int idx = edge.idx;

                        long wt = weight[idx];

                        if (dist[next] > d + wt) {
                            dist[next] = d + wt;
                            pq.add(new State(dist[next], next));
                        }
                    }
                }

                if (dist[dest] == INF) {
                    System.out.println(-1);
                } else {
                    System.out.println(dist[dest]);
                }
            }
        }
    }
}