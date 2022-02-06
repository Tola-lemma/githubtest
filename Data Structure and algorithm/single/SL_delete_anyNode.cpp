Void delete_anyNode(int x){

    node *headptr;
	node *temp,*temp3;;
	
	if(headptr==NULL)
cout<<"no data inside";
	else if(headptr->age==x)//age=data
	{
		temp=headptr;
		headptr=headptr->next;
	delete temp;
}
else{
temp=headptr;
	while(temp->age!=x){
		temp3=temp;
		temp=temp->next;
	}
	temp3->next=temp->next;
delete temp;
}
}
