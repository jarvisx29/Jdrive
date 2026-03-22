#include <iostream>
#include <stack>
#include <vector>

using namespace std;

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};


void where_to_place(node *r,node *newnode)
{
    node *prev = nullptr;
    
    bool left_flag = false;
    bool right_flag = false;
    
    while(r != nullptr)
    {
        left_flag = false;
        right_flag = false;
        
        if(newnode->data <r->data)
        {
            prev = r;
            r= r->left;
            left_flag = true;
        }
        else
        {
            prev = r;
            r = r->right;
            right_flag = true;
        }
    }
    
    if(left_flag == true)
    {
        prev->left = newnode;
    }
    if(right_flag == true)
    {
        prev->right = newnode;
    }
}


void inOrder(node *root)
{
    vector<int> vec;
    stack<node *>st;
    
    node *cur = root;
    
    while(cur !=nullptr || st.empty() ==false)
    {
        while(cur !=nullptr)
        {
            st.push(cur);
            cur = cur->left;
        }
        
        cur = st.top();
        st.pop();
        
        vec.push_back(cur->data);
        cur = cur->right;
    }
    for(int i=0;i<vec.size();i++)
    {
        printf("%d \n",vec[i]);
    }
    
    
}

int main()
{
    node * root = new node();
    root->data = 50;
    
    node *newnode_1 = new node();
    newnode_1->data = 30;
    
    node *newnode_2 = new node();
    newnode_2->data = 20;
    
    node *newnode_3 = new node();
    newnode_3->data = 40;
    
    node *newnode_4 = new node();
    newnode_4->data = 70;
    
    node *newnode_5 = new node();
    newnode_5->data = 60;
    
    node *newnode_6 = new node();
    newnode_6->data= 80;
    
    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    where_to_place(root,newnode_6);
    
    inOrder(root);
    
}






