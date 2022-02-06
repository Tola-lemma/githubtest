#include<iostream>
using namespace std;
struct node{
   int data;
node *next;
};
node *head=NULL;

void insert_end(int x){
node *temp=new node;
temp->data=x;
temp->next=NULL;
if (head==NULL)
{
    head=temp;
}
else
{
    node *temp2=head;
    while (temp2->next!=NULL)
    {
        temp2=temp2->next;
    }
    temp2->next=temp;
}

}
void insert_Front(int x){
	node *temp=new node;
    temp->data=x;
	temp->next=NULL;
	if(head==NULL)
	head=temp;
	else
	{
	temp->next=head;
	
		head=temp;
}
}
void insert_right_y(int x, int y)
{
node *temp=new node;
temp->data=x;
temp->next=NULL;
if(head==NULL)
head = temp;
else
{
node *temp2 = head;
while(temp2->data!=y)
{
temp2 = temp2->next;
}
temp->next = temp2->next;
temp2->next = temp;
}
}
void insert_left_y(int x, int y)
{
node *temp=new node;
temp->data=x;
temp->next=NULL;
if(head==NULL)
head = temp;
else
{
node *temp2 = head;
node *temp3;
while(temp2->data!=y)
{
temp3 = temp2;
temp2 = temp2->next;
}
temp->next = temp3->next;
temp3->next = temp;
}
}
void delete_front()
{
node *temp;
if(head==NULL)
cout <<"No data inside\n";
else
{
temp = head;
head = head->next;
delete temp;
}
}
void delete_end()
{
node *temp, *temp3;
if(head==NULL)
cout <<"No data inside\n";
else {
temp = head;
while(temp->next!=NULL) {
temp3 = temp;
temp = temp->next;
}
temp3->next = NULL;
delete temp;
}
}
void delete_any(int x)
{
node *temp, *temp3;
if(head==NULL)
cout <<"No data inside\n";
if(head->data==x)
{
temp = head;
head = head->next;
delete temp;
}
else
{
temp = head;
while(temp->data!=x)
{
temp3 = temp;
temp = temp->next;
}
temp3->next = temp->next;
delete temp;
}
}
void display(){
    node *temp;
    if (head==NULL)
    {
        cout<<"No data";
    }
    else
    {
    temp=head;
    while (temp!=NULL)
    {
        cout<<"DATA:  "<<temp->data<<endl;
        temp=temp->next;
    }
    
}
}
// void display(node *temp){
// 	do{
// 	if(temp==NULL){
// 	cout<<"Empty list ";
// 	}
// 	else
// 	{
// 	cout<<"age\t"<<temp->data<<endl;
// 	temp=temp->next;
// 	cout<<endl;
//          }
// }while(temp!=NULL);
// }
int main(){
//     int data;
// node *temp=new node;
// cout<<"Enter data\n";
// cin>>temp->data;
// temp->next=NULL;
// insert_end(data);
insert_end(1);
insert_end(2);
insert_end(3);
display();
cout<<endl;
insert_Front(4);
display();
cout<<endl;
insert_right_y(5,4);
display();
cout<<endl;
insert_left_y(6,1);
display();
cout<<endl;
delete_front();
display();
cout<<endl;
delete_end();
display();
cout<<endl;
delete_any(6);
display();

//display(temp);
}