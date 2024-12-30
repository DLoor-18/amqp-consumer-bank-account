package ec.com.sofka;

import java.util.Date;

public class TransactionTraceability {
    String transactionId;
    String transactionTypeId;
    String transactionDate;

    public TransactionTraceability() {
    }

    public TransactionTraceability(String transactionId, String transactionTypeId, String transactionDate) {
        this.transactionId = transactionId;
        this.transactionTypeId = transactionTypeId;
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(String transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

}