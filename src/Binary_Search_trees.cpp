
// RECURSION BASICS ( we will use this a lot in bianry trees)

#include <iostream>
using namespace std ;

void rec(int num) // recursion is simple only dont be afraid : its basically a function that keeps on calling itself until a particular condition is satified ;
{
    if(num == 6)
    {
        return;
    }
    
    printf("%d \n",num);
    
    rec(num+1); // for ex : here this rec will keep on calling void rec again and again until it reaches num ==6 ; then it hits return and stops ; so thats recursion for you simple
}l
int main()

{
    rec(1);
}








// to create a Binary Tree manually 

#include <iostream>

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};
                                // refer to this for visualization : 2026-03-19-15-02-26.png

void where_to_place(node *r,node *newnode) // to create a Binary Tree manually 

// so this thing like lets think of it like in two parts : part 1 (it is for deciding the route to take(left or right) so thats what the first while loop (and its if and else will do) and Part 2 : is the one that actually assigns the values 
{
    node *prev = nullptr; // here prev is kinda of like the temp variable that holds root postion and this will be used later for assigning

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


    // return head ;             // now you might be wondering why binary tree isnt returning head or something back to main ; you know thats how its done in linkedlist since main needs head since it needs to know whether head was altered before sending info for next iteration   ; but that doesnt work that way in binary tree ; since here the head is root !!!!!!! ; which always stays same &constant no matter what ; so no need to return head ; everything can function out of a single function (and if do need to return somehting to main we use reference &st or whatever ( see down for info on reference))  
}


// XXXXXXXXXXXXXXXXXXXXXXX.  PREORDER DISPLAY USING RECURSION     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

void preorder_display(node *r)                // this is one way of displaying the information like in LinkeList
{
    if(r==nullptr)
    {
        return;
    }
    printf("%d \n",r->data);  // this thing works on this funda : "I will print myself, then ask my left child to do same, then right child." ; so at lowest possible node of each iteration ;the node itself ; then its left , then its right ; and keep going until it hits nullptr
    preorder_display(r->left);
    preorder_display(r->right);
    
}



int main()
{
    node *root =  new node();
    root->data = 20;
    
    node * newnode_1 = new node();
    newnode_1->data = 10;
    
    node *newnode_2 = new node();
    newnode_2->data = 25;
    
    node *newnode_3 = new node();
    newnode_3->data = 13;
    
    node *newnode_4 = new node();
    newnode_4->data = 21;
    
    node *newnode_5 = new node();
    newnode_5->data = 5;
    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    
    preorder_display(root);
    
}



















// CREATE BINARY TREE AND IMPLEMENT ITS ELEMENTS IN A STACK (using vector not actual stack !!!!!!!!!!!!)


#include <iostream>
#include <stack>
#include<vector>
using namespace std;

struct node
{
    int data;
    node *left = nullptr;
    node *right = nullptr;
};


void where_to_place(node *r,node *newnode) // this whole thing is normal like before program no changes to binary tree creation
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


 XXXXXXXXXXXXXXXXXXXXXXX.   PREORDER DISPLAY USING VECTOR XXXXXXXXXXXXXXXXXXXXX



void preorder_display(node *r,vector <int> &vec) // so the reason we are using vector here is beacuse ; we i want stack to exact same order as preorder or whatever traversal method we have chosen ; like if 123 in preorder then ehen stack printed then 123 also ; but since follows FILO ; so we need to reverse that order in order to push the reverse order into stack so that ; when printed the staright order will print ; so as temp arraylist we use vector ; since in cpp vector is arraylist
{
    
    if(r==nullptr)
    {
        return;
    }
    printf("%d \n",r->data);
    
    vec.push_back(r->data); // preorder elements along with preorder order will get appened to vector to be reversed and put staright way into stack
    
    preorder_display(r->left,vec);
    preorder_display(r->right,vec);
    
}
           !!!!!!!!!!!!!!!  IMP !!!     // &st is a reference that need to be there if you want your variable to be stored in main for future pursposes ; if you need to do somehting generic like print then no need to use &st or whatever it is you're using


void stack_push(vector <int> &vec, stack <int> &st) // you might be wondering why is there a stack in parameter we only need vector ; so that we will use this func like a normal standalone display func like in linkedlist ; BUTT !! we need to intialize the stack in main because we need to reference and send it to main ; so that it has a copy of it in main ; so that it will send that st copy to print fucntion to print it
{
    // stack<int> st ;
    for(int i=vec.size()-1;i>=0;i--)
    {
        st.push(vec[i]);
    }
  
}



void stack_print(stack<int> st) // notice how this doesnt have &st here because we dont need to send any info to main since only print only ; we just need copy of st from main
{
    stack <int> st_copy(st);
    
    printf("stack elements \n");
    
    while(!st_copy.empty())
    {
        printf("%d \n",st_copy.top());
        st_copy.pop();
    }
}



int main()
{
    node *root =  new node();
    root->data = 20;
    
    node * newnode_1 = new node();
    newnode_1->data = 10;
    
    node *newnode_2 = new node();
    newnode_2->data = 25;
    
    node *newnode_3 = new node();
    newnode_3->data = 13;
    
    node *newnode_4 = new node();
    newnode_4->data = 21;
    
    node *newnode_5 = new node();
    newnode_5->data = 5;
    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    
    
    stack<int> st;
    
    vector <int> vec;
    
    preorder_display(root,vec);
    
    stack_push(vec,st);
    
    stack_print(st);
}






