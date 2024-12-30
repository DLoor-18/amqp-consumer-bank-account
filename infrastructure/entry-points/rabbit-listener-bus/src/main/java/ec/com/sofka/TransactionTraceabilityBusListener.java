package ec.com.sofka;

import com.fasterxml.jackson.databind.ObjectMapper;
import ec.com.sofka.applogs.SaveTransactionTraceabilityUseCase;
import ec.com.sofka.gateway.TransactionTraceabilityBusMessageListener;
import ec.com.sofka.model.TransactionMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionTraceabilityBusListener implements TransactionTraceabilityBusMessageListener {
    private final SaveTransactionTraceabilityUseCase saveTransactionTraceabilityUseCase;

    public TransactionTraceabilityBusListener(SaveTransactionTraceabilityUseCase saveTransactionTraceabilityUseCase) {
        this.saveTransactionTraceabilityUseCase = saveTransactionTraceabilityUseCase;
    }

    @Override
    @RabbitListener(queues = "${traceability.direct.queue}")
    public void receiveMsg(String message) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            TransactionMessage transactionMessage = objectMapper.readValue(message, TransactionMessage.class);
            saveTransactionTraceabilityUseCase.accept(transactionMessage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}