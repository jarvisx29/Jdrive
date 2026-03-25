

//so there are two ways of implementing(creating) BINARY TREES :-

1. using recursion 
2. iterative(using queue or something) like proper function definition with addresses and all like in BST






// 1. CREATING BINARY TREES USING -----  RECURSION -------


#include <iostream>
#include <queue>

using namespace std; //              put comments and explain later !!!!!!

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};


node * create_binary(node *r,node *newnode)
{
    if(r == nullptr)
    {
        return newnode;
    }
    
    if(r->left == nullptr)
    {
        r->left = create_binary(r->left,newnode);
    }
    else if(r->right == nullptr)
    {
        r->right = create_binary(r->right,newnode);
    }
    
    else
    {
        r->left = create_binary(r->left,newnode);
    }
    
    return r;
}

void print_level_Order(node *r)
{
    if(r ==nullptr)
    {
        return;
    }
    
    queue<node *> q;
    q.push(r);
    
    while(!q.empty())
    {
        node *cur = q.front();
        q.pop();
        
        printf(" %d",cur->data);
        
        if(cur->left != nullptr)
        {
            q.push(cur->left);
        }
        if(cur->right != nullptr)
        {
            q.push(cur->right);
        }
        
    }
    
}


int main()
{
    node *root =  new node();
    root->data = 20;
    
    node * newnode_1 = new node();
    newnode_1->data = 30;
    
    node *newnode_2 = new node();
    newnode_2->data = 25;
    
    node *newnode_3 = new node();
    newnode_3->data = 35;
    
    node *newnode_4 = new node();
    newnode_4->data = 22;
    
    node *newnode_5 = new node();
    newnode_5->data = 15;
    
    node *newnode_6 = new node();
    newnode_6->data = 10;
    
    node *newnode_7 = new node();
    newnode_7->data = 16;
    
    node *newnode_8 = new node();
    newnode_8->data = 8;
    
    node *newnode_9 = new node();
    newnode_9->data = 17;
    
    
    root = create_binary(root,newnode_1);
    root = create_binary(root,newnode_2);
    root = create_binary(root,newnode_3);
    root = create_binary(root,newnode_4);
    root = create_binary(root,newnode_5);
    root = create_binary(root,newnode_6);
    root = create_binary(root,newnode_7);
    root = create_binary(root,newnode_8);
    root = create_binary(root,newnode_9);
    
    
    print_level_Order(root);
}