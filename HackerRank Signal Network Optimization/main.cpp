
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll INF = 1e18;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N, M, Q;
    cin >> N >> M >> Q;

    vector<vector<pair<int,ll> > > adj(N + 1);

    vector<pair<int,int> > edges(M);
    vector<ll> weight(M);

    for (int i = 0; i < M; i++) {
        int u, v;
        ll w;
        cin >> u >> v >> w;

        edges[i] = make_pair(u, v);
        weight[i] = w;

        adj[u].push_back(make_pair(v, i));
        adj[v].push_back(make_pair(u, i));
    }

    while (Q--) {
        int type;
        cin >> type;

        if (type == 1) {
            int L, R;
            ll X;
            cin >> L >> R >> X;

            for (int i = L - 1; i <= R - 1; i++) {
                weight[i] += X;
            }
        } 
        else {
            int src, dest;
            cin >> src >> dest;

            vector<ll> dist(N + 1, INF);

            priority_queue<pair<ll,int>, vector<pair<ll,int> >, greater<pair<ll,int> > > pq;

            dist[src] = 0;
            pq.push(make_pair(0, src));

            while (!pq.empty()) {
                pair<ll,int> top = pq.top();
                pq.pop();

                ll d = top.first;
                int node = top.second;

                if (d > dist[node]) continue;

                for (int i = 0; i < adj[node].size(); i++) {
                    int next = adj[node][i].first;
                    int idx = adj[node][i].second;

                    ll wt = weight[idx];

                    if (dist[next] > d + wt) {
                        dist[next] = d + wt;
                        pq.push(make_pair(dist[next], next));
                    }
                }
            }

            if (dist[dest] == INF) cout << -1 << "\n";
            else cout << dist[dest] << "\n";
        }
    }

    return 0;
}
