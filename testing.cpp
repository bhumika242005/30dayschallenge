#include<bits/stdc++.h>
using namespace std;


int main(){
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        cout<<"*";
    }
    cout<<endl;
    int colStart=0;
    int gap=10;
    int firstStar=0;
    int secondStar=10;
    for(int i=0;i<11;i++){
        int firstHelper = firstStar;
        int secondHelper = secondStar;
        for(int j=0;j<n;j++){
            if(j==firstHelper){
                cout<<"*";
                firstHelper+=12;
            }else if(j==secondHelper){
                cout<<"*";
                secondHelper+=12;
            }else{
                cout<<" ";
            }
        }
        firstStar++;
        secondStar--;
        cout<<endl;
    }
    for (int i = 0; i < n; i++)
    {
        cout << "*";
    }
    cout << endl;
    return 0;
}