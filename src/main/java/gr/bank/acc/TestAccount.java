package gr.bank.acc;

import gr.bank.acc.model.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account katerina = new Account("katerina",700.0,7);
        System.out.println("to antikeimeno pou ftiaksame perilamvanei:"+katerina);

        Account katerina1 = new Account();
        System.out.println("to antikeimeno pou ftiaksame perilamvanei:"+katerina1);

        katerina1.setBalance(500.00);
        katerina1.setOwner("KATERINA");
        katerina1.setNumberOfTransactions(9);
        System.out.println("enimerwsame ta stoixeia toy deyterou antikeimenou");
        System.out.println("to 2o antikeimeno exei ayti tn pliroforia " + katerina1);

        System.out.println("Kanw katathesi sto 1o logariasmo");
        katerina.deposit(300.0);

        System.out.println("to 1o stoixeio perilamvanei ta parakatw stoixeia"+katerina);

        System.out.println("Kanw analipsi sto 2o logariasmo");
        katerina1.withdraw(250.0);

        System.out.println("to 2o stoixeio perilamvanei ta parakatw stoixeia"+katerina1);


    }
}
