#include <iostream>
#include <fstream>
#include <cstring>
#include <iomanip>
#include<cstdlib>
using namespace std;
void menu();

struct bus
{
	char bus_number[6];
	char tariff[10];
	char source[20];
	char destination[20];
	char starting_time[10];
}b;

void createBusInfo()
{
 ofstream ofile;
 ofile.open("busRecord.txt",ios::app);
 if(ofile.fail())
 { 
     cout<<"Can't open the file "<<endl;
  }
  else
 {
	    cout<<" Enter your full bus information :"<<endl;
	    cout<<" Enter bus number :"<<endl;
	    cin>>b.bus_number;
	    cout<<" Enter Tariff :"<<endl;
	    cin>>b.tariff;
	    cout<<" Enter source :"<<endl;
	    cin>>b.source;
	    cout<<" Enter destination :"<<endl;
	    cin>>b.destination;
	    cout<<"Enter starting time :"<<endl;
	    cin>>b.starting_time;
	    ofile.write((char*)&b,sizeof(b));
	    cout<<"Bus recored successfully :"<<endl;
	    ofile.close();
	}
}

void ReadBusRecord()
{
    ifstream infile;
    infile.open("busRecord.txt",ios::in);
    if(infile.fail())
    {
        cout<<"Can't open "<<endl;
    }
    else
    {
        cout<<"Bus number\t"<<"Tariff\t\t"<<"Source \t\t"<<"Destination\t\t"<<"Starting time\t\t"<<endl;
        cout<<"**************************************************************************************"<<endl;
        while(infile.read((char*)&b,sizeof(b)))
    {
    cout<<b.bus_number<<"\t\t"<<b.tariff<<"\t\t"<<b.source<<"\t\t"<<b.destination<<"\t\t\t"<<b.starting_time<<endl;
    }
     cout<<"**************************************************************************************"<<endl;
    infile.close();
    }
}

void searchBus()
{
	bool a=false;
    char ch [6];
ifstream infile;
infile.open("busRecord.txt",ios :: in);
if(infile.fail())
{
    cout<<"Error in opening the file "<<endl;
}
else
{
    cout<<"Enter the bus number you are looking for"<<endl;
    cin>>ch;
    while(infile.read((char*)&b,sizeof(b)))
{
if(!strcmp(b.bus_number,ch))
{
		cout<<"The bus information that you are looking for is :"<<endl;
		cout<<"Bus number :"<<b.bus_number<<endl;
		cout<<"Tarrif: "<<b.tariff<<endl;
		cout<<"Source : "<<b.source<<endl;
		cout<<"Destination: "<<b.destination<<endl;
		cout<<"Starting time: "<<b.starting_time<<endl;

 a=true;
  }
 }
}
if(a==false)
{
    cout<<"Sorry the bus you are looking for is not found "<<endl;
}
}
void updateBusInfo()
{
    char ch[6];
    bool found =false;
    cout<<"Enter the bus to be modified "<<endl;
    cin>>ch;
    fstream file ;
    file.open("busRecord.txt",ios::in|ios::out);
    if(file.fail())
    {
        cout<<"Error in opening the file "<<endl;
    }
    else
    {
        
        while(file.read((char*)&b,sizeof(b)) && found==false)
        {
       if(!strcmp(b.bus_number,ch))
        {
	            cout<<"Enter the detail of the bus to be modified "<<endl;
	            cout<<"Enter the new bus number "<<endl;
	            cin>>b.bus_number;
	            cout<<"Enter the new tariff"<<endl;
	            cin>>b.tariff;
	            cout<<"Enter the new source "<<endl;  
	            cin>>b.source;
	            cout<<"Enter the new destination "<<endl;
	            cin>>b.destination;
	            cout<<"Enter the new starting time "<<endl;
	            cin>>b.starting_time;
	            
	            int back = -1*sizeof(b);
	            file.seekp(back,ios::cur);
	            file.write((char*)&b,sizeof(b));
	            found=true;
	            cout<<"Modified successfully"<<endl; 
        } 
    }
    
  if(found==false)
  {
      cout<<"Bus record not found "<<endl;
  }
}
  file.close();
}

void deleteBusRecord()
{char ch[6];
cout<<"Enter the bus number that you want to delete"<<endl ;
    cin>>ch;  
    ifstream infile;
    infile.open("busRecord.txt");
    ofstream ofile;
    ofile.open("temp.txt");
    while(infile.read((char*)&b,sizeof(b)))
{
          if(strcmp(b.bus_number,ch))
    {
          ofile.write((char*)&b,sizeof(b));
        
    }
}
ofile.close();
infile.close();
remove("busRecord.txt");
rename("temp.txt","busRecord.txt");
cout<<"Bus record is deleted succesfully"<<endl;
}

//***************************************************************
//    	INTRODUCTION FUNCTION
//****************************************************************

void intro()
{

    cout<<setw(90)<<"              BUS RESERVATION SYSTEM                                "<<endl;
	cout<<setw(80)<<"********************************************************************"<<endl;
	cout<<setw(80)<<"*          WELCOME TO BUS RESERVATION SYSTEM                       *"<<endl;
	cout<<setw(80)<<"*                PROJECT                                           *"<<endl;
	cout<<setw(80)<<"*       MADE BY : TOLA,YEABISERA,TADESSE (JOINTLY)                 *"<<endl;
	cout<<setw(80)<<"*           ADDIS ABABA UNIVERSITY                                 *"<<endl;
	cout<<setw(80)<<"********************************************************************"<<endl;
	cout<<"Press Enter key to start ..................... ";
	
    cin.get();

for(int i=0;i<100;i++){
	    cout<<endl<<endl;
		cout<<"::::::::::::::::::::::::::::::::::::opening the page "<<i<<"%:::::::::::::::::::::::" << endl;

   system("cls");
  }

}

void menu()
{
	while(1){
	
	int ch;
    cout<<"               ------------MAIN MENU-----------------                  \n\n";
	cout<<"*************************************************************************\n";
	cout<<"* Enter [1] To  create Bus Record                                       *\n";
	cout<<"* Enter [2] To  Display Bus record                                      *\n";
    cout<<"* Enter [3] To Seach specific Bus Record                                *\n";
	cout<<"* Enter [4] To  Modify/Update Bus Record                                *\n";
	cout<<"* Enter [5] To  Delete Bus Record                                       *\n";
	cout<<"* Enter [6] To  Exit                                                    *\n";
	cout<<"*************************************************************************\n";
		tryagain:
	cout<<"please enter your choice [1-6] from menu \n";
	cin>>ch;
	switch(ch)
	{
		case 1:
			createBusInfo();
			break;
	    case 2:
			ReadBusRecord();
			break;
		case 3:
			searchBus();
			break;
	   case 4:
		    updateBusInfo();
			break;
	   case 5:
			deleteBusRecord();
			break;
	   case 6: 
			exit(0);
	   default:
		    cout<<"You Enter incorrect number,please Enter Again........\n";	
			goto tryagain;
			break;
	}
	
}
}
int main()
{
	system("color 8F");
	intro();
	menu();
  
    return 0;
}
