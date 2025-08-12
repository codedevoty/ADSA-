
#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* left;
    struct node* right;
};

struct node* create_node(int value) {
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = value;
    new_node->left = new_node->right = NULL;
    return new_node; }

struct node* insert(struct node* root, int value) {
    if (root == NULL) {
        return create_node(value);
    }
    if (value < root->data) {
        root->left = insert(root->left, value);
    } else {
        root->right = insert(root->right, value);
    }
    return root;}

struct node * search(struct node * root , int key){
    if(root == NULL || root->data == key){
         return root ;
         }
    else if (key < root->data){
        return search(root->left,key);
    }
    else if(key > root->data){
        return search(root->right,key);
    }
    else{
        printf("data is not present in bst");
    }
                        
}

int main()
 {
    struct node* root = NULL;    
    int n ,value,key;
    printf("Enter no of elemets : ");
    scanf("%d",&n);
    printf("Enter elemets : \n");
    for(int i = 0 ; i < n ; i++){
    printf("insert element at index  %d :",i);
    scanf("%d",&value);
     root = insert(root, value);
    }
   

      printf("Enter key value : ");
      scanf("%d",&key);
      root = search(root,key);
      if(root != NULL){
        printf("data %d present in bst",root->data);
      }
      else{
        printf("data %d not present in bst");
      }
      }