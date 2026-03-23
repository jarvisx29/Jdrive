#include <iostream>
#include <queue>

using namespace std;

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};


void create_binary_rec(node *r,node *newnode)
{
    if(r == nullptr)
    {
        return
    }

    queue<int> q;
    node *cur = r;

    q.push(r);

    while(!q.empty())
    {
        node *cur = q.front();
        q.pop();

        if(cur->left != nullptr)
        {
            r->left = newnode;
        }

        if(cur->right != nullptr)
        {
            r->right = newnode;
        }
    }

}