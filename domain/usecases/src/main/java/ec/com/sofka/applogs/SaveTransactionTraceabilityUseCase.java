package ec.com.sofka.applogs;

import ec.com.sofka.TransactionTraceability;
import ec.com.sofka.gateway.TransactionTraceabilityRepository;
import ec.com.sofka.model.TransactionMessage;
import reactor.core.publisher.Mono;

public class SaveTransactionTraceabilityUseCase {
    private final TransactionTraceabilityRepository transactionTraceabilityRepository;

    public SaveTransactionTraceabilityUseCase(TransactionTraceabilityRepository transactionTraceabilityRepository) {
        this.transactionTraceabilityRepository = transactionTraceabilityRepository;
    }

    public void accept(TransactionMessage message){
            Mono<TransactionTraceability> transaction = transactionTraceabilityRepository.save(new TransactionTraceability(
                    message.getTransactionId(), message.getTransactionTypeId(), message.getTransactionDate()));

            transaction.subscribe(savedLog -> {
                System.out.println("TransactionId: " + message.getTransactionId());
                System.out.println("TransactionTypeId: " + message.getTransactionTypeId());
                System.out.println("Date: " + message.getTransactionDate());
            });
    }

}