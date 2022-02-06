#include<iostream>
int LinearSearch(int list[],int key);
using namespace std;
int main(){
	int list[5],key;
	cout<<"enter the number"<<endl;
	for(int i=0;i<=5;i++){
		cin>>list[i];
	}
	cout<<"enter the value of key"<<endl;
	cin>>key;
//	int list[]= {4,6,8,3,5,9};
	//int key = 8;
	int i = LinearSearch(list,key);
	if(i==-1)
		cout<<"the search item is not found";
	else
	   cout<<"the search item is found at index "<<i;
}
int LinearSearch(int list[],int key)
{
	int index = -1;
	for(int i=0;i<=5;i++)
	{
	if(list[i]==key)
     	{
	index = i;
	break;	
	    }	
	}
return index;	
}
