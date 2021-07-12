/*Write a program using structure which accepts information on five books.
The inf. includes title of the book, and publication year.
There is another information about the book, called status, 
status will automatically be given by the program based on the publication year entered by the user,
if year of put publication is before 1990, the status is a "Out dated"; if the book is published between 1991-2000,
the status will automatically be "medium", for books published after the year 2000, status will be "latest", 
the program should output what is entered by the user in the following ways as an example.

Title:
Publication year:
Status:	
*/

#include <iostream>
#include <iomanip>
using namespace std;

struct books
{
    char title[25];
    char pub[25];
    int year;
    
};

int main()
{
   int i, n;
   
 cout<<"Enter Number Of Books : ";
   cin>>n;
    
    struct books a[n];
    
   cout<<"Enter The Book Details : \n";
  cout<< setw(40) << right << setfill('-') << "-" << endl << setfill(' ');
  
   for(i=0;i<n;i++)
   {
   cout<<"Title : ";
   cin>>a[i].title;
   
   cout<<"Publication : ";
   cin>>a[i].pub;
   
 cout<<"Year : ";
   cin>>a[i].year;
   
 cout<< setw(55) << right << setfill('-') << "-" << endl << setfill(' ');

	}
    
 cout<< setw(55) << right << setfill('=') << "=" << endl << setfill(' ');
    cout<<"Book Title \t|Publication \t|Year \t\t|Status\n";
 

     cout<< setw(55) << right << setfill('=') << "=" << endl << setfill(' ');
    
 for(i=0;i<n;i++)
    {
   cout<<"\n"<<a[i].title<<"\t\t|"<<a[i].pub<<"\t\t|"<<a[i].year<<"\t\t|";
 if(a[i].year <=1990)
 {
 cout<<"Outdated";
 }
 else if(a[i].year >= 1991 && a[i].year <=2000)
 {
 cout<<"Medium";
 }
 else
 {
 cout<<"Latest";
 }
    }
   cout<<endl<< setw(55) << right << setfill('=') << "=" << endl << setfill(' ');
  
    return 0;

}