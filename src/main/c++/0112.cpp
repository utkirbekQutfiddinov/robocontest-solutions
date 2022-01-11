#include <iostream>
#include <math.h>
using namespace std;
int main(){
	int n;
	cin>>n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin>>arr[i];
        }

        int q;
        cin>>q;
        int res[q]={0};
        int qi;
        for (int i = 0; i <q; i++) {
            cin>>qi;
            for (int j = 0; j < n; j++) {
                arr[j]+=qi;
                res[i]+=abs(arr[j]);
            }
        }
        for (int i = 0; i < q; i++) {
            cout<<res[i]<<endl;
        }
}
