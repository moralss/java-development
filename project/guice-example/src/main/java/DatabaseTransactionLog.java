public class DatabaseTransactionLog implements TransactionLog {
    @Override
    public void logChargeResult(ChargeResult result) {
        System.out.println(result);
    }

    @Override
    public void logConnectException(Exception e) {
        System.out.println(e);
    }
}
