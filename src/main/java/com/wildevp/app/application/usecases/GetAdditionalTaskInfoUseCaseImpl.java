package com.wildevp.app.application.usecases;

import com.wildevp.app.domain.models.AdditionalTaskInfo;
import com.wildevp.app.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.wildevp.app.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {
    private  final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
