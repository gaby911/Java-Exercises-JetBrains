class Account{
    long balance;
    String ownerName;
    boolean locked;

    Account(long balance, String ownerName, boolean locked){
        this.balance=balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}
