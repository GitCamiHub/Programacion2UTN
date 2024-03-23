public class CheckingAccount extends Account {
    protected float overdraft = 0;

    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void withdraw(float amount) {
        balance -= amount;
        numberWithdrawals++;
        if (balance < 0) {
            overdraft = Math.abs(balance);
        }
    }

    @Override
    public void consign(float amount) {
        super.consign(amount);
        if (overdraft>0) {
            if(overdraft <= amount){
                overdraft = 0;
            }else{
                overdraft -= amount;
            }
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
        overdraft += (Math.abs(balance)-overdraft);
    }

    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Comision mensual: $" + monthlyCommission);
        System.out.println("Transacciones realizadas: " + (numberConsignments+numberWithdrawals));
        System.out.println("Sobregiro: $" + overdraft);
    }
}
