#include<iostream>
using namespace std;
struct node
{
    int num;
    node *left,*right;
};
node *RootNodePtr=NULL;
void INSBST(){
 node *InsNodePtr=new node;
  cout<<"Insert the value\n";
  cin>>InsNodePtr->num;
  InsNodePtr->left=NULL;
  InsNodePtr->right=NULL;  
    if (RootNodePtr==NULL)
    {
        RootNodePtr=InsNodePtr;
    }
    else{
        node *NewPtr=RootNodePtr;
        int insert=0;
        while (insert=0)
        {
            if(NewPtr->num>InsNodePtr->num){
                if (NewPtr->left==NULL)
                {
                     NewPtr->left=InsNodePtr;
                     insert=1;
                }
                else
                NewPtr=NewPtr->left;
            }//comparision if
            else{
                if (NewPtr->right==NULL)
                {
                    NewPtr->right=InsNodePtr;
                    insert=1;
                }
                else
                NewPtr=NewPtr->right;
            }
        }
    }
}
void Preorder(node *RootNodePtr){
if (RootNodePtr!=NULL)
{
    cout<<"preorder result:  "<<RootNodePtr->num<<endl;
    Preorder(RootNodePtr->left);
    Preorder(RootNodePtr->right);
}
}
void Inorder(node *RootNodePtr){
if (RootNodePtr!=NULL)
{
    Inorder(RootNodePtr->left);
    cout<<"Inorder result:  "<<RootNodePtr->num<<endl;
    Inorder(RootNodePtr->right);
}
}
void Postorder(node *RootNodePtr){
if (RootNodePtr!=NULL)
{
    Postorder(RootNodePtr->left);
    Postorder(RootNodePtr->right);
    cout<<"Postorder result:  "<<RootNodePtr->num<<endl;
}
}
int SearchBST(node *RootNodePtr,int x){
    if (RootNodePtr==NULL)
    {
        return 0;//not found
    }
    if (RootNodePtr->num==x)
    return 1;//found
    else if (RootNodePtr->num>x)  
    return(SearchBST(RootNodePtr->left,x));
    else
    return(SearchBST(RootNodePtr->right,x));
}
int FindMin(node *RootNodePtr){
   if (RootNodePtr==NULL) 
    {
        return -1;
    }
    else 
    if (RootNodePtr->left==NULL)
    return RootNodePtr->num;
    else
    return FindMin(RootNodePtr->left);
     
}
int FindMax(node *RootNodePtr){
     if (RootNodePtr==NULL)
    {
        return -1;
    }
    else 
    if(RootNodePtr->right==NULL)
    return RootNodePtr->num;
    else
    return FindMax(RootNodePtr->right);
     
 }
node *minValueNode(node *Node)
{
node *current = Node;
/* loop down to find the leftmost leaf */
while (current->left != NULL)
current = current->left;
return current;
}
node* deleteNode(node *RootNodePtr, int data)
{
if(RootNodePtr== NULL)
return RootNodePtr;
else if(data < RootNodePtr->num)
RootNodePtr->left = deleteNode(RootNodePtr->left,data);
else if (data > RootNodePtr->num)
RootNodePtr->right = deleteNode(RootNodePtr->right,data);
// the above finds data to be deleted
else
{
if(RootNodePtr->left == NULL && RootNodePtr->right == NULL) // No child
{
delete RootNodePtr;
RootNodePtr= NULL;
}
else if(RootNodePtr->left == NULL) //has only one child
{
node *temp = RootNodePtr;
RootNodePtr= RootNodePtr->right;
delete temp;
}
else if(RootNodePtr->right == NULL)
{
node *temp = RootNodePtr;
RootNodePtr= RootNodePtr->left;
delete temp;
}
else
{
node *temp = minValueNode(RootNodePtr->right);
RootNodePtr->num = temp->num;
RootNodePtr->right = deleteNode(RootNodePtr->right,temp->num);
}
}
return RootNodePtr;
}
void menu(){
    cout<<"Enter [1] to insert data\n";
    cout<<"Enter [2] to display preorder\n";
    cout<<"Enter [3] to display Inorder\n";
    cout<<"Enter [4] to display postorder\n";
    cout<<"Enter [5] to search data\n";
    cout<<"Enter [6] to find min data\n";
    cout<<"Enter [7] to find max data\n";
    cout<<"Enter [8] to delete data\n";
    cout<<"Enter [0] to Exit\n";
}
 
 main(){
menu();
int choice;
do
{
    tryagain:
    cout<<"Enter your choice:   ";
    cin>>choice;
    switch (choice)
    {
    case 1:
INSBST();
        break;
    case 2:
Preorder(RootNodePtr);
        break;
        case 3:
Inorder(RootNodePtr);
        break;
        case 4:
Postorder(RootNodePtr);
        break;
        case 5:
        int x;
        cout<<"enter number to be deleted\n";
        cin>>x;
SearchBST(RootNodePtr,x);
        break;
        case 6:
FindMin(RootNodePtr);
        break;
        case 7:
FindMax(RootNodePtr);
        break;
        case 8:
        int data;
        cout<<"enter element to be deleted\n";
        cin>>data;
deleteNode(RootNodePtr, data);
        break;
    default:
    cout<<"invalid choice please enter again!\n";
    goto tryagain;
        break;
    }
} while (choice!=0);
return 0;
}
