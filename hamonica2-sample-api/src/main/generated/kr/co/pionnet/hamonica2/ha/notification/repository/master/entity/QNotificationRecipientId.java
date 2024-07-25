package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationRecipientId is a Querydsl query type for NotificationRecipientId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QNotificationRecipientId extends BeanPath<NotificationRecipientId> {

    private static final long serialVersionUID = -440927416L;

    public static final QNotificationRecipientId notificationRecipientId = new QNotificationRecipientId("notificationRecipientId");

    public final StringPath notificationId = createString("notificationId");

    public final NumberPath<Integer> recipientNo = createNumber("recipientNo", Integer.class);

    public QNotificationRecipientId(String variable) {
        super(NotificationRecipientId.class, forVariable(variable));
    }

    public QNotificationRecipientId(Path<? extends NotificationRecipientId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationRecipientId(PathMetadata metadata) {
        super(NotificationRecipientId.class, metadata);
    }

}

