package ec.com.sofka;

import com.fasterxml.jackson.databind.ObjectMapper;
import ec.com.sofka.applogs.SaveLogErrorUseCase;
import ec.com.sofka.gateway.ErrorLogBusMessageListener;
import ec.com.sofka.model.ErrorMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ErrorLogBusListener implements ErrorLogBusMessageListener {
    private final SaveLogErrorUseCase saveLogErrorUseCase;

    public ErrorLogBusListener(SaveLogErrorUseCase saveLogErrorUseCase) {
        this.saveLogErrorUseCase = saveLogErrorUseCase;
    }

    @Override
    @RabbitListener(queues = "${log.direct.queue}")
    public void receiveMsg(String message) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ErrorMessage errorMessage = objectMapper.readValue(message, ErrorMessage.class);
            saveLogErrorUseCase.accept(errorMessage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}