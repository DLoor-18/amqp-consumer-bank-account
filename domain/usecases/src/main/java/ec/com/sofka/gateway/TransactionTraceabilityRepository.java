package ec.com.sofka.gateway;

import ec.com.sofka.TransactionTraceability;
import reactor.core.publisher.Mono;

public interface TransactionTraceabilityRepository {

    Mono<TransactionTraceability> save(TransactionTraceability transactionTraceability);

}