#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <queue>
#include <stack>

using namespace std;

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};

node *createNode(int data)
{
    node *newnode = (node *)malloc(sizeof(node));
    newnode->data = data;
    newnode->left = nullptr;
    newnode->right = nullptr;
    
    return newnode;
}

node *insert_binary(node *root,int data)
{
    if(root == nullptr)
    {
        return createNode(data);
    }
    
    node *array[100];
    int front = 0;
    int rear = 0;
    
    array[rear++] = root;
    
    while(front < rear)
    {
        node *temp = array[front++];
        
        if(temp->left == nullptr)
        {
            temp->left = createNode(data);
            return root;
        }
        else
        {
            array[rear++] = temp->left;
        }
        
        if(temp->right == nullptr)
        {
            temp->right = createNode(data);
            return root;
        }
        else
        {
            array[rear++] = temp->right;
        }
    }
    return root;
    
}

node *modify_binary(node *root)
{
    
    stack <node *> st;
    st.push(root);
    
    while(root != NULL)
    {
        root = st.top();
        st.pop();
        
        if(root != NULL && root->left != NULL && root->data < root->left->data)
        {
            int temp;
            
            st.push(root->left);
            temp = root->data;
            root->data = root->left->data;
            root->left->data = temp;
        }
        else if(root != NULL && root->right != NULL && root->data < root->right->data)
        {
            int temp1;
            
            st.push(root->right);
            temp1 = root->data;
            root->data = root->right->data;
            root->right->data = temp1;
            
        }
    }
    return root;
    
}

void level_Order(node *r)
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
    node *root = nullptr;
    
    int x;
    for(int i=0;i<4;i++)
    {
        printf("Enter element to be inserted : ");
        scanf("%d",&x);
        
        root = insert_binary(root,x);
    }
    level_Order(root);
    
    modify_binary(root);
    
    level_Order(root);
}
//dd 