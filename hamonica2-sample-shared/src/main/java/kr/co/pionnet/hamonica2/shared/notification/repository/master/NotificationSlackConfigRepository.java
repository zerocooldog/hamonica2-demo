package kr.co.pionnet.hamonica2.shared.notification.repository.master;

import kr.co.pionnet.hamonica2.shared.notification.repository.master.entity.NotificationSlackConfigEntity;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.HamonicaRepository;

public interface NotificationSlackConfigRepository extends HamonicaRepository<NotificationSlackConfigEntity, String> {
}