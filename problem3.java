// Reverse Integer

class Solution {
    public int reverse(int x){
    int reverse = 0;

    while (x != 0)
    {
        int temp = x % 10;
        int newreverse = reverse * 10 + temp;
        if ((newreverse - temp) / 10 != reverse)
        { return 0; }
        reverse = newreverse;
        x = x / 10;
    }
    return reverse;
}
}
