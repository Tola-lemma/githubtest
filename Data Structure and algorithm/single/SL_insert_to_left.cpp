#include<iostream>
using namespace std;
struct node{
		int age;
		node *next;
	};
		void insert_to_left_of_Y(int x,int y);
int main()
{	
/*int x,y;
cout<<"Enter the value you want to store"<<endl;
cin>>x;
cout<<"Enter the position you want to enter"<<endl;
cin>>y;
insert_to_left_of_Y(x,y);*/
}

void insert_to_left_of_Y(int x,int y){
	struct node *headptr;//=NULL;
	node *temp=new node;
	
	/*cout<<" Enter Age\n ";
	cin>>temp->age;*/
    temp->age=x;
	temp->next=NULL;
	if(headptr==NULL)
	headptr=temp;
	else
	{
	node *temp2=headptr;
	node *temp3;
	while(temp2->age!=y){
		temp3=temp2;
		temp2=temp2->next;
		
	}
	temp->next=temp3->next;
	temp3->next=temp;
}
//cout<<"age\t"<<temp->age<<endl;
}
