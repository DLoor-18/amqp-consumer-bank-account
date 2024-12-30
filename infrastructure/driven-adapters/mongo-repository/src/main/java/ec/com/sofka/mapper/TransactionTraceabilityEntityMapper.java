package ec.com.sofka.mapper;

import ec.com.sofka.TransactionTraceability;
import ec.com.sofka.data.TransactionTraceabilityEntity;

public class TransactionTraceabilityEntityMapper {

    public static TransactionTraceabilityEntity mapToEntity(TransactionTraceability transactionTraceability) {
        return new TransactionTraceabilityEntity(
                transactionTraceability.getTransactionId(),
                transactionTraceability.getTransactionTypeId(),
                transactionTraceability.getTransactionDate()
        );
    }

    public static TransactionTraceability mapToModel(TransactionTraceabilityEntity transactionTraceabilityEntity) {
        return new TransactionTraceability(
                transactionTraceabilityEntity.getTransactionId(),
                transactionTraceabilityEntity.getTransactionTypeId(),
                transactionTraceabilityEntity.getTransactionDate()
        );
    }

}