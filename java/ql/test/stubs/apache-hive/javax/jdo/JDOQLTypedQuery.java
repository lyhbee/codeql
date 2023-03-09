// Generated automatically from javax.jdo.JDOQLTypedQuery for testing purposes

package javax.jdo;

import java.io.Closeable;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.jdo.FetchPlan;
import javax.jdo.JDOQLTypedSubquery;
import javax.jdo.PersistenceManager;
import javax.jdo.query.BooleanExpression;
import javax.jdo.query.CharacterExpression;
import javax.jdo.query.CollectionExpression;
import javax.jdo.query.DateExpression;
import javax.jdo.query.DateTimeExpression;
import javax.jdo.query.Expression;
import javax.jdo.query.ListExpression;
import javax.jdo.query.MapExpression;
import javax.jdo.query.NumericExpression;
import javax.jdo.query.OrderExpression;
import javax.jdo.query.PersistableExpression;
import javax.jdo.query.StringExpression;
import javax.jdo.query.TimeExpression;

public interface JDOQLTypedQuery<T> extends Closeable, Serializable
{
    <P> Expression<P> parameter(String p0, Class<P> p1);
    <R> R executeResultUnique(java.lang.Class<R> p0);
    <R> java.util.List<R> executeResultList(java.lang.Class<R> p0);
    <S> JDOQLTypedSubquery<S> subquery(java.lang.Class<S> p0, String p1);
    <V> javax.jdo.query.Expression<V> variable(String p0, java.lang.Class<V> p1);
    Boolean getSerializeRead();
    CharacterExpression characterParameter(String p0);
    CollectionExpression<? extends Object, ? extends Object> collectionParameter(String p0);
    DateExpression dateParameter(String p0);
    DateTimeExpression datetimeParameter(String p0);
    FetchPlan getFetchPlan();
    Integer getDatastoreReadTimeoutMillis();
    Integer getDatastoreWriteTimeoutMillis();
    JDOQLTypedQuery<T> datastoreReadTimeoutMillis(Integer p0);
    JDOQLTypedQuery<T> datastoreWriteTimeoutMillis(Integer p0);
    JDOQLTypedQuery<T> excludeSubclasses();
    JDOQLTypedQuery<T> extension(String p0, Object p1);
    JDOQLTypedQuery<T> extensions(Map p0);
    JDOQLTypedQuery<T> filter(BooleanExpression p0);
    JDOQLTypedQuery<T> groupBy(Expression<? extends Object>... p0);
    JDOQLTypedQuery<T> having(Expression<? extends Object> p0);
    JDOQLTypedQuery<T> ignoreCache(boolean p0);
    JDOQLTypedQuery<T> includeSubclasses();
    JDOQLTypedQuery<T> orderBy(OrderExpression<? extends Object>... p0);
    JDOQLTypedQuery<T> range(Expression<? extends Object> p0, Expression<? extends Object> p1);
    JDOQLTypedQuery<T> range(NumericExpression<? extends Object> p0, NumericExpression<? extends Object> p1);
    JDOQLTypedQuery<T> range(long p0, long p1);
    JDOQLTypedQuery<T> result(boolean p0, Expression<? extends Object>... p1);
    JDOQLTypedQuery<T> saveAsNamedQuery(String p0);
    JDOQLTypedQuery<T> serializeRead(Boolean p0);
    JDOQLTypedQuery<T> setCandidates(java.util.Collection<T> p0);
    JDOQLTypedQuery<T> setParameter(Expression<? extends Object> p0, Object p1);
    JDOQLTypedQuery<T> setParameter(String p0, Object p1);
    JDOQLTypedQuery<T> setParameters(Map<String, ? extends Object> p0);
    JDOQLTypedQuery<T> unmodifiable();
    JDOQLTypedSubquery<T> subquery(String p0);
    List<Object> executeResultList();
    ListExpression<? extends Object, ? extends Object> listParameter(String p0);
    MapExpression<? extends Object, ? extends Object, ? extends Object> mapParameter(String p0);
    NumericExpression<? extends Object> numericParameter(String p0);
    Object executeResultUnique();
    PersistenceManager getPersistenceManager();
    String toString();
    StringExpression stringParameter(String p0);
    T executeUnique();
    TimeExpression timeParameter(String p0);
    boolean getIgnoreCache();
    boolean isUnmodifiable();
    java.util.List<T> executeList();
    javax.jdo.query.PersistableExpression<T> candidate();
    long deletePersistentAll();
    static String QUERY_CLASS_PREFIX = null;
    void cancel(Thread p0);
    void cancelAll();
    void close(Object p0);
    void closeAll();
}