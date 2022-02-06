#include<iostream>
using namespace std ;
int msg(int arry[],int size,int key)
{
	int index=0; 
	int found=0;
	do{
		if(key==arry[index]){
		
		found=1;
		break;
	}
		else {
		index++;
	}
	}
	while(found==0&&index<size);
	if(found==0)
	index=-1;
	return index;
}
int main()
{
	int arry[5]={10,20,30,40,50};
int key;

	cout<<"enter the key\n";
	cin>>key;
	cout<<"key found at index:  ";
	int result=msg(arry,5,key);
	cout<<result;
	/*
	int arry[5]={10,20,30,40,50};
int key,i,flag=0;
cout<<"enter the key\n";
	cin>>key;
	for(i=0;i<5;i++)
	{
		if(key==arry[i])
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	cout<<"Key is Found at index "<<i<<endl;
	else 
	cout<<"Key is not found\n";
	
	return 0;*/
}

