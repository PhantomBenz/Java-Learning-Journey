package Algorithms;

public class e_BuyAndSellStocks {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        profit(price);
    }
    public static void profit(int price[]){
        int earning=0, buyprice=price[0];
        for(int i = 1; i < price.length; i++){
            if(buyprice < price[i]){
                earning = Math.max(earning, price[i]-buyprice);
            }
            else{
                buyprice = price[i];
            }
        }
        System.out.println("Maximum Profit could be " + earning);
    }
}
