#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double A,B,C,N;
    cin>>A;
    cin>>B;
    cin>>C;
    N = (A * 2 + B * 3 + C * 5) / 10;
    cout<<"MEDIA = "<<fixed<<setprecision(1)<<N<<endl;
    return 0;
}
