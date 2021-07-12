//Tola's trail


/*#include<iostream>
using namespace std;
int main()
{
  int enter=10;
cout<<"enter";
  cin>>enter;
switch(enter)
  {
    case 1:
	enter=-4;
      case 2:
	  enter=-6;
        case 4:
		break;

          case 6:
		  enter=-8;
        break;
          default:
		  enter=-4;

  }
cout<<enter;
  return 0;
}
#include<iostream>
#include<string>
using namespace std;
int main()
{
	int a[20],n;
	int i,j,temp;
cout<<"how many number you want to sort ? "<<endl;
cin>>n;
cout<<"here enter your number you want to sort\n";
for(i=1;i<=n;i++)
cin>>a[i];

					cout<<"Data before sorting is given:\n";
					for(i=1;i<=n;i++)
					cout<<a[i]<<" ";
					
					cout<<endl;
					
	//ascending
	for(i=1;i<=n-1;i++)
       {
       for(j=i+1;j<=n;j++)
         
         {
      	    if(a[i]>a[j])
          {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
       }
     }
}
    cout<<"\nData After sorting in Ascending order is given:\n";
	
	for(i=1;i<=n;i++)
	cout<<a[i]<<" ";
	cout<<endl;
							//descending
							for(i=1;i<=n-1;i++)
						     {
						       for(j=i+1;j<=n;j++)
						         
						            {
						            	if(a[i]<a[j])
						            	{
						              temp=a[i];
						              a[i]=a[j];
						              a[j]=temp;
						            }
						         }
							}
						    cout<<"\nData After sorting in Descending order is given:\n";
							
							for(i=1;i<=n;i++)
							cout<<a[i]<<" ";
							
							cout<<endl;

return 0; 
}


//Sum of the 3 values
#include<iostream>
#include<string>
using namespace std;
int main()
{
 int sum=0,number,value;
cout<<"Enter the number of values to be processed: ";
 cin>>number;
for(int i=1; i<=number; i++)
{
cout<<"Enter a value: ";
 cin>>value;
sum+=value;
}
cout<<"Sum of the "<<number<< " values is "<<sum<<endl;
return 0;
}

//simple calculator
#include<iostream>
using namespace std;

int main()
{
    char op;
    float num1, num2;

    cout<<"Enter operator either + or - or * or /: ";
    cin>>op;

    cout<<"Enter two operands: ";
    cin>>num1>>num2;

    switch(op)
    {
    case '+':
        cout<<num1+num2;
        break;

    case '-':
        cout<<num1-num2;
        break;

    case '*':
        cout<<num1*num2;
        break;

    case '/':
        cout<<num1/num2;
        break;

    default:
        // If the operator is other than +, -, * or /, error message is shown
        cout << "Error! operator is not correct";
        break;
    }

    return 0;
}


//count number of vowel and consonent in a given stri
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
char s[200];
int vowel=0,consonent=0;
cout<<"Enter any string\n";
gets(s);
for(int i=0;s[i]!='\0';i++)
  {
       if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
       vowel++;
       else
       consonent++;
  }
  cout<<"Total Vowel="<<vowel<<"  and Consonent="<<consonent;
}


//enter number upto you want to display prime number
#include<iostream>
using namespace std;
int main()
{
     int n;
cout<<"Enter number upto you want to print prime number\n";
    cin>>n;
for(int i=2;i<=n;i++)
{
    int no=i,m=0;
for(int j=2;j<=no-1;j++)
    {
if(no%j==0)
    m=1;
}
if(m==0)
cout<<no<<" ";
    }
return 0;
}

//PATTERN
//display x pattern as you want

#include<iostream>
using namespace std;
int main()
{
int n;
cout<<"inter the number of * you want to display"<<endl;
cin>>n;
    for(int i=1; i<=n; i++)

    {
    for(int j=1; j<=n; j++)
        {
         if(i==j||(i+j)==n+1)//change only this line in above program
                cout<<"*";
            else
                cout<<" ";//Remember:-put space inside double quotes

        }
        cout<<"\n";
    }
    return 0;
}

#include<iostream>
#include<string>
using namespace std;
int main()
{

for(int i=1;i<=5;i++)
	{ 	for(int j=1;j<=5;j++)
	 { 	if(i==1||(i+j)==6||i==5)//change only this line in above program    z
cout<<"*";
else
cout<<" ";
	 	 }
cout<<"\n";
 	}

}

for(int i=1;i<=5;i++) {
for(int j=1;j<=5;j++) 	{
	if(i==1||i==5||j==1||j==5)//change only this line in all program     square
	cout<<"*";
	else
cout<<" ";
}

 		cout<<"\n";

}
}

//MULTIPLE WORD IN THE SAME LINE (to read text containing blanks(embedded blanks),cin.get()
#include<iostream>
#include<string>
using namespace std;
int main()
{
    const int max=80;
    char str[max];

       cout<<"enter string";
  cin.get(str,max);//max avoid buffer over flow
    cout<<" you entered:  "<<str;


    return 0;
}

// read multiple line(typing many line as we want) and terminate on $
#include<iostream>
#include<string>
using namespace std;
int main()
{
    const int max=80;
    char str[max];

    cout<<"enter string";
    cin.get(str,max,'$');
    cout<<" the string entered was:  "<<str;


    return 0;
}

//avoids buffer over flow width(to limit numb of char in an array  cin.width
#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;
int main()
{
    const int max=20;
    char str[max];

    cout<<"enter string";
    cin>>setw(max)>>str;
    cout<<" the string entered was:  "<<str;


    return 0;
}

//we can initialize a string to a cnst value when we define
#include<iostream>
#include<string>
#include<iomanip>
using namespace std;
int main()
{
char str[]="welcome to cpp programming language ";
cout<<str;
return 0;
}

//COPYING STRING using strlen/for loop is used
#include<iostream>
#include<string>//is prototype for strlen

using namespace std;
int main()
{
    const int max=80;
    int i;
    char str1[]="welcome to cpp programming language ";
char str2[max];
for(i=0;i<strlen(str1);i++)
str2[i]=str1[i];
str2[i]='\0';
cout<<endl;
cout<<str2;
return 0;
}

//COPYING STRING(simple way) using strcpy or strncpy/for loop isn't used
#include<iostream>
#include<string.h>//is prototype for strcpy
using namespace std;
int main()
{

    char me[20]="Tola";
cout<<me<<endl;
strcpy(me,"You are not me!");
cout<<me<<endl;
return 0;
}


//COPYING STRING(simple way) using strncpy=>it copy only specified numb of char
#include<iostream>
#include<cstring>//is prototype for strncpy
using namespace std;
int main()
{

    char str1[]="string test";
    char str2[]="Hello";
    char one[9];
strncpy(one,str1,10);
one[9]='\0';
cout<<one<<endl;
strncpy(one,str2,2);
cout<<one<<endl;
strcpy(one,str2);
cout<<one<<endl;
return 0;
}
//COPYING STRING(simple way) using strncpy=>it copy only specified numb of char
#include<iostream>
#include<string>//is prototype for strncpy
using namespace std;
int main()
{

    char str1[]="string test";
    char str2[]="Hello";
    char one[10];
strncpy(one,str1,9);
one[9]='\0';
cout<<one<<endl;
strncpy(one,str2,2);
one[2]='\0';
cout<<one<<endl;
strcpy(one,str2);
cout<<one<<endl;
return 0;
}
//Concatinating/appending of string using strcat
#include<iostream>
#include<string>//is prototype for strcat
using namespace std;
int main()
{

    char str1[30];
    strcpy(str1,"abc");
    cout<<str1<<endl;
     strcat(str1,"def");
    cout<<str1<<endl;

    char str2[]="xyz";
    strcat(str1,str2);
    cout<<str1<<endl;
    str1[4]='\0';
    cout<<str1<<endl;
return 0;
}


//Concatinating/appending of string(at specified numb)using strncat
#include<iostream>
#include<string>//is prototype for strncat
using namespace std;
int main()
{

    char str1[30];
    strcpy(str1,"abc");
    cout<<str1<<endl;
     strncat(str1,"def",2);
    str1[5]='\0';
    cout<<str1<<endl;

    char str2[]="xyz";
    strcat(str1,str2);
    cout<<str1<<endl;
    str1[4]='\0';
    cout<<str1<<endl;
return 0;
}

//comparing string using strcmp
#include<iostream>
#include<string>//is prototype for strcmp
using namespace std;
int main()
{
cout<<strcmp("abc","def")<<endl;
cout<<strcmp("def","abc")<<endl;
cout<<strcmp("abc","abc")<<endl;
cout<<strcmp("abc","abcdef")<<endl;
cout<<strcmp("abc","ABC")<<endl;
return 0;
}
//comparing string at specified numb using strncmp
#include<iostream>
#include<string>//is prototype for strncmp
using namespace std;
int main()
{
cout<<strncmp("abc","def",2)<<endl;
cout<<strncmp("def","abc",3)<<endl;
cout<<strncmp("abc","abc",2)<<endl;
cout<<strncmp("abc","abcdef",5)<<endl;
cout<<strncmp("abc","ABC",20)<<endl;
return 0;
}


//pointer
#include<iostream>
#include<cstring>
using namespace std;

int main()
{
char *str="Hello";
int nums[]={10,20,30,40};
int *ptr=&nums[0];
int *ptr1=&nums[2];
int *ptr2=&nums[1];
int *ptr3=&nums[3];
int n=ptr3-ptr;
cout<<"n="<<n<<endl;
cout<<*ptr3<<endl;
cout<<*(str+3)<<endl;

return 0;
}

//adding two user input number and evaluate their sum using pointer
#include<iostream>
using namespace std;
int main()
{
 float a,b,c;
 float *p,*q,*r;
 p=&a;
 q=&b;
 r=&c;
 cout<<"Enter first number\n";
 cin>>*q;
 cout<<"Enter second number\n";
 cin>>*r;
 *p=*q + *r;
 cout<<"Their sum is="<<*p;
}
*/
#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
    const int max=80;
    float result[max];

    int i,n;
    cout<<"enter no of student:"<<endl;
    cin>>n;
    cout<<"enter result"<<endl;
   for(i=0;i<n;i++)

    cin>>result[i];

    float sum=0,average;

    for(i=0;i<n;i++)

            sum+=result[i];
    average=(sum/n);

        cout<<"average="<<average<<endl;

    int nolta=0;
       for(i=0;i<n;i++)
    {
    if(result[i]<average)

    nolta=nolta+1;
    }
    cout<<"student who score less than average="<<nolta<<endl;
    cout<<endl;
    return 0;
  }
   /* //printing array element using loop
 #include<iostream>
#include<string>
using namespace std;
int main()
{
    int a[5]={20,10,80,70,60};
    	for(int i=0;i<=4;i++)
    cout<<"Value at a["<<i<<"]="<<a[i]<<"\n";
     return 0;
    }

    //user input array
     #include<iostream>
#include<string>
using namespace std;
int main()
{
    int a[5];
    cout<<"Enter element 1=";
     	cin>>a[0];
    	cout<<"Enter element 2=";
    	cin>>a[1];
    cout<<"Enter element 3=";
    	cin>>a[2];
    	for(int i=0;i<=2;i++)
    	cout<<"Value at a["<<i<<"]="<<a[i]<<"\n";
     }

//user input array using loop
  #include<iostream>
#include<string>
using namespace std;
int main()
{

    	int a[5],i;
    	for(i=0;i<=2;i++)
     	{
    cout<<"Enter element "<<i+1<<"=";
    		cin>>a[i];
    }
    	for(i=0;i<=2;i++)
    	cout<<"Value at a["<<i<<"]="<<a[i]<<"\n";
    }

     //addition of user input nxn matrix multi dimensional array
  #include<iostream>
#include<string>
using namespace std;
int main()
{
int i,j,n;
cout<<"Enter order of matrix"<<endl;
cin>>n;
int matrix[n][n];
cout<<"enter matrix row by row"<<endl;
for( i=0;i<n;i++)
for( j=0;j<n;j++)
cin>>matrix[i][j];
cout<<"the nXn of matrix is here below:"<<endl;
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
cout<<matrix[i][j]<<" ";
}
cout<<endl;
}
int matrix1[n][n];
cout<<"enter matrix1 row by row"<<endl;
for( i=0;i<n;i++)
for( j=0;j<n;j++)
cin>>matrix1[i][j];
cout<<"the nXn of matrix1 is here below:"<<endl;
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
cout<<matrix1[i][j]<<" ";
}
cout<<endl;
}
cout<<"the sum of two matrix is given below:\n";
int sum[i][j];
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
sum[i][j]=(matrix[i][j])+(matrix1[i][j]);

cout<<sum[i][j]<<" ";
}
cout<<endl;
}
}

  //multiplication of user input nxn matrix multi dimensional array
  #include<iostream>
#include<string>
using namespace std;
int main()
{
int i,j,n;
cout<<"Enter order of matrix"<<endl;
cin>>n;
int matrix[n][n];
cout<<"enter matrix row by row"<<endl;
for( i=0;i<n;i++)
for( j=0;j<n;j++)
cin>>matrix[i][j];
cout<<"the nXn of matrix is here below:"<<endl;
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
cout<<matrix[i][j]<<" ";
}
cout<<endl;
}
int matrix1[n][n];
cout<<"enter matrix1 row by row"<<endl;
for( i=0;i<n;i++)
for( j=0;j<n;j++)
cin>>matrix1[i][j];
cout<<"the nXn of matrix1 is here below:"<<endl;
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
cout<<matrix1[i][j]<<" ";
}
cout<<endl;
}
cout<<"the multiplication of the two matrix is given below:\n";
int multi[i][j];

for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
int sum=0,k;
for( k=0;k<n;k++)
sum+=matrix[i][k]*matrix1[k][j];

multi[i][j]=sum;

cout<<multi[i][j]<<" ";
}
cout<<endl;
}
}
#include<iostream>
#include<string>
using namespace std;
int main()
{
int i,j,n;
cout<<"Enter order of matrix"<<endl;
cin>>n;
int matrix[n][n];
cout<<"enter matrix row by row"<<endl;
for( i=0;i<n;i++)
for( j=0;j<n;j++)
cin>>matrix[i][j];
cout<<"the entered  matrix was here given below:"<<endl;
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
cout<<matrix[i][j]<<" ";
}
cout<<endl;
}
cout<<"the transpose of matrix is here below:"<<endl;
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
cout<<matrix[j][i]<<" ";
}
cout<<endl;
}
}


#include<iostream>
using namespace std;
int main()
{
	int no,b,rev=0,cpy;
	cout<<"Enter any number\n";
	cin>>no;
	cpy=no;
	while(no!=0)

	{
		b=no%10;
		rev=rev*10+b;
		no=no/10;
	}
	if(rev==cpy)
	cout<<"Palindrome";
	else
	cout<<"not Palindrome";
}


#include<iostream>
using namespace std;
int main()
{
	int no,b;

	cout<<"Enter any number\n";
	cin>>no;
	cout<<"Reverse is given below\n";
	while(no!=0)
	{
		b=no%10;
		no=no/10;
				cout<<b;

	}
}
/*
#include<iostream>
using namespace std;
int main()
{
	int no,b,last;
	cout<<"Enter any number\n";
	cin>>no;
	last=no%10;
	while(no!=0)
	{
		b=no%10;
		no=no/10;
	}
	cout<<"First digit="<<b<<" and last digit="<<last;
return 0;
}




//chech given string is palindrone or not

#include<iostream>
#include<cstring>
using namespace std;
int main()
{
    char T[100],L[100];
    cout<<"enter the string you want to check"<<endl;
     cin>>T;
    strcpy(L,T);
    strrev(T);
    if(strcmp(T,L)==0)
        cout<<"the entered string "<<'"' <<L<< '"'<<" was a palindrome";
    else
    cout<<"the entered string "<<'"' <<L<< '"'<<" was not a palindrome";
    return 0;
}
*/