// BINARY TREE IMPLEMENTATION IN A STACK ( PREORDER using node* inside stack and node *cur )


#include <iostream>
#include <stack>

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
        
        if(newnode->data < r->data)
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
    else if(right_flag ==true)
    {
        prev->right = newnode;
    }
    
}



XXXXXXXXXXXXXXXXXX.   PROPER PREORDER DISPLAY USING STACK (using stack <node *> st and node *cur) 



void preorder_inside_stack(node *r,stack <node *> &st) // 2026-03-20-15-24-59.png
{
    
    
    
    while(!st.empty())
    {
        node *cur = st.top();
        st.pop();
        
        printf("%d \n",cur->data);
        
        if(cur->right != nullptr)
        {
            st.push(cur->right);
        }
        if(cur->left != nullptr)
        {
            st.push(cur->left);
        }
    }
}


int main()
{
    node *root =  new node();
    root->data = 20;
    
    node * newnode_1 = new node();
    newnode_1->data = 10;
    
    node *newnode_2 = new node();
    newnode_2->data = 25;
    
    node *newnode_3 = new node();
    newnode_3->data = 13;
    
    node *newnode_4 = new node();
    newnode_4->data = 21;
    
    node *newnode_5 = new node();
    newnode_5->data = 5;
    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    
    stack<node *> st;
    st.push(root);
    
    preorder_inside_stack(root,st);
    
}













// POSTORDER DISPLAY USING 2 STACKS (stack <node *> st1,st2) // senthil sir gave wrong; review and paste correct pics here !!!!1





#include <iostream>
#include <stack>.     //         paste page pics immediately !!!!!!!!1!!!!     

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
        
        if(newnode->data < r->data)
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
    else if(right_flag ==true)
    {
        prev->right = newnode;
    }
    
}

void postorder_using_2stacks(node *r,stack<node *> &st1, stack <node *> &st2) // paste page pics immediately !!!!!!!1
    {
        node *cur = r;
        while(!st1.empty())
        {
            cur = st1.top();
            st2.push(cur);
            st1.pop();
            
            if(cur->left != nullptr)
            {
                st1.push(cur->left);
            }
            
            if(cur->right != nullptr)
            {
                st1.push(cur->right);
            }
            
        }
    }

void postorder_print(stack<node *>st2)
{
    while(!st2.empty())
    {
        printf("%d \n",st2.top()->data);
        st2.pop();
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
    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    where_to_place(root,newnode_6);
    where_to_place(root,newnode_7);
    where_to_place(root,newnode_8);
    where_to_place(root,newnode_9);
    
   stack<node *> st1;
   stack<node *>st2;
   
   st1.push(root);
   
   postorder_using_2stacks(root,st1,st2);
   
   postorder_print(st2);
   //
    
}
















// INORDER TRAVESAL     (using vector,stack (1vec,1stack))    // 2026-03-23-03-24-46.png


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
    node *prev =nullptr;
    
    bool left_flag = false;
    bool right_flag = false;
    
    while(r != nullptr)
    {
        left_flag = false;
        right_flag = false;
        
        if(newnode->data < r->data)
        {
            prev = r;
            r = r->left;
            left_flag = true;
        }
        else
        {
            prev =r;
            r = r->right;
            right_flag = true;
        }
    }
    
    if(left_flag ==true)
    {
        prev->left = newnode;
    }
    if(right_flag == true)
    {
        prev->right = newnode;
    }
    
}

void inOrder(node *r,vector <int> &vec)
{
    stack <node *> st;
    node *cur = r;
    
    while(cur !=nullptr || st.empty() == false)
    {
        while(cur != nullptr)
        {
            st.push(cur);
            cur = cur->left;
        }
        
        cur = st.top();
        st.pop();
        
        vec.push_back(cur->data);
        cur = cur->right;
    }
    
    
    
}

void print_vector(vector <int> &vec)
{
    for(int i=0;i<vec.size();i++)
    {
        printf(" %d",vec[i]);
    }
}



int main()
{
    node *root =  new node();
    root->data = 50;
    
    node * newnode_1 = new node();
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
    newnode_6->data = 80;
    

    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    where_to_place(root,newnode_6);
    
    vector <int> vec;
    
    inOrder(root,vec);
    
    print_vector(vec);
}











// LEVEL ORDER TRAVERSAL  (using 1 queue thats it ! ) //.    2026-03-23-03-25-36.png



#include <iostream>
#include <stack>
#include <vector>
#include<queue>

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
        
        if(newnode->data < r->data)
        {
            prev = r;
            r = r->left;
            left_flag = true;
        }
        else
        {
            prev =r;
            r = r->right;
            right_flag = true;
        }
    }
    
    if(left_flag ==true)
    {
        prev->left = newnode;
    }
    if(right_flag == true)
    {
        prev->right = newnode;
    }
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
    node *root =  new node();
    root->data = 50;
    
    node * newnode_1 = new node();
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
    newnode_6->data = 80;
    

    
    where_to_place(root,newnode_1);
    where_to_place(root,newnode_2);
    where_to_place(root,newnode_3);
    where_to_place(root,newnode_4);
    where_to_place(root,newnode_5);
    where_to_place(root,newnode_6);
    
    level_Order(root);
}















