#include <iostream>

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
}


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
            r = r->left;
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
    else if(right_flag == true)
    {
        prev->right = newnode;
    }
}

