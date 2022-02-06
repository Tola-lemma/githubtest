#include<iostream>
using namespace std;

	struct node{
		char name[20];
		int age;
		float height;
		node *next;
	};
	void insert_to_right(int x,int y);
	void display(node*);
int main()
{	
int choice;
struct node *headptr=NULL;
node *temp,*temp2;
do{
temp= new node;//in c we use malloc instead of new
	temp2=new node;
	cout<<" Enter the name\n ";
	cin>>temp->name;
	cout<<" Enter Age\n ";
	cin>>temp->age;
	cout<<" Enter height\n";
	cin>>temp->height;
	temp->next=NULL;
	if(headptr==NULL)
	headptr=temp;
	else
	{
		temp2=headptr;//we know this is not NULL
	while(temp2->next!=NULL)
	{
		temp2=temp2->next;//move to next link in chain
}
temp2->next=temp;
	}
	cout<<"Do you want to continue? if yes press 1 if no 0\n";
	cin>>choice;
	}while(choice);
	temp=headptr;
	display(temp);
	int x,y;
	cout<<"enter position"<<endl;
	cin>>y;
	 insert_to_right(x,y);
	 	display(temp);
}


void display(node *temp){
	do{
	if(temp==NULL){
	cout<<"Empty list ";
	}
	else
	{
	cout<<"Name\t"<<temp->name<<endl;
	cout<<"age\t"<<temp->age<<endl;
	cout<<"Height\t"<<temp->height<<endl;
	temp=temp->next;
	cout<<endl;
         }
}while(temp!=NULL);

}
void insert_to_right(int x,int y){
	struct node *headptr=NULL;
	node *temp=new node;
	
	cout<<" Enter Age\n ";
	cin>>temp->age;
	cin>>x;
	temp->age=x;
	
	temp->next=NULL;
	if(headptr==NULL)
	headptr=temp;
	else
	{
	node *temp2=headptr;
	while(temp2->age!=y){
		temp2=temp2->next;
		
	}
	temp->next=temp2->next;
	temp2->next=temp;
}
}
