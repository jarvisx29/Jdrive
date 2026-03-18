// Online C++ compiler to run C++ program online
#include <iostream>

struct node //.          normal manual LinkedList creation and then oops version of that
{
    int data;
    node *next;
};

int main()
{
    node * head = NULL;
    
    node * temp = (node *)malloc(sizeof(node));
    temp->data=100;
    temp->next = NULL;
    head= temp;
    
    node * temp2 = (node *)malloc(sizeof(node));
    temp2->data = 200;
    temp2->next=NULL;
    temp->next = temp2;
    
    
    node *trav = head;
    while(trav != NULL)
    {
        printf("%d \n",trav->data);
        trav = trav->next;
    }
}



upper ones oop version 

#include <iostream>

struct node
{
    int data;
    node *next;
};

node *createList()
{
    node *head = NULL;

    node *temp1 = (node *)malloc(sizeof(node));
    temp1->data = 100;
    temp1->next = NULL;
    head = temp1;

    node *temp2 = (node *)malloc(sizeof(node));
    temp2->data = 200;
    temp2->next = NULL;

    temp1->next = temp2;

    return head;   // you might be thinking why is there a return here ; the thing is whenever a struct method is created ; you need to return something or it will give error ; also the reason being ; you need to also at each iteration send the head to the main so that it will know whether the head is altered and it will send the next element to be connected to properly ; also just head is enough since all the elementsa re connected to it so you will get the whole thing 
}
}

void display(node *head)
{
    node *trav = head;

    while(trav != NULL)
    {
        printf("%d \n", trav->data);
        trav = trav->next;
    }
}

int main()
{
    node *head = createList();

    display(head);
}






XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX. you can do like this too but the above one is the industry standard like thats easier and how most things are done ; liek implementation in functiond and keeping the main clean

#include <iostream>

struct node
{
    int data;
    node *next;
};

node *createNode(int value) // always need to return something whilst creating linkedlist something 
{
    node *temp = (node *)malloc(sizeof(node));
    temp->data = value;
    temp->next = NULL;
    
    return temp;    // you might be thinking why is there a return here ; the thing is whenever a struct method is created ; you need to return something or it will give error ; also the reason being ; you need to also at each iteration send the head to the main so that it will know whether the head is altered and it will send the next element to be connected to properly ; also just head is enough since all the elementsa re connected to it so you will get the whole thing 
}.              // if not head then its equivalent elment to be returned

void display(node *head)
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
    node *head = NULL;
    
    node *temp1 = createNode(100);
    head = temp1;
    
    node *temp2 = createNode(200);
    temp1->next = temp2;
    
    display(head);
}




XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX 


#include <iostream> //.         creating a linkedList through for loop 

struct node
{
    int data;
    node *next;
};

int main()
{
    node *head = NULL;
    
    node *previous;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if (head == NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next =temp;
            previous = temp;
        }
    }
    
    node *trav = head;
    
    while(trav != NULL)
    {
        printf("%d \n",trav->data);
        trav = trav->next;
    }
}




THE OOPS VERSION OF ABOVE CODE  // same as above one only 


#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};

node *createList()
{
    node *head= NULL;
    node *previous;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        temp->data = 200+i;
        temp->next = NULL;
        
        if (head == NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
    }
    return head;
}


void display(node *head)
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
    display(head);
    
    
}


 XXXXXXXXXXXXXXXXXXXXXXXXXXXX. IMP STUFF FROM HERE   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

// INSERTION AT START LINEKDLIST

#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};

int main()
{
    node *head = NULL;
    
    node *previous;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head == NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
        
    }
    
        node *atbeg = (node *)malloc(sizeof(node));
        atbeg->data = 2005;
        atbeg->next = head;
        head = atbeg;
        
        
        node *trav = head;
        
        while(trav != NULL)
        {
            printf("%d \n",trav->data);
            trav = trav->next;
        }
}


XXXXXXXXXXXXXXXXXXXX oop version of above CODE

#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};

node *createList()
{
    node *head = NULL;
    node *previous;
    
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head == NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
        
    }
    return head;
}

node *atbeg(int value,node *head)
{
    node *atbeg = (node *)malloc(sizeof(node));
    
    atbeg->data = value;
    atbeg->next = head;
    head= atbeg;
    
    return head;
}

void display(node *head)
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
    
    // atbeg(2005,head); // you might think this is might work ;NOO!!! cause REMEMBER !!!!! whenever dealing with anything that is changing or modifying head you need to initialise it like head  = whatever func the implementation its doing ; thats how its done
    head = atbeg(2005,head);
    
    
    display(head);
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



XXXXXXXX oops version of above one



#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};

node *createList()
{
    node *head = NULL;
    node*previous;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head ==NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
    }
    return head;
}

node *atEnd(int value,node *head)
{
    node *atEnd = (node *)malloc(sizeof(node));
    atEnd->data = value;
    atEnd->next = NULL;
    
    node *current = head;
    node *previous_last = (node *)malloc(sizeof(node));
    
    while(current != NULL) //        
    {
        previous_last = current;  // we use this to get the last element and its index(kinda) so that we can insert at end ; we do previous_last. = current beacuse previous here is a temp variable ; you might be thiking why not current directly ; no cause by the end of while loop it will already stiing at NULL so we a need a temp variable to catch it before it goes to NULL
        current = current->next;
    }
    previous_last->next = atEnd;
    
    return head;
    
    
}

void display(node *head)
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
    head = atEnd(2005,head);   //.   as usuall whenever modification head = whatever implementation function 
    display(head);
    
}










// DELETE at start(head)

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

                       // IMPORTANT !!!!!! THIS IS HOW YOU TRAVESE !!!!!!!!(you should be using head = head->next and that is why two consecutive while loops werent moving ; you need to always use a temporary variable to traverse REMEMBER !!!!!!!!)
    node *trav = head;       
    while(trav != NULL)
    {
        
        printf("%d \n",trav->data);
        trav = trav->next;
    }
    
    

    // printf("%d \n",head->data);
    
    node *new_temp;
    
    // new_temp = head->next; // this is alright but sir told just do it in one line easy 
    // head = new_temp;
    
    new_temp = head;
    head = head->next;
    
    
    free(new_temp);
    // printf("%d \n",new_temp->data);
    
    node *previous_temp; 
    

  
    
    printf("XXXXXXXX \n");
    
    while(head != NULL)
    {
        printf("%d \n",head->data);
        head = head->next;
    }
    
    
}




XXXXXXXXXXXX oops version of the above one 

#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};

node *createList()
{
    node *head = NULL;
    node*previous;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head ==NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
    }
    return head;
}

node *delEnd(node *head) // will remove 200 from start and will start from 200
{
    node *delEnd = (node *)malloc(sizeof(node));
    
    delEnd->next=head;
    head = head->next;
    free(delEnd);
    
    return head;
}

void display(node *head)
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
    
    head = delEnd(head);
    display(head);
}














// DELETE AT START AND INSERT NEW ELEMENT

#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};

node *createList()
{
    node *head = NULL;
    node*previous;
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head ==NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
    }
    return head;
}

node *delEnd(int value,node *head)
{
    node *delEnd = (node *)malloc(sizeof(node));
    delEnd->data = value;
    
    
    delEnd->next=head->next;;
    free(head);
    head= delEnd;
    
    return head;
}

void display(node *head)
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
    
    head = delEnd(20,head);
    display(head);
}







// DELETE AT MIDDLE 

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
    int count =0;
    
    for(int i=0;i<4;i++)
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
        count++;
    }
    printf("before removal \n");
    
    node *trav = head;
    while(trav != NULL)
    {
        
        printf("%d \n",trav->data);
        trav = trav->next;
    }
    
    // node *previous_temp; 
    
    // node * current = head;
    
    // while(current->next != NULL)
    // {
    //     previous_temp = current;
    //     // printf("%d \n",previous_temp->data);
    //     current = current->next;
    // }
    
    // // printf("%d \n",previous_temp->data);
    
    // previous_temp->next = NULL;
    

  
    
    printf("XXXXXXXX \n");
    
    printf("count : %d \n",count);
      node *previous_temp;
    node * current = head;
    node * next_temp;
    
    for(int i=0;i<(count/2)-1;i++)
    {
        previous_temp = current;
         current = current->next;
    }
    printf("previous :%d \n",previous_temp->data);
    printf("current :%d \n",current->data);
    
    previous_temp->next = current->next;
    
    free(current);
    
    printf("after removal \n");
    
    while(head != NULL)
    {
        printf("%d \n",head->data);
        head = head->next;
    }
    
    
}




XXXXXXXXXXX oops version of above one 



#include<iostream>

struct node
{
    int data;
    node *next = NULL;
};
int count =0;

node *createList()
{
    node *head = NULL;
    node*previous;
    
    
    for(int i=0;i<6;i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        
        temp->data = 200+i;
        temp->next = NULL;
        
        if(head ==NULL)
        {
            head = temp;
            previous = temp;
        }
        else
        {
            previous->next = temp;
            previous = temp;
        }
        count++;
    }
    return head;
}

node *delmid(node *head)
{
    node *trav = head;
    node *current_mid = (node *)malloc(sizeof(node));
    for(int i=0;i<(count/2)-1;i++) // -1 since we need to stop at middle-1 element ' ie one before the middle element to do the delete
    {
        current_mid = trav;
        trav = trav->next;
    }
    current_mid->next = trav->next;
    
    free(trav);
    
    return head;
}

void display(node *head)
{
    node *travv = head;
    while(travv != NULL)
    {
        printf("%d \n",travv->data);
        travv = travv->next;
    }
}

int main()
{
    node *head = createList();
    
    head = delmid(head);
    
    display(head);
    
}


















