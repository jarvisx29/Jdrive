

//so there are two ways of implementing(creating) BINARY TREES :-

1. using recursion 
2. iterative(using queue or something) like proper function definition with addresses and all like in BST






// 1. CREATING BINARY TREES USING -----  RECURSION -------


#include <iostream> //.     20 30 25 35 22 15 10 16 8 17
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

















XXXXXXXXXXXXXXXXXXXXXXXXXXX THIS IS WHERE THE ACTUAL STUFF BEGINS !!!! (dont see above its just BS)     XXXXXXXXXXXXXXXXXXXX










// CREATING BINARY TREE MANUALLY in main()           2026-03-27-04-24-50.png


#include <iostream>
#include<queue>

using namespace std;

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};


void print_level_Order(node *r) // just printing ; no creating as dedicated function 
{
    if(r == nullptr)
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
    node *root = (node *)malloc(sizeof(node));
    root->data = 1;
    root->left = nullptr;
    root->right = nullptr;
    
    root->left = (node *)malloc(sizeof(node));
    root->left->data = 2;
    root->left->left = nullptr;
    root->left->right = nullptr;
    
    root->right = (node *)malloc(sizeof(node));
    root->right->data = 3;
    root->right->left = nullptr;
    root->right->right = nullptr;
    
    print_level_Order(root);
}









// BINARY TREE USING FUNCTION BUT [NOO BALANCING !!!!!!!]



#include <iostream> //          PASTE IMAGE WHEN YOU GET HOME !!!1
#include<queue>

using namespace std;

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};

void insert_binary(node * root, node *newnode)
{
    newnode->left = nullptr;
    newnode->right = nullptr;
    
    if(root->left == nullptr)
    {
        root->left = newnode;
    }
    else if(root->right == nullptr)
    {
        root->right = newnode;
    }
}

void print_level_Order(node *r)
{
    if(r == nullptr)
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
    node *root = (node *)malloc(sizeof(node));
    root->data = 1;
    
    node *newnode_1 = (node *)malloc(sizeof(node));
    newnode_1->data = 2;
    
    node *newnode_2 = (node *)malloc(sizeof(node));
    newnode_2->data = 3;
    
    
    insert_binary(root,newnode_1);
    insert_binary(root,newnode_2);
    
    print_level_Order(root);
}

//dd 


