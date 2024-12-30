package ec.com.sofka.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "transaction_traceability")
public class TransactionTraceabilityEntity {
    @Id
    private String id;

    @Field("transaction_id")
    String transactionId;

    @Field("transaction_type_id")
    String transactionTypeId;

    @Field("transaction_date")
    String transactionDate;

    public TransactionTraceabilityEntity(String transactionId, String transactionTypeId, String transactionDate) {
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
