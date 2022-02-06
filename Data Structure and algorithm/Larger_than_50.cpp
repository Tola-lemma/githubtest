#include<iostream>
using namespace std;
int main()
{
	int i,count=0,input;//variable declaretiom 
	cout<<"Enter 10 integers between 0 and 100\n";//promt the user to inter the integers in the range of 0 to 100
	for(i=0;i<10;i++)////i=0 refers to array address starts from 0, and its less than 10
	{
		cin>>input;//takes 10 integer from keyboard
			if(input>50)
count++;//count number greate/larger than 50
	}
cout<<"The number larger than 50 is "<<count<<endl;//display number greater /larger than 50
return 0;
}
