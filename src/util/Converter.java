package util;

@FunctionalInterface
public interface Converter <T, N> {
    T convert (N value);
}
