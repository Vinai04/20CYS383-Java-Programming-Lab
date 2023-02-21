#include <bits/stdc++.h>
using namespace std;

int main()
{
    
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);
    v.emplace_back(3);
    v.emplace_back(4);
    v.emplace_back(5);
    v.emplace_back(6);
    
    
    cout<<"Vector v is : ";
    
    for(auto it=v.begin(); it!=v.end();it++){
        cout << *(it) << " ";
    }
    
    cout << endl;
    
    for(auto it : v){
        cout << it << " ";
    }
    
    cout << endl;
    
    vector<pair<int,int>> vec;
    vec.push_back({1,2});
    vec.emplace_back(3,4);
    vec.emplace_back(5,6);
    cout << "Size is :"<< vec.size();
    cout<<endl;
    cout<<"Vector vec is : ";
    
    for(auto it=vec.begin();it!=vec.end();it++){
        cout << "{" << it->first << "," << it->second << "}" << " ";
    }
    
    cout << endl;
    
    vector<int> s(5,100);
    cout<<"Vector s is : ";
    
    for(auto it=s.begin();it!=s.end();it++){
        cout << *(it) << " ";
    }
    
}