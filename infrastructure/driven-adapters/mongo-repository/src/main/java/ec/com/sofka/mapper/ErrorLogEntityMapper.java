package ec.com.sofka.mapper;

import ec.com.sofka.ErrorLog;
import ec.com.sofka.data.ErrorLogEntity;
import org.springframework.stereotype.Component;

@Component
public class ErrorLogEntityMapper {

    public static ErrorLogEntity mapToEntity(ErrorLog errorLog) {
        return new ErrorLogEntity(
                errorLog.getError(),
                errorLog.getProccess(),
                errorLog.getTimestamp()
        );
    }

    public static ErrorLog mapToModel(ErrorLogEntity errorLogEntity) {
        return new ErrorLog(
                errorLogEntity.getError(),
                errorLogEntity.getProccess(),
                errorLogEntity.getTimestamp()
        );
    }

}