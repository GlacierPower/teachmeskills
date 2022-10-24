import java.util.Optional;

public class OptionalClasses {
    public static void main(String[] args) {
        Optional<Integer> opInt  = Optional.of(12);
        if (opInt.isPresent()){
            System.out.println(opInt.get());
        }else {
            System.out.println("No value");
        }
    }
}
