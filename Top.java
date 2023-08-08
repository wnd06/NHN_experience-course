
public interface Top {
    default void accept(Visitor v) {
        v.visit( this );
      }
}
