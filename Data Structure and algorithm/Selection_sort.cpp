#include<iostream>
using namespace std;
void selectionSort(int arr[],int size)
{
	int i,j,minIndex,temp;
	for(i=0;i<=size-2;i++){
		minIndex=i;
		for(j=i+1;j<=size-1;j++)
		if(arr[j]<arr[minIndex])
		minIndex=j;
		
		if(minIndex!=i){
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
	}
}
/*int small(int L[], int size, int i)
{
int s, index, j;
s = L[i];
index = i;
for( j = i+1; j < 5; j++)
{
if(L[j] < s )
{
s = L[j];
index = j;
}
}
return index;
}*/
int main ()
{
int i, j, index,temp;
//int L[] = { 10, 12, 7, 9, 5 };
int arr[] = { 10, 12, 7, 9, 5 };
cout << "The list of element before sorting:" <<endl;
for(i = 0; i < 5; i++)
{
cout<<arr[i]<<endl;
}
cout<<endl;
selectionSort(arr,5);
for(i = 0; i < 5; i++)
{
cout<<arr[i]<<" ";
}


/*
for( i = 0;i < 5; i++)
{
index = small(L, 5, i);
temp = L[i];
L[i] = L[index];
L[index] = temp;
}
cout << "The list of element after sorting:" <<endl;
for(i = 0; i < 5; i++)
{
cout<<L[i]<<endl;
}*/
return 0;
}


