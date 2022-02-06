#include<iostream>
using namespace std;
struct node
{
   int item;
   node *next;
};
struct node *stack=NULL;// initially stack  is empty
struct node *top=stack;
struct node *bottom=stack;
push(int item){
    node *newnode= new node;
    if (stack==NULL)
    {
   
   newnode->item=item;
   newnode->next=NULL;
   top=stack;
    }
    else{
      
    newnode->item=item;
    newnode->next=NULL;
    top->next=newnode;
    top=newnode;
    }
}
pop(){
    int pop_value=0;
    struct  node *target =stack;
    if (stack==NULL)
    {
        cout<<"Under flow\n";
    }
    else{
    if(top==bottom){
        pop_value=top->item;
        delete top;
     stack=NULL;
     top=bottom=stack;    
    }
    else{
        while(target->next!=top)
        target=target->next;
        pop_value=top->item;
        delete top;
        top=target;
        target->next=NULL;
    }
    }
    return(pop_value);
}
int main(){
    int item,delitem;
    cout<<"enter an item\n";
    cin>>item;
    push(item);
    delitem=pop();
    cout<<delitem;
}