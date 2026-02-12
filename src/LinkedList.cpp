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
    