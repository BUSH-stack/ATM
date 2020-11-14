public class ATM {
    private int atmMoney;
    private int clientMoney;

    public int withdraw (int money) {
        atmMoney = atmMoney - money;
        return atmMoney;
    }
    public int put (int money) {
        atmMoney = atmMoney + money;
        return atmMoney;
    }
}
