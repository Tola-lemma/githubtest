Void delete_end(){

    node *headptr;
	node *temp,*temp3;;
	
	if(headptr==NULL)
cout<<"no data inside";
	else
	{
		temp=headptr;
	
	while(temp->next!=NULL){
		temp3=temp;
		temp=temp->next;
	}
	temp3->next=NULL;
delete temp;
}
}
