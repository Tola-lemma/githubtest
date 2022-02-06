// String reversal using stack
#include<iostream>
#include<cstring>
#include<stack>// stack from standard template library (STL)
using namespace std;
void Reverse(char *c,int n){
stack<char> s;
for (int i = 0; i < n; i++)
{
   s.push(c[i]);
}
for (int i = 0; i < n; i++)
{
    c[i]=s.top();
    s.pop();
}
}
int main(){
char c[20];
cout<<" Enter String\n";
cin>>c;
Reverse(c,strlen(c));
cout<<"OUTPUT: "<<c;
}