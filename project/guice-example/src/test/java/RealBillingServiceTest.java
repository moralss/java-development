import junit.framework.TestCase;

import static org.junit.Assert.*;


    public class RealBillingServiceTest extends TestCase {

        private final PizzaOrder order = new PizzaOrder(100);
        private final CreditCard creditCard = new CreditCard("1234", 11, 2010);

        private final InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
        private final FakeCreditCardProcessor processor = new FakeCreditCardProcessor(creditCard);

//        @Override public void setUp() {
//            TransactionLogFactory.setInstance(transactionLog);
//            CreditCardProcessorFactory.setInstance(processor);
//        }
//
//        @Override public void tearDown() {
//            TransactionLogFactory.setInstance(null);
//            CreditCardProcessorFactory.setInstance(null);
//        }

        public void testSuccessfulCharge() {
            RealBillingService billingService = new RealBillingService();
            Receipt receipt = billingService.chargeOrder(order, creditCard);

            assertTrue(receipt.hasSuccessfulCharge());
            assertEquals(100, receipt.getAmountOfCharge());
            assertEquals(creditCard, processor.getCardOfOnlyCharge());
            assertEquals(100, processor.getAmountOfOnlyCharge());
            assertTrue(transactionLog.wasSuccessLogged());
        }
    }
