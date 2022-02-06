#include<iostream>
using namespace std;
struct Country{
	char cName[50];
	Country *next;
};
Country *head=NULL;
Country* createCountry()
{
	Country *temp=new Country;
	cout<<"Enter Country Name:";
	cin>>temp->cName;
	temp->next=NULL;
	return temp;
}
void addAtEnd(Country *newCountry)
{
	if(head==NULL)
		head=newCountry;
	else
	{
		Country *temp=head;
		while(temp->next!=NULL)
			temp=temp->next;
		temp->next=newCountry;
	}
		
}
void addAtBegining(Country *newCountry)
{
	if(head==NULL)
		head=newCountry;
	else
	{
		newCountry->next=head;
		head=newCountry;
	}
}
void delete_start_node()  
 { 
	if(head==NULL)
		cout<<"There is nothing to delete";
	else
	{
	Country *temp;     
	temp = head;     
	head = head->next;     
	delete temp; 
	}
}

void display()
{
	if(head==NULL)
		cout<<"The linked list is empty!";
	else
	{
		Country *read=head;
		do{
			cout<<read->cName<<"\t";
			read=read->next;
		}while(read!=NULL);
		cout<<endl;
	}
}

int main()
{
	int n;
	cout<<"how many data you want to enter :\n";
	cin>>n;
	for(int i=0;i<n;i++){
	addAtEnd(createCountry());
	}
	cout<<"how many data you want to enter data to the beggining :\n";
			cin>>n;
			for(int i=0;i<n;i++){
	addAtBegining(createCountry());
	}
	display();
	cout<<"below here data is deleted from start node\n";
	delete_start_node();
	display();
	return 0;
}
