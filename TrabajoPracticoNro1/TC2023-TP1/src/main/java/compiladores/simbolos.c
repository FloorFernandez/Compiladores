#include <stdio.h>

int calcular (int, int);

int main(){
    int x = 5, y = 6 , z;
    int v[2];
    v[500] = x;
    z = calcular(x, y);
    return 0;

}

int calcular(int a, int b){
    for(int i = 0 ; i < b; i++){
        a += b;
    }
    return a;
}