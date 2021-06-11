package io.javabrains;

public class TypeInferencesExample {

    public static void main(String[] args) {

        // Lambda implementation
        StringLengthLambda stringLengthLambda = (String str) -> str.length() + 10;
        System.out.println(stringLengthLambda.getLength("Hello world")); // 21

        StringLengthImpl stringLengthImpl = new StringLengthImpl();
        System.out.println(stringLengthImpl.getLength("Hello John")); // 10

        System.out.println(9>>1);
    }

    interface StringLengthLambda{
        int getLength(String s);
    }

    static class StringLengthImpl implements StringLengthLambda {

        @Override
        public int getLength(String s) {
            return s.length();
        }
    }
}
