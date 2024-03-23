public class SavingsAccount extends Account {
    protected boolean active;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance >= 10000) {
            this.active = true;
        } else {
            this.active = false;
        }
    }

    @Override
    public void consign(float amount) {
        if (active) {
            super.consign(amount);
        }else{
            System.out.println("Su cuenta esta inactiva, no puede consignar dinero.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (active) {
            super.withdraw(amount);
        }else{
            System.out.println("Su cuenta esta inactiva, no puede retirar dinero.");
        }
    }

    @Override
    public void monthlyStatement() {
        if (numberWithdrawals > 4) {
            int additionalWithdrawal = numberWithdrawals - 4;
            monthlyCommission = additionalWithdrawal * 1000f;
            balance -= monthlyCommission;
            calculateInterest();
        } else {
            super.monthlyStatement();
        }
        if (balance >= 10000) {
            this.active = true;
        } else {
            this.active = false;
        }
    }
    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Comision mensual: $" + monthlyCommission);
        System.out.println("Transacciones realizadas: " + (numberConsignments+numberWithdrawals));
    }

}

