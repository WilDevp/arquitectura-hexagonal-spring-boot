package com.wildevp.app.domain.ports.out;

import com.wildevp.app.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
