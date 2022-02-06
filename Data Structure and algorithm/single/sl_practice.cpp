#include<iostream>
using namespace std;
struct node{
	int data;
	node *next;
};
node *head=NULL;
void display(node *temp){
		cout<<"Entered Data was: \n";
	do{
	if(temp==NULL){
		cout<<"empty list\n";
	}
	else
	{
	cout<<temp->data<<endl;
		temp=temp->next;
	}
	}while(temp!=NULL);
}
int main(){
int data;
int choice;
node *temp;
node *temp2;
do{
temp=new node;
temp2=new node;
cout<<"Enter the data\n";
cin>>temp->data;
temp->next=NULL;
if(head==NULL)
	head=temp;
	else
	{
		temp2=head;//we know this is not NULL
	while(temp2->next!=NULL)
	{
		temp2=temp2->next;
}
temp2->next=temp;
	}
	cout<<"Do you want to continue? if yes press 1 if no 0\n";
	cin>>choice;
}while(choice);
temp=head;
display (temp);
}
