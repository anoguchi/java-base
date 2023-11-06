package NovidadesJava.patternMatchingForSwitch;

/*
 * Veio no Java 17
 * no 19, third preview
 * Confere se o tipo tambem se encaixa no padrao especificado.
 */

public class Pattern {

    static double transformaEmDouble(Object number) {
        return switch (number) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);

            default -> 0d;
        };
    }
}
