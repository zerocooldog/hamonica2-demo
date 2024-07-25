package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotificationRecipientGroupId is a Querydsl query type for NotificationRecipientGroupId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QNotificationRecipientGroupId extends BeanPath<NotificationRecipientGroupId> {

    private static final long serialVersionUID = -1806417427L;

    public static final QNotificationRecipientGroupId notificationRecipientGroupId = new QNotificationRecipientGroupId("notificationRecipientGroupId");

    public final StringPath notificationId = createString("notificationId");

    public final NumberPath<Integer> recipientGroupNo = createNumber("recipientGroupNo", Integer.class);

    public QNotificationRecipientGroupId(String variable) {
        super(NotificationRecipientGroupId.class, forVariable(variable));
    }

    public QNotificationRecipientGroupId(Path<? extends NotificationRecipientGroupId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotificationRecipientGroupId(PathMetadata metadata) {
        super(NotificationRecipientGroupId.class, metadata);
    }

}

