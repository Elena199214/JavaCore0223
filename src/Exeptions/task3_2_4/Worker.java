package Exeptions.task3_2_4;

public class Worker implements BankWorker {

    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        return false;
    }
    boolean getCreditForClient = false;

//public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
//    try {
//        return bankWorker.checkClientForCredit(bankClient);
//    } catch (ProblemWithLawException ex) {
//        return false;
//    } catch (BadCreditHistoryException ex) {
//        System.out.println("Проблемы с банковской историей");
//        return false;
//    }
//}
}



