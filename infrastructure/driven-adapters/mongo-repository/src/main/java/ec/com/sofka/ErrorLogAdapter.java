package ec.com.sofka;

import ec.com.sofka.config.IErrorLogRepository;
import ec.com.sofka.gateway.ErrorLogRepository;
import ec.com.sofka.mapper.ErrorLogEntityMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class ErrorLogAdapter implements ErrorLogRepository {
    private final IErrorLogRepository repository;

    public ErrorLogAdapter(IErrorLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<ErrorLog> save(ErrorLog errorLog) {
        return repository.save(ErrorLogEntityMapper.mapToEntity(errorLog))
                .map(ErrorLogEntityMapper::mapToModel);
    }

}