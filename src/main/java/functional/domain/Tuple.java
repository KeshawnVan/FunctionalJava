package functional.domain;

/**
 * @author keshawn
 * @date 2018/2/12
 */
public class Tuple<T, U> {
    public final T t;
    public final U u;

    public Tuple(T t, U u) {
        this.t = t;
        this.u = u;
    }
}
