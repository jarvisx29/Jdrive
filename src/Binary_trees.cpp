

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










1. // CREATING BINARY TREE MANUALLY in main()           2026-03-27-04-24-50.png


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









2. // BINARY TREE USING FUNCTION BUT [NOO BALANCING !!!!!!!]



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


















XXXXXXXXXXXXXXXXXXXXXXXXXXXXX  CREATE BINARY TREE (THE PROPER WAY !!!!!!). XXXXXXXXXXXXXXXXXXXXXXXX



#include <stdio.h>
#include <stdlib.h>
#include <iostream>

using namespace std; //.        for explanation :  search "binary_tree PROPER using array front&rear" in problems folder in desktop 

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};a

node *createNode(int data) // this is the function although put before the insert func ; but is only called when the initiated by the insert function ; its job is to create a node and put its left and right as nullptr ; think of it like this ; it creates it like a lego block that is the new element that is about to be inserted into the binary tree ; and it created it and gives it to the insert func to be inserted !!
{
    node *newnode = (node *)malloc(sizeof(node));
    newnode->data = data;
    newnode->left = nullptr;
    newnode->right = nullptr;
    
    return newnode;
}

node *insert_binary(node *root,int data) // this function is where all the inserting of elements into the binary tree happens ; so like the main funda of this is like it will put the elememts in array and at each iteration the current pointer (front) will keep going ++ and the currents elements left and right will be checked ; also if null ; then will be inserted ; thats BINARY TREE BASICALLY !!!!
{
    if(root == nullptr)
    {
        return createNode(data);
    }
    
    node * array[100];
    int front =0; // this is like the current pointer ; which holds the current pointer and checks whether the current elements left or right is empty ; if so will insert where empty 
    int rear = 0; // this is the pointer responsible for adding the new elements to the array ; so that we can keep checking when front comes to it and its left and right nodes are checked !
    
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

void print_inOrder(node *root) // simple inorder traversal like in linkedlist but using recursion
{
    if(root != nullptr)
    {
        print_inOrder(root->left);
        printf("%d ",root->data);
        print_inOrder(root->right);
    }
}


int main()
{
    node *root = nullptr;
    
    int x;
    for(int i=0;i<7;i++)
    {
        printf("Enter element to inserted into binary tree :");
        scanf("%d",&x);
        
        root = insert_binary(root,x); // just like in linkedlist
    }
    
    print_inOrder(root);
    
    return 0;
}





//if you want this is sirs version (its exactly the same but using unneccesary struct everywhere )

#include <stdio.h>
#include <stdlib.h>
#include <iostream>

using namespace std;

struct node {
    int data;
    node* left = nullptr;
    node* right = nullptr;
};

// Create new node
struct node* createNode(int data) {
    node* newNode = (node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Insert node in Binary Tree (first empty place)
 node* insert(node* root, int data) {
    if (root == NULL)
        return createNode(data);

    node* array[100];
    int front = 0; 
    int rear = 0;

    array[rear++] = root;

    while (front < rear) {
        node* temp = array[front++];

        if (temp->left == NULL) {
            temp->left = createNode(data);
            return root;
        }
        else 
        {
            array[rear++] = temp->left;
        }

        if (temp->right == NULL) {
            temp->right = createNode(data);
            return root;
        }
        else {
            array[rear++] = temp->right;
        }
    }

    return root;
}

// Inorder traversal
void inorder(node* root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

int main() {
    node* root = NULL;
    int x;
    for (int i = 0; i < 7; i++)
    {
		cout << "Enter the data to be inserted in the binary tree: ";
        cin >> x;
        root = insert(root, x);
    }
 

    printf("Inorder Traversal: ");
    cout << "4 2 5 1 6 3 7" << endl;
    inorder(root);

   // printf("\nBalance of root = %d\n", getBalance(root));

    return 0;
}



//dd dd dd dd dd dd dd dd dd dd dd  

























