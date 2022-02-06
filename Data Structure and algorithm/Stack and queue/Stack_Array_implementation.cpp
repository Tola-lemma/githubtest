#include<iostream>
using namespace std;
static int stack[5];
int top=-1;
 push(int item){
	if(top<5){
		top=top+1;//top++
    stack[top]=item;
}
    else 
		 {
    cout<<"stack overflow";
}
}
 pop(){
	int item;
	if(top==-1){
	cout<<"under flow\n";	
	}
	else{
	item=stack[top];
	top--;	
	cout<<item;
		}
}
 peek(){//top element
	if(top==-1){
		cout<<"stack is empty\n";
	}
	else{
		cout<<"top most element is: "<<stack[top];
	}
}
void display(){//traversing the content 
	 for(int i=top;i>=0;i--){
	 	cout<<stack[i]<<"  "<<endl;
	 }
}
int main(){
    int choice;
     cout<<"1: to enter push\n";
      cout<<"2: to pop\n";
      cout<<"3: to peek\n";
       cout<<"4: to display\n";
       cout<<" 0 to exit:\n";
       do{
    
    cout<<"enter your choice\n";
    cin>>choice;
    switch(choice){
    	case 1:
		int item;
    cout<<"Enter items\n";
    cin>>item;
    push(item);
    break;
    case 2:
    pop(); 
    break;
    case 3:
    peek();
    break;
    case 4:
    	cout<<"value in the stack is:\n";
   display();
   break;
   default:
   cout<<"enter your choice correctly:\n";
   }
   }while(choice!=0);
}
