package ec.com.sofka.config;

import ec.com.sofka.data.TransactionTraceabilityEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ITransactionTraceabilityRepository extends ReactiveMongoRepository<TransactionTraceabilityEntity, String> {

    Mono<TransactionTraceabilityEntity> save(TransactionTraceabilityEntity transactionTraceabilityEntity);

}
