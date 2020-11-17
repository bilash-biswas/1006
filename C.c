#include<stdio.h>
int main()
{
    double A,B,C,D,F,E,Z;
    A = 2;
    B = 3;
    C = 5;
    scanf("%lf",&D);
    scanf("%lf",&E);
    scanf("%lf",&F);
    Z = (A * D + B * E + C * F) / (A + B + C);
    printf("MEDIA = %.1lf\n", Z);
    return 0;
}
