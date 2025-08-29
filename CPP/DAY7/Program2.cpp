#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
using namespace std;

class user{
    private: int userid;
            string name;
            string email;
            string password;
    public: user(){
                userid=0;
                name=" ";
                email="";
                password="";
             }
            user(int userid, string name, string email, string password):userid(userid), name(name), email(email), password(password){
                //we used member initializer list 
            }

            int getId(){
                return userid;
            }
            string getName(){
                return name;
            }
            string getPassword(){
                return password;
            }
            void setPassword(string pswd){
                this->password=pswd;
            }
            void displayUserDetails(){
                cout<<"=========User Details=========="<<endl;
                cout<<"User Id: "<<userid<<endl;
                cout<<"User name : "<<name<<endl;
                cout<<"User Email : "<<email<<endl;
                cout<<"************"<<endl;
            }
};

int main(){
    /*Create an application for storing user information in vector.
        (Hint:User class with data member userid,name,email,pwd)
        Create Menu Driven app
        1:add user
        2:display all users
        3:search user
        4:change pwd
        5:delete all
    */
    vector<user> v;
    int boltukyakarnahyai,num;
    int id;
    string name, email, pass;
     user u1;
    
    do{
        cout<<"Enter your choice"<<endl;
        cin>>boltukyakarnahyai;
        switch(boltukyakarnahyai){

            case 1://add
            cout<<" Addition of user : "<<endl;
            cout<<"Enter user details: "<<endl;
            cin>>id;
            cin>>name;
            cin>>email;
            cin>>pass;
             u1= user(id, name, email, pass);
            v.push_back(u1);
            cout<<"user added"<<endl;
            break;


            case 2://show all
            cout<<" Display element : "<<endl;
            for(user value: v){
                value.displayUserDetails();
            }
            break;


            case 3://search
            cout<<" serach user by id : "<<endl;
            cout<<"Enter userid to search"<<endl;
            cin>>num;
            for(user value: v){
                if( num == value.getId())
                cout<<"The number is present: "<<endl;
            }
            break;
            
            case 4://update password
            cout<<" update password : "<<endl;
            cout<<"enter user id to change password: "<<endl;
            cin>>num;
             for(user value: v){
                if( num == value.getId()){
                    
                    cout<<"enter the new password : "<<endl;
                    cin>>pass;
                    value.setPassword(pass);
                     cout<<"updated password"<<endl;
                     break;
                }else{
                    cout<<"user not found please enter valid details"<<endl;
                }
            }
           
            break;

            case 5://clear
            cout<<" clear of element : "<<endl;
            v.clear();
            cout<<"the vector is deleted"<<endl;
            break;

            default:
            cout<<"enter choice between 0-5";
            break;

        }
    }
    while(boltukyakarnahyai!=0);

    return 0;
}