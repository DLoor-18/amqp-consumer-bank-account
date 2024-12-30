package ec.com.sofka;

import ec.com.sofka.config.ITransactionTraceabilityRepository;
import ec.com.sofka.gateway.TransactionTraceabilityRepository;
import ec.com.sofka.mapper.TransactionTraceabilityEntityMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class TransactionTraceabilityAdapter implements TransactionTraceabilityRepository {
    private final ITransactionTraceabilityRepository repository;

    public TransactionTraceabilityAdapter(ITransactionTraceabilityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<TransactionTraceability> save(TransactionTraceability transactionTraceability) {
        return repository.save(TransactionTraceabilityEntityMapper.mapToEntity(transactionTraceability))
                .map(TransactionTraceabilityEntityMapper::mapToModel);
    }

}