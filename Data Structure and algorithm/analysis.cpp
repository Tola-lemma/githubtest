#include<iostream>
using namespace std;
int main()
{
	int sum=0,n;
	cin>>n;
	for (int i=1;i<=n;i++)
	for (int j=1;j<=i;j++)
	sum++;
	cout<<sum;
}
