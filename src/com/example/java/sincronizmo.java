package com.example.java;

public class sincronizmo {

}

class BankAccount{
    private int balance = 0;
    private final int overdraft;

    public BankAccount(int overdraft){
        this.overdraft = overdraft;
    }

    void topUp(int amount){
        balance +=amount;
    }

    void debit(int amount){
        balance-=amount;
    }

    int getBalance(){
        return balance;
    }

    int getOverdraft(){
        return overdraft;
    }
}

class ATM{
    static synchronized void withdraw(BankAccount account, int amount){ // synchronized evita el sobre giro mayor al establecido en tareas de multiples hilos, para validarlo puedes quitar la palabra synchronized
        int balance = account.getBalance();

        if((balance - amount) <- account.getOverdraft()){
            System.out.println("transaccion rechazada");
        }else{
            account.debit(amount);
            System.out.println("$"+ amount + " exitosamente retirada");
        }
        System.out.println("Balance actual: "+ account.getBalance());
    }
}

class Users{
    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        account.topUp(100);

        Thread t1 = new Thread(()->{
            ATM.withdraw(account, 100);
        });

        Thread t2 = new Thread(()->{
            ATM.withdraw(account,100);
        });

        t1.start();
        t2.start();
    }
}
