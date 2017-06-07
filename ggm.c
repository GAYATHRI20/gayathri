#include <stdio.h>
 
int main() {
    char c;
    printf("enter the charcter");
    scanf("%c",&c);
    if(c>='a' && c<='z' || c>='A' && c<='Z')
    {
        printf(" it is alphapet");
    }
    else
    {
        printf("it is not alphapet");
    }
    return 0;
}
 