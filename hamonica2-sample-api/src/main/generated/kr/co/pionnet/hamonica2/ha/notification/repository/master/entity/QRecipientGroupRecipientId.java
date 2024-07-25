package kr.co.pionnet.hamonica2.ha.notification.repository.master.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRecipientGroupRecipientId is a Querydsl query type for RecipientGroupRecipientId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRecipientGroupRecipientId extends BeanPath<RecipientGroupRecipientId> {

    private static final long serialVersionUID = -1557470803L;

    public static final QRecipientGroupRecipientId recipientGroupRecipientId = new QRecipientGroupRecipientId("recipientGroupRecipientId");

    public final NumberPath<Integer> recipientGroupNo = createNumber("recipientGroupNo", Integer.class);

    public final NumberPath<Integer> recipientNo = createNumber("recipientNo", Integer.class);

    public QRecipientGroupRecipientId(String variable) {
        super(RecipientGroupRecipientId.class, forVariable(variable));
    }

    public QRecipientGroupRecipientId(Path<? extends RecipientGroupRecipientId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecipientGroupRecipientId(PathMetadata metadata) {
        super(RecipientGroupRecipientId.class, metadata);
    }

}

