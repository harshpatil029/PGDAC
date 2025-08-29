#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    /*Create an application for storing int values in vector.
    Create menu drivin app for following menu;
    1:add 2:show all 3:search 4:sort 5:reverse 6:clear
    */
    vector<int> v;
    int boltukyakarnahyai,num;
    
    do{
        cout<<"Enter your choice"<<endl;
        cin>>boltukyakarnahyai;
        switch(boltukyakarnahyai){
            case 1://add
            cout<<" Addition of element : "<<endl;
            cout<<"Enter num"<<endl;
            cin>>num;
            v.push_back(num);
            cout<<"number added"<<endl;
            break;
             case 2://show all
            cout<<" Display element : "<<endl;
            for(int value: v){
                cout<<" "<<value<<endl;
            }

            break;
            case 3://search
            cout<<" Addition of element : "<<endl;
            cout<<"Enter num to search"<<endl;
            cin>>num;
            for(int value: v){
                if(num==value)
                cout<<"The number is present: "<<value<<endl;
            }
            break;
            case 4://sort
            cout<<" sorting  element : "<<endl;
            sort(v.begin(), v.end());
            for(int value: v){
                cout<<" "<<value<<endl;
            }
            cout<<"sorted vector"<<endl;
            break;
            case 5://reverse
            cout<<" Reverse vector : "<<endl;
            reverse(v.begin(), v.end());
             for(int value: v){
                cout<<" "<<value<<endl;
            }
            cout<<"reversed vector"<<endl;
            break;
            case 6://clear
            cout<<" clear of element : "<<endl;
            v.clear();
            cout<<"the vector is deleted"<<endl;
            break;
            default:
            cout<<"enter choice between 0-6";
            break;

        }
    }
    while(boltukyakarnahyai!=0);

    return 0;
}