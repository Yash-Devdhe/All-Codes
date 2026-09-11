#include <stdio.h>
void main(){
    int n,sum =0;
    printf("Enter number of elemts you want to enter");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements:\n");
    for(int i=0; i<n; i++){
        scanf("%d",arr[i]);
    }
    int *ptr = arr;
    for(int i=0; i<n; i++){
        sum = sum + *(ptr);
        ptr+=1;

    }
    printf("Sum is:%d",&sum);


}