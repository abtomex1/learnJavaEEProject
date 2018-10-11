package dom.dima.autopark.api;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public interface Repository<T> {

    @NotNull
    Collection<T> findAll();

//    @Nullable
    T findById(String id);

    @NotNull
    Collection<T> findByIds(Collection<String> ids);

//    @Nullable
    T merge(T t);

//    @Nullable
    Collection<T> merge(Collection<T> ts);

//    void removeById(@Nullable String id);
    void removeById(String id);

//    void removeByIds(@Nullable Collection<String> ids);
    void removeByIds(Collection<String> ids);

//    void remove(@Nullable T t);
    void remove(T t);

//    void remove (@Nullable Collection<T> ts);
    void remove (Collection<T> ts);

}
