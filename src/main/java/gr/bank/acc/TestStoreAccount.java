package gr.bank.acc;

import gr.bank.acc.model.Account;
import gr.bank.acc.model.Category;
import gr.bank.acc.model.StoreAccount;

public class TestStoreAccount {
    public static void main(String[] args) {
        StoreAccount katerina = new StoreAccount("katerina",700.0,7,"KIFISIAS", Category.BASIC);
        System.out.println("to antikeimeno pou ftiaksame perilamvanei:"+katerina);

        StoreAccount katerina1 = new StoreAccount();
        System.out.println("to antikeimeno pou ftiaksame perilamvanei:"+katerina1);

        katerina1.setBalance(500.00);
        katerina1.setOwner("KATERINA");
        katerina1.setNumberOfTransactions(9);
        katerina1.setStoreName("Mesogeiwn");
        katerina.setAccountCategory(Category.EXTRA);
        System.out.println("enimerwsame ta stoixeia toy deyterou antikeimenou");
        System.out.println("to 2o antikeimeno exei ayti tn pliroforia " + katerina1);

        System.out.println("Kanw katathesi sto 1o logariasmo me xrisi tis AccountWithdraw");
        katerina.deposit(300.0);

        System.out.println("to prwto stoixeio perilambanei:"+katerina);

        System.out.println("Kanw katathesi sto 1o logariasmo me xrisi tis StoreAccountWithdraw");
        katerina.deposit(300.0,Category.BASIC,"KIFISIAS");

        System.out.println("to 1o stoixeio perilamvanei ta parakatw stoixeia"+katerina);

        System.out.println("Kanw analipsi sto 2o logariasmo me AccountWithdraw");
        katerina1.withdraw(250.0);

        System.out.println("to deytero stoixeio perilambanei"+katerina1);

        System.out.println("Kanw analipsi sto 2o logariasmo me StoreAccountWithdraw");
        katerina1.withdraw(250.0,Category.EXTRA, "Mesogeiwn");

        System.out.println("to 2o stoixeio perilamvanei ta parakatw stoixeia"+katerina1);


    }
}
