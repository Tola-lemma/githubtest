void insert_Front(int x){
	struct node *headptr;
	node *temp=new node;
	
    temp->age=x;
	temp->next=NULL;
	if(headptr==NULL)
	headptr=temp;
	else
	{
	temp->next=headptr;
	
		headprt=temp;
}
}
