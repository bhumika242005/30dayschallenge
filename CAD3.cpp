//Q3.Execute ASAP and ALAP scheduling algorithm using Python/C/C++

#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

int main() {
    int n, e;
    cout << "Enter number of tasks (nodes): ";
    cin >> n;
    cout << "Enter number of dependencies (edges): ";
    cin >> e;

    vector<vector<int>> adj(n);
    vector<int> indegree(n, 0);

    cout << "Enter dependencies (from -> to):\n";
    for (int i = 0; i < e; ++i) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        indegree[v]++;
    }

    // ASAP Scheduling
    vector<int> asap(n, 0);
    queue<int> q;

    for (int i = 0; i < n; ++i)
        if (indegree[i] == 0)
            q.push(i);

    while (!q.empty()) {
        int u = q.front();
        q.pop();

        for (int v : adj[u]) {
            asap[v] = max(asap[v], asap[u] + 1);
            if (--indegree[v] == 0)
                q.push(v);
        }
    }

    // Find total project time
    int project_time = *max_element(asap.begin(), asap.end());

    // ALAP Scheduling
    vector<int> alap(n, project_time);
    vector<int> outdegree(n, 0);
    for (int u = 0; u < n; ++u)
        for (int v : adj[u])
            outdegree[u]++;

    queue<int> q2;
    for (int i = 0; i < n; ++i)
        if (outdegree[i] == 0)
            q2.push(i);

    while (!q2.empty()) {
        int u = q2.front();
        q2.pop();

        for (int i = 0; i < n; ++i) {
            for (int v : adj[i]) {
                if (v == u) {
                    alap[i] = min(alap[i], alap[u] - 1);
                    if (--outdegree[i] == 0)
                        q2.push(i);
                }
            }
        }
    }

    // Print Results
    cout << "\nTask\tASAP\tALAP\n";
    for (int i = 0; i < n; ++i)
        cout << i << "\t" << asap[i] << "\t" << alap[i] << endl;

    return 0;
}