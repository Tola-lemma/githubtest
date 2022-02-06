#include<iostream> 
using namespace std;
struct node{
    int data;
    node *next;
    node *prev;
};
node *head;//global scope of variable, pointer to head node
void insertAthead(int x){
node *temp=new node;// heap memory allocation 
temp->data=x;
temp->next=NULL;
temp->prev=NULL;
if(head==NULL){
head=temp;
return;
}
else{
   head->prev=temp;
    temp->next=head;
    head=temp;
}
}
void display()
{
    node *temp = head;
    cout<<"Forward: ";
    while (temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}

void reverseDisplay(){
    node *temp = head;
    if(temp==NULL)
    return;//empty list
    while (temp->next!=NULL)
    {
        temp=temp->next;
    }
    cout<<"reverse : ";
    while (temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->prev;
    }
    cout<<endl;
}
int main(){
 
    insertAthead(2);
    insertAthead(4);
    insertAthead(6);
    insertAthead(8);
    display();
    reverseDisplay();
}