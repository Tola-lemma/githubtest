#include<iostream>
using namespace std;
void insertionSort(int arr[],int size){
	int i,j,temp;
	for(i=1;i<=size-1;i++){
		for(j=i;j>=1;j--)
			if(arr[j-1]>arr[j]){
			temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;	
			}
			else{
			
			break;
		}
	}
	
}
	

int main()
{
    int arr[50], tot, i, j, k, temp, index;
    cout<<"Enter the Size for Array: ";
    cin>>tot;
    cout<<"Enter "<<tot<<" Array Elements\n ";
    for(i=0; i<tot; i++)
        cin>>arr[i];
         insertionSort(arr,tot);
         for(i=0;i<tot;i++)
		cout<<arr[i]<<" ";
   /* for(i=1; i<tot; i++)
    {
        temp = arr[i];
        if(temp<arr[i-1])
        {
            for(j=0; j<=i; j++)
            {
                if(temp<arr[j])
                {
                    index = j;
                    for(k=i; k>j; k--)
                        arr[k] = arr[k-1];
                    break;
                }
            }
        }
        else
            continue;
        arr[index] = temp;
    }
    cout<<"\nThe New Array (Sorted Array):\n";
    for(i=0; i<tot; i++)
        cout<<arr[i]<<"  ";
    cout<<endl;*/
    return 0;
}
