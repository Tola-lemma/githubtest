#include<iostream>
using namespace std;
struct node
{
    int item;
    node *next;
};
node *top =NULL;//empty stack
void push(int x){
    node *temp =new node;
    temp->item=x;
    temp->next=top;
    top=temp;
}
void pop(){
   node *temp ;
   if (top==NULL)// empty  or underflow
   {
       return;
   }
   temp=top;
   top=top->next;
   delete temp;
}
void display(){
    node *temp=top;
    while (temp!=NULL)
    {
        cout<<temp->item<<" ";
         temp=temp->next;
    }
    
}
int main(){
push(5);
push(10);
push(15);
push(20);
display();//20 15 10 5 
pop();
cout<<endl;
display();//15 10 5
}