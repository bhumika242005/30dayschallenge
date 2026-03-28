//Q1.Perform Tree height transformation on a Given graph using Python / C / C++

#include <iostream>
#include <vector>
#include <queue>
    using namespace std;

int main() {
    int n = 6; // number of nodes

    // Tree edges
    vector<pair<int, int>> edges = {
        {0, 1},
        {0, 2},
        {1, 3},
        {1, 4},
        {2, 5}
    };

    // Create adjacency list
    vector<vector<int>> adj(n);
    for (auto edge : edges) {
        int u = edge.first;
        int v = edge.second;
        adj[u].push_back(v);
        adj[v].push_back(u); // because the tree is undirected
    }

    vector<int> height(n, -1); // stores height of each node
    queue<int> q;

    int root = 0; // start from node 0
    q.push(root);
    height[root] = 0;

    // BFS to calculate height
    while (!q.empty()) {
        int current = q.front();
        q.pop();

        for (int neighbor : adj[current]) {
            if (height[neighbor] == -1) {
                height[neighbor] = height[current] + 1;
                q.push(neighbor);
            }
        }
    }

    // Print height of each node
    for (int i = 0; i < n; i++) {
        cout << "Height of node " << i << " = " << height[i] << endl;
    }

    return 0;

}
