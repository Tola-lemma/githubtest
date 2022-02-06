#include<iostream>
using namespace std;
struct node //data type
{
    int data; 
    node *next;
};
struct node *head=NULL;// head pointer to store adress of structure
 int count=0;

 void addtoBeginning(){
node *newhead=new node;
cout<<" Insert your value ;\n";
cin>>newhead->data;
cout<<"node Added to the beginning\n";
count++;
 newhead->next=head;
 head=newhead;
 }
void addEnd(){
    node *temp;
    node *newnode=new node;
    cout<<"enter your Value\n";
    cin>>newnode->data;
    count++;
    newnode->next=NULL;
    temp=head;
    while (temp->next!=NULL)
    {
       temp=temp->next;
    }
    temp->next=newnode;
}
void addatspecifiedLoc(){
node *temp;
node *newnode=new node;
int pos;//position to enter
cout<<"Enter the position you want to enter the value\n";
cin>>pos;
if (pos>count)
{
   cout<<"invalid position,no node found\n";
}
else
{
    int i=1;
temp=head;
while (i<pos) {
temp=temp->next;
i++;
}
cout<<"Enter the Data\n";
cin>>newnode->data;
count++;
}
// first establish right link
newnode->next=temp->next;
temp->next=newnode;
}
 

 void deletefront(){
     node *temp=new node;
 if(head==NULL){
	cout<<"empty list ";}
    else
	{
	temp=head;
	head=head->next;
	delete temp;
    cout<<"deleted successfully\n";
    count--;
 }
 }
void deleteEnd(){
    node *temp ;
    node *temp2;
    if(head==NULL){
	cout<<"empty list ";}
    else
    {
temp=head;
while (temp->next!=NULL)
{
    temp2=temp;
    temp=temp->next;
}
temp2->next=NULL;
delete temp;
cout<<"deleted successfully\n";
count--;
    }
}

void deleteSpecificPos(){
node *temp;
node *temp2;
int pos;
cout<<"Enter the position you want to delete the value\n";
cin>>pos;
if(pos>count){
    cout<<"invalid position,no node found\n";
}
else{
    temp=head;
    if(pos==1){
        head=temp->next;
        delete temp;
    }
    int i=1;
    while (i<pos-1)
    {
    temp=temp->next;
    i++; 
    }  
    temp2=temp->next;
    temp->next=temp2->next;
    delete temp2;
    cout<<"deleted successfully\n";
    count--;
}
   
}

void display(node *temp){
    temp=head;
 while (temp!=NULL)
 {
     if(temp==NULL){
	cout<<"Empty list ";
	}
    cout<<" "<<temp->data;
    temp=temp->next;
 }
 cout<<endl;
 }

 void display_Reverse () {
        node *current,*next,*prev;
        current=head ;
        prev=NULL;
        while (current!=NULL)
        {
            next=current->next;
            current->next=prev;
            prev=current;
            current=next;
        }
              head=prev;
    }

void Print(struct node *p)  //to display recursivily 
{1
    if (p==NULL)
    return;
    cout<<" "<<p->data;
    Print(p->next);

    /*   // to display in reverse order
    Print(p->next);
     cout<<" "<<p->data;*/
}

 void menu(){
     cout<<"1: to enter element to linked list\n";
     cout<<"2: Add to beginning\n";
     cout<<"3: Add to end\n";
     cout<<"4: Add at specified position\n" ;
     cout<<"5: delete the beginning\n";
     cout<<"6: delete end\n";
     cout<<"7: delete specific position\n"; 
     cout<<"8: display\n";
     cout<<"9: display reverse\n";
     cout<<"0: to exit\n"; 
 }
 int main(){ 
     top: 
      menu();     
     node *temp,*temp2;
 int iterate; 
 int choice;
 do{
 cout<<"please enter your choice\n";
 cin>>choice;
 switch(choice){
case 1:
 int n;
 cout<<"How many element you want to enter\n";
 cin>>n;
 cout<<"Enter your data"<<endl;
 for(int i=1;i<=n;i++){
 temp= new node; //new=malloc(sizeof(struct node))
 temp2; 
cin>>temp->data;
temp->next=NULL;
if (head==NULL)
{
   head=temp;
}
else
{
    temp2=head ;
    while(temp2->next!=NULL)
	{
		temp2=temp2->next;//move to next link in chain
}
    temp2->next=temp;
}
count++;
 }
temp=head;//head pointer to store address of structure
break;
case 2:
addtoBeginning();
break;
case 3:
addEnd();
break;
case 4:
addatspecifiedLoc();
break;
case 5:
deletefront();
break;
case 6:
deleteEnd();
break;
case 7:
deleteSpecificPos();
break;
case 8:
//Print(temp);//recursive
display(temp);
break;
case 9:
display_Reverse();
display(temp);
break;
default:
cout<<"please enter correct choice\n";
goto top;
  }
   }while (choice!=0);
 }