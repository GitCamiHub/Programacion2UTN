
public class Main {
    public static void main(String[] args) {
        // Instancias
        SavingsAccount savingsAccount1 = new SavingsAccount(30000f,0.10f);
        CheckingAccount checkAccount1 = new CheckingAccount(200000f,0.10f);

        //Prueba de metodos cuenta de ahorro
        System.out.println("CUENTA DE AHORROS");
        savingsAccount1.withdraw(5000f);
        savingsAccount1.print();
        savingsAccount1.withdraw(5000f);
        savingsAccount1.withdraw(1000f);
        savingsAccount1.withdraw(1000f);
        savingsAccount1.withdraw(10000f);
        savingsAccount1.print();
        savingsAccount1.monthlyStatement();
        savingsAccount1.print();
        savingsAccount1.withdraw(5000f);
        savingsAccount1.consign(400f);
        savingsAccount1.print();
        System.out.println("--------------------------------------");

        //Prueba de metodos cuenta corriente

        /*System.out.println("CUENTA CORRIENTE");
        checkAccount1.consign(200f);
        checkAccount1.print();
        checkAccount1.withdraw(200500);
        checkAccount1.print();
        checkAccount1.monthlyStatement();
        checkAccount1.print();
        checkAccount1.consign(400);
        checkAccount1.print();*/

    }
}