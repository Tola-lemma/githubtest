#include <iostream>
using namespace std;
struct node{
    int value;      
    struct node* next;
    struct node* previous;      
}node;

node* head = NULL;
node* tail = NULL;

int head_value();
int tail_value();
void push(int);
int pop();
void inject(int);
int eject();

int size = 0;

void push(int value)
{
    if (head == NULL)
    {       
        head = malloc(sizeof(node));
        head->value = value;
        head->next = NULL;
        head->previous = NULL;
        tail = head;
        size++;
    }
    else
    {
        node* new_node = malloc(sizeof(node));
        new_node->value = value;
        new_node->next = head;
        new_node->next->previous = new_node;
        head = new_node;
        new_node->previous = NULL;
        size++;     
    }   
}

int pop()
{   
    if (head == NULL)
    {
        printf("List Empty\n");     
        return 0;
    }

    node* temp = head;
    int value = temp->value;        
    head = head->next;
    free(temp);
    if (head != NULL)
        head->previous = NULL;
    size--;
    if (size == 0)
        tail = NULL;
    return value;
}

void inject(int value)
{
    if (tail == NULL)
    {               
        tail = malloc(sizeof(node));
        tail->value = value;
        tail->next = NULL;
        tail->previous = NULL;
        head = tail;
        size++;
    }
    else
    {
        node* new_node = malloc(sizeof(node));      
        new_node->value = value;
        tail->next = new_node;
        new_node->previous = tail;
        tail = new_node;
        new_node->next = NULL;
        size++;
    }
}

int eject()
{
    if (tail == NULL)
    {
        printf("List Empty\n");     
        return 0;
    }

    int value = tail->value;
    node* temp = tail;
    tail = temp->previous;
    free(temp);
    if (tail != NULL)
        tail->next = NULL;
    size--; 
    if (size == 0)
        head = NULL;
    return value;
}