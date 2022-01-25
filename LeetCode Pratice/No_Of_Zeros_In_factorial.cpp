#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-->0){
        int num,sum=0;
        cin>>num;
        while(num>=5){
            int temp=num/5;
            sum+=temp;
            num/=5;
        }
        cout<<sum<<endl;
    }
	return 0;
}
