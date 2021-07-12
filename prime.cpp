#include <iostream>

using namespace std;

int main()
{int n;
bool isprime = true;
    cout << "enter the number" << endl;
    cin>>n;
    for( int i = 2;i<n;i++)
    {
      if(n%i==0)
      {
         isprime = false;
         break;
      }
    }
    if(isprime)


        cout<<n<<" is prime "<<endl;
        else
           b cout<<n<<" is not prime "<<endl;

    return 0;
}
