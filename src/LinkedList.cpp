// Online C++ compiler to run C++ program online
#include <iostream>

    struct node 
    {
        int data;
        node * next;
        
    };
    
int main() 
{

        node * head = NULL;
        
        node *ptr;
        ptr = (node *)malloc(sizeof(node));
        (*ptr).data =100;
        (*ptr).next = NULL;
        
        node* temp ;
        temp = (node *)malloc(sizeof(node));
        temp->data = 200;
        temp->next = NULL;
        ptr->next = temp;
        
        node * temp2 ;
        temp2 = (node *)malloc(sizeof(node));
        temp2->data = 300;
        temp2->next=NULL;
        temp->next =temp2;
        
        // while(ptr != NULL)
        // {
        //     printf("%d \n",ptr->data);
        //     ptr  = ptr->next;
            
        // }
       
        // printf("XXXXXX");
        
        // XXXXXXXXXXXXXXXXXXXXXXXXX
        
        temp->next = ptr;
        ptr->next = temp2;
        temp2->next = NULL;
        
        // ptr->next = 300;
        // temp2->next = 100;
        
        // ptr->next = temp2->data;
        // temp2->next = ptr->data;
        
       
        
         
        
        while(temp != NULL)
        {
            printf("%d \n",temp->data);
            temp  = temp ->next;
        }
        
        
            // printf("%d \n",head->data);
            // printf("%d \n",previous->data);
            
            
        
}






XXXXXXXXXXXXXXXXXXXXXXXXX      LinkedList BASICS.     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


// to create a linkedlist(manual) and traverse it 



#include <iostream>

struct node
{
    int data;
    node *next;
};

int main() 
{
    node *head =NULL;
    
    node *node1 = (node *)malloc(sizeof(node));
    node1->data = 100;
    node1->next = NULL;
    head = node1;
    
    node *node2 = (node *)malloc(sizeof(node));
    node2->data = 200;
    node2->next = NULL;
    node1->next = node2;
    
    node *node3 = (node *)malloc(sizeof(node));
    node3->data = 300;
    node3->next = NULL;
    node2->next = node3;
    
    node *node4 = (node *)malloc(sizeof(node));
    node4->data = 400;
    node4->next = NULL;
    node3->next = node4;


    //to traverse a ll
    
    while(head != NULL)
    {
        printf("%d \n",head->data);
        head = head->next;
    }
    

    // you can use this to traverse too (instead of directly using head)
    node *current = head;
    
    while(current !=NULL)
    {
        printf("%d \n",current->data);
        current = current->next;
    }
    
}








 //TO INSERT AT START OF LinkedList

 #include <iostream>

struct node
{
    int data;
    node *next;
};

int main() 
{
    node *head =NULL;
    
    node *node1 = (node *)malloc(sizeof(node));
    node1->data = 100;
    node1->next = NULL;
    head = node1;
    
    node *node2 = (node *)malloc(sizeof(node));
    node2->data = 200;
    node2->next = NULL;
    node1->next = node2;


    
    node *atbeg = (node *)malloc(sizeof(node));
    atbeg->data = 1011;
                           // you might be might be wondering why the atbeg->next = head then we put head = atbeg ; its beacuse the atbeg points to the old head and then in the next line we update it with current head = atbeg 
    
    atbeg->next = head;  //new node points to old head
    head = atbeg;       //head shifts to new node
    
    // while(head != NULL)
    // {
    //     printf("%d \n",head->data);
    //     head = head->next;
    // }
    
    node *current = head;
    
    while(current !=NULL)
    {
        printf("%d \n",current->data);
        current = current->next;
    }
}


// TO INSERT AT END 

#include <iostream>

struct node
{
    int data;
    node *next;
};

int main() 
{
    
    node *head = NULL;
    
    node *previous;
    
    for(int i=0;i<5;i++)
    {
        node *temp;
        temp = (node *)malloc(sizeof(node));
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head == NULL)
        {
            head = temp; 
            previous = temp;
        }
        else
        {
            previous->next=temp;
            previous = temp;
        }
    }
    
    node *latest = (node *)malloc(sizeof(node));
    latest->data = 2005;
    latest->next = NULL;
    
    node *current_temp = head;
    
    node *previous_temp;
    
    while(current_temp != NULL)
    {
        previous_temp = current_temp;
        current_temp = current_temp->next;
    }
    
    previous_temp->next = latest;
    
    // printf("%d \n",previous_temp->data);
    
    // current->next = latest;
    
    
    while(head != NULL)
    {
        printf("%d \n",head->data);
        head = head->next;
    }
    
    
}


























    