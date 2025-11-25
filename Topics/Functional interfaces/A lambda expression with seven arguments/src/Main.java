class Seven {
    public static SeptenaryStringFunction fun = (s1, s2, s3, s4, s5, s6, s7) ->
            s1.trim().toUpperCase() + s2.trim().toUpperCase() + s3.trim().toUpperCase() + s4.trim().toUpperCase() + s5.trim().toUpperCase() + s6.trim().toUpperCase() + s7.trim().toUpperCase();
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}