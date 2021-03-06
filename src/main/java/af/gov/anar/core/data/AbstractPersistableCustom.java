
package af.gov.anar.core.data;

import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class AbstractPersistableCustom<PK extends Serializable> implements Persistable<String> {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private String id;

        @Override
        public boolean isNew() {

                return null == this.id;
        }

}
