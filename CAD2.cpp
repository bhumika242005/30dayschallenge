// Q2.Perform ROE on a Given graph using Python/C/C++.

#include <iostream>
#include <vector>
using namespace std;

vector<int> parent;

// Find function for Union-Find
int find(int node)
{
    if (parent[node] == -1)
        return node;
    return parent[node] = find(parent[node]);
}

// Union function
bool unionNodes(int u, int v)
{
    int parent_u = find(u);
    int parent_v = find(v);

    if (parent_u == parent_v)
    {
        return false; // redundant edge found
    }

    parent[parent_u] = parent_v;
    return true;
}

int main()
{
    int n, e;
    cout << "Enter number of nodes: ";
    cin >> n;
    cout << "Enter number of edges: ";
    cin >> e;

    vector<pair<int, int>> edges;
    cout << "Enter edges (u v):\n";
    for (int i = 0; i < e; ++i)
    {
        int u, v;
        cin >> u >> v;
        edges.push_back({u, v});
    }

    parent.assign(n, -1);
    vector<pair<int, int>> usefulEdges;
    vector<pair<int, int>> redundantEdges;

    for (auto edge : edges)
    {
        int u = edge.first;
        int v = edge.second;

        if (unionNodes(u, v))
        {
            usefulEdges.push_back(edge); // part of tree
        }
        else
        {
            redundantEdges.push_back(edge); // cycle/redundant
        }
    }

    cout << "\nUseful Edges (forming tree):\n";
    for (auto edge : usefulEdges)
        cout << edge.first << " - " << edge.second << endl;

    cout << "\nRedundant Edges (to eliminate):\n";
    for (auto edge : redundantEdges)
        cout << edge.first << " - " << edge.second << endl;

    return 0;
}