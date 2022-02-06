#include<iostream>
#include<conio.h>
#include<string>
#include<stdlib.h>  //-->library for malloc & realloc...
using namespace std;

bool register_student(struct student *stud,struct list *ls);
double calculate_aggregiate(struct student *);
void addToList(struct student *stud, struct list *l);
void showList(struct student *stud, struct list *l);

struct student
{
    char name[20];
    int metric_marks, fsc_marks, entryTest_marks;
    student *next;
    //--> 10 % weightage to metric, 50% to fsc, 40% to entry test...

};

struct list
{
    char name[20];
    double aggr;
    list *next;

};


int main()
{   
    student *s;     //--> creates an object of student...
    s = (struct student *) malloc(sizeof(struct student));

    struct list *ls;
    ls = (struct list *) malloc(sizeof(struct list));
    strcpy(ls->name, "");
    ls->aggr = 0;
    ls->next= NULL;
    do
    {
    cout<<"Write 1 to register a new student\n";
    cout<<"Write 2 to display lists of students registered\n";
    cout<<"Write 3 to quit\n";

    int input;
    cin>>input;
    if (input == 1)
    {
        register_student(s, ls);

    }
    else if (input == 2)
    {
        showList(s, ls);
    }
    else if (input == 3)
        exit(0);
    cout<<"\n";
    } while(1);

    getch();
}

bool register_student(struct student *stud,struct list *ls)
{   
    student *s = stud;
    cout<<"Write name of student\n";
    cin>>s->name;
    cout<<"Enter metric percentage\n";
    cin>>s->metric_marks;
    cout<<"Enter fsc percentage\n";
    cin>>s->fsc_marks;
    cout<<"Enter entry test percentage\n";
    cin>>s->entryTest_marks;

    double aggregiate;
    aggregiate = calculate_aggregiate(s);   //-->call to function below...
    cout<<"aggregiate percentage is "<< aggregiate<<"\n";
    if (aggregiate >= 70)
    {
        cout<<"Student registered in Electrical\n";
        addToList(s,ls);
        return true;
    }
    else if (aggregiate >= 60)
    {
        cout<<"Student registered in Mechanical\n";
        addToList(s,ls);
        return true;
    }
    else if (aggregiate >=50)
    {
        cout<<"Student registered in CSE\n";
        addToList(s,ls);
        return true;
    }
    else
    {
        cout<<"Sorry, the student can't be registered in engineering\n";
        return false;
    }

}

double calculate_aggregiate(struct student *stud)
{   
    student *s = stud;
    double aggr;
    aggr = s->metric_marks * 10/100  + s->fsc_marks * 50/100 + 
        s->entryTest_marks * 40/100;

    return aggr;

}


void addToList(struct student *stud, struct list *l)
{   
    list *pointer = l;
    while (pointer->next != NULL)
    {
        pointer = pointer->next;
    } 
    pointer->next = (struct list *) malloc(sizeof(struct list));
    pointer = pointer->next;
    strcpy(pointer->name , stud->name);
    pointer->aggr = calculate_aggregiate(stud);
    pointer->next = NULL;


}

void showList(struct student *stud, struct list *l)
{
    list *pointer = l;
    if (pointer->next == NULL)
        cout<<"No student registered yet!\n";
    else
    {
        cout<<"Students statistics are: \n";
        while (pointer->next != NULL)
        {
            pointer = pointer->next;
            cout<<"Name of student is: "<<pointer->name<<"\n";
            cout<<"Aggregiate of student is: "<<pointer->aggr<<"\n";
            if (pointer->aggr >= 70)
                cout<<"Student registered in Electrical\n";
            else if(pointer->aggr >=60)
                cout<<"Student registered in Mechanical\n";
            else
                cout<<"Student registered in CSE\n";
                cout<<"\n";
            }
        }
    }
