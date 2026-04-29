struct node //   so total 3 parameters in doubly linkedList (previous,data,next)
{
    node *previous; // here in doubly we have a new , one more parameter ; where we instead of going in one direction(uni-directional ; we go bi-directional here for this ; for ex if we have no. 1-10 and wanted to print 9 ; conventionally in single linkedlist we have do next next till we reach 9 ; but doubly is more efficient ; in this as we do in doubly have tail ; just do tail->previous and boom ! you have 9 ; HENCE DOUBLY IS BEST AND WAY MORE EFFICIENT !!)
    int data;
    node *next;
};

int main() 
{
    node *temp = (node *)malloc(sizeof(node));
    temp->data = 100;
    temp->next = NULL;
    temp->previous = NULL;
    
    node *temp1 = (node *)malloc(sizeof(node));
    temp1->data = 200;
    temp1->next = NULL;
    temp1->previous = NULL;
    
    node *temp2 = (node *)malloc(sizeof(node));
    temp2->data = 300;
    temp2->next = NULL;
    temp2->previous = NULL;
    
    
    
    temp->next = temp1;         // THIS IS HOW WE DO IT IN DOUBLY !!! : after all the declarations (NULL) we link them at the end
    temp1->previous = temp;
    
    temp1->next = temp2;
    temp2->previous = temp1;
    
    node * head = temp;
    
    while(head != NULL)
    {
        printf("%d \n",head->data);
        head = head->next;
    }
    
    node * previous = temp2;          // this is how you traverse from back !!!!!!!!
     while(previous != NULL)
    {
        printf("%d \n",previous->data);
        previous = previous->previous;
    }
}








oops version of above code 


#include <iostream>

struct node
{
    int data;
    node *previous;
    node *next;
};

node * createList()
{
    node *temp = (node *)malloc(sizeof(node));
    temp->data = 100;
    temp->previous = NULL;
    temp->next = NULL;
    
    node *temp1 = (node *)malloc(sizeof(node));
    temp1->data = 200;
    temp1->previous = NULL;
    temp1->next = NULL;
    
    node *temp2 = (node *)malloc(sizeof(node));
    temp2->data = 300;
    temp2->previous = NULL;
    temp2->next = NULL;
    
    temp->next = temp1;
    temp1->previous = temp;
    
    temp1->next  = temp2;
    temp2->previous = temp1;
    
    return temp;
}


void trav_forward(node * head)
{
    node *trav = head;
    while(trav != NULL)
    {
        printf("%d \n",trav->data);
        trav = trav->next;
    }
    
}



int main()
{
    node *head = createList();
    trav_forward(head);
    
    
}













// TO CREATE DOUBLY LINKEDLIST USING FOR LOOP 


#include <iostream>

struct node 
{
    node *previous; 
    int data;
    node *next;
};

int main() 
{
    node *head = NULL;
    node *tail = NULL;
    
    for(int i=0;i<5;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        temp->previous = NULL;
        
        
        if(head == NULL)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail->next = temp;     // the logic works like this ; tail contains the last element ; and temp is the latest(new iteration) ; so first link the tail (contains the element before latest) as the previous of new iteration temp ; and then update tail as the new temp 
            temp->previous = tail;
            tail = temp;
            
        }
    }
    
    
    // to see if it worked or not 


    node * trav_forward = head;
    printf("forward : \n");
    
    while(trav_forward != NULL)
    {
        printf("%d \n",trav_forward->data);
        trav_forward = trav_forward->next;
    }

    node * trav_backward = tail;
    printf("backward : \n");

    while(trav_backward != NULL)
    {
        printf("%d \n",trav_backward->data);
        trav_backward = trav_backward->previous;
    }
}






oops version of above code 

#include <iostream>

struct node
{
    int data;
    node *previous;
    node *next;
};

node *createList(node **tail)
{
    node *head = NULL;
    *tail = NULL;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        temp->data = 200+i;
        temp->next = NULL;
        temp->previous = NULL;
        
        if(head == NULL)
        {
            head = temp;
            *tail = temp;
        }
        else
        {
            (*tail)->next = temp;
            temp->previous = *tail;
            *tail = temp;
        }
    }
    return head;
}

void trav_forward(node *head)
{
    node *trav1 = head;
    while(trav1 != NULL)
    {
        printf("%d \n",trav1->data);
        trav1 = trav1->next;
    }
    
}
void trav_backward(node *tail)
{
    node *trav = tail;
    while(trav != NULL)
    {
        printf("%d \n",trav->data);
        trav = trav->previous;
    }
}


int main()
{
    node *tail = NULL;
    
    node *head = createList(&tail);
    
    trav_backward(tail);
    printf("forward \n");
    trav_forward(head);
}


//dd dd dd dd dd dd dd dd dd dd dd


