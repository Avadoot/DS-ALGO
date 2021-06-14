package java8features.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("en");
        checker(opt);

        Optional<String> anotherOpt = Optional.empty();
        checker(anotherOpt);

        Optional<String> nullOpt = Optional.of(null);
        checker(nullOpt);
    }

    public static void checker(Optional<String> opt) {
        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("Wahoo!!! Empty value.");
        }
    }


}
