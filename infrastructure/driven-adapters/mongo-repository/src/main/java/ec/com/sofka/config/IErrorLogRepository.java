package ec.com.sofka.config;

import ec.com.sofka.data.ErrorLogEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface IErrorLogRepository extends ReactiveMongoRepository<ErrorLogEntity, String> {

    Mono<ErrorLogEntity> save(ErrorLogEntity errorLogEntity);

}