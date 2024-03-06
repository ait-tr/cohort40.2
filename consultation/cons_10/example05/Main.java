package cons_10.example05;

import java.util.Objects;

public class Main {
    static class S {
        int a;
        int b;

        public S(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public boolean equals(Object obj) {
            // проверка на ссылку
            if (obj == this) {
                return true;
            }

            // проверка на тип
            // typecheck
            if (obj instanceof S) {
                // type conversion
                S s = (S) obj;
                // проверка на значения
                return s.a == this.a
                        && s.b == this.b;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        S s1 = new S(1, 1);
        S s2 = new S(1, 1);
        S s3 = new S(1, 1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s2));

    }
}
