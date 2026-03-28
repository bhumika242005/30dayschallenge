// Q5.Execute Left edge register allocation algorithm using python/C/C++.

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Variable
{
    int id;
    int start;
    int end;
    int reg; // Assigned register
};

bool compareStart(const Variable &a, const Variable &b)
{
    return a.start < b.start;
}

bool overlap(const Variable &a, const Variable &b)
{
    return !(a.end < b.start || b.end < a.start);
}

int main()
{
    int n;
    cout << "Enter number of variables: ";
    cin >> n;

    vector<Variable> vars(n);
    cout << "Enter live ranges (start end) for each variable:\n";
    for (int i = 0; i < n; ++i)
    {
        vars[i].id = i;
        cin >> vars[i].start >> vars[i].end;
        vars[i].reg = -1; // Not assigned yet
    }

    sort(vars.begin(), vars.end(), compareStart);

    int regCount = 0;
    vector<vector<Variable>> registers;

    for (auto &var : vars)
    {
        bool assigned = false;

        for (int r = 0; r < registers.size(); ++r)
        {
            bool canAssign = true;
            for (auto &v : registers[r])
            {
                if (overlap(v, var))
                {
                    canAssign = false;
                    break;
                }
            }

            if (canAssign)
            {
                registers[r].push_back(var);
                var.reg = r;
                assigned = true;
                break;
            }
        }

        if (!assigned)
        {
            var.reg = regCount;
            registers.push_back({var});
            regCount++;
        }
    }

    // Output results
    cout << "\nVariable\tStart\tEnd\tRegister\n";
    for (auto &var : vars)
    {
        cout << "v" << var.id << "\t\t" << var.start << "\t" << var.end << "\t" << var.reg << endl;
    }

    cout << "\nTotal Registers Used: " << regCount << endl;

    return 0;
}