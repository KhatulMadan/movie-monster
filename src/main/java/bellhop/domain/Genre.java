package bellhop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by RAM0N on 8/16/16.
 */

@Entity
public class Genre {

    @Id
    @GeneratedValue
    private Long mId;

    private String mName;

    public Genre(String name) {
        mName = name;
    }

    public Genre() {
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getId() {
        return mId;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "Id=" + mId +
                ", Name='" + mName + '\'' +
                '}';
    }
}
