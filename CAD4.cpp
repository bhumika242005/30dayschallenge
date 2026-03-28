// Q4.Execute LIST scheduling using Python/C/C++.

#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

struct Task
{
    int id;
    int priority; // Higher value → higher priority
};

bool compare(Task a, Task b)
{
    return a.priority > b.priority;
}

int main()
{
    int n, e;
    cout << "Enter number of tasks (nodes): ";
    cin >> n;
    cout << "Enter number of dependencies (edges): ";
    cin >> e;

    vector<vector<int>> adj(n);
    vector<int> indegree(n, 0);

    cout << "Enter dependencies (from -> to):\n";
    for (int i = 0; i < e; ++i)
    {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        indegree[v]++;
    }

    vector<Task> tasks(n);
    cout << "Enter priorities for each task (higher value = higher priority):\n";
    for (int i = 0; i < n; ++i)
    {
        cout << "Task " << i << ": ";
        cin >> tasks[i].priority;
        tasks[i].id = i;
    }

    // Schedule
    vector<int> scheduled_time(n, -1);
    int time = 0;

    while (true)
    {
        vector<Task> ready;

        // Collect all ready (unscheduled, indegree 0) tasks
        for (int i = 0; i < n; ++i)
        {
            if (indegree[i] == 0 && scheduled_time[i] == -1)
                ready.push_back(tasks[i]);
        }

        if (ready.empty())
            break;

        // Sort by priority (highest first)
        sort(ready.begin(), ready.end(), compare);

        // Pick highest-priority ready task
        Task chosen = ready[0];
        scheduled_time[chosen.id] = time;

        // Remove it from the graph (update indegrees)
        for (int v : adj[chosen.id])
        {
            indegree[v]--;
        }

        time++;
    }

    // Output results
    cout << "\nLIST Scheduling Result (1 processor):\n";
    cout << "Task\tTime\n";
    for (int i = 0; i < n; ++i)
    {
        cout << i << "\t" << scheduled_time[i] << endl;
    }

    return 0;
}