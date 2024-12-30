package ec.com.sofka.applogs;

import ec.com.sofka.ErrorLog;
import ec.com.sofka.gateway.ErrorLogRepository;
import ec.com.sofka.model.ErrorMessage;
import reactor.core.publisher.Mono;

public class SaveLogErrorUseCase {
    private final ErrorLogRepository errorLogRepository;

    public SaveLogErrorUseCase(ErrorLogRepository errorLogRepository) {
        this.errorLogRepository = errorLogRepository;
    }

    public void accept(ErrorMessage message){
            Mono<ErrorLog> error = errorLogRepository.save(new ErrorLog(message.getError(), message.getProccess() ,message.getDate()));
            error.subscribe(savedLog -> {
                System.out.println("Error: " + message.getError());
                System.out.println("Date: " + message.getDate());
            });
    }

}