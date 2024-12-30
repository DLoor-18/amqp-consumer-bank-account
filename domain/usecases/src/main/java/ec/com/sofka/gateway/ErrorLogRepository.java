package ec.com.sofka.gateway;

import ec.com.sofka.ErrorLog;
import reactor.core.publisher.Mono;

public interface ErrorLogRepository {

    Mono<ErrorLog> save(ErrorLog errorLog);

}