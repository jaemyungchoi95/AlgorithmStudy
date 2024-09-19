class Solution {
    public int solution(int n, int k) {
        int subtotal = (12000*n)+(2000*k);
        int discount = n/10;
        int spend = subtotal;
    
    if(discount > 0) {
        spend = subtotal - 2000*discount;
    }

    return spend;
    }
}