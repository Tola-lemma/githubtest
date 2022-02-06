#include<iostream>
using namespace std;
int main()
{
	int arry[]={10,20,30,40,50};
	int key,flag=0,low=0,high=4,mid;//high=n-1;
	cout<<"enter the number you want to search\n";
	cin>>key;
	while(flag==0&&low<=high){
	
	mid=(low+high)/2;
	if(key==arry[mid]){
	
	flag=1;
	break;
	}
	swap();
	else if(key<arry[mid])
high=mid-1;
else 
low=mid+1;
}
if(flag==1)
cout<<"key is found at  "<<mid;
else
cout<<"key doesn't found";
return 0;

}
