#include<iostream>
using namespace std;
struct Student{
string data;
Student *next;
};
Student *head = NULL;
void insertStudent(){
	int n;
	
		cout<<"enter the student that yo7 want to add\n";
		cin>>n;
		cout<<"enter\n";
		for(int i=0;i<n;i++){
			Student *newnode = new Student();
	        Student *temp;
			
			cin>>temp->data;
			temp->next = NULL;
			if(head == NULL){
				head = temp = newnode;
			}
			else{
				temp->next = newnode;
				temp = newnode;
			}
		}
	}
		void display(){
			Student *temp;
			if(head == NULL)
				cout<<"THERE IS NO DATA";
			
			else{
				temp = head;
				while(temp!= NULL){
					cout<<temp->data<<" ";
					temp = temp->next;
				}
			}
		}
		
	
		int main(){
		insertStudent();
		 display();
		}
