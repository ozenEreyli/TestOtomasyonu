public class DivisionCalculator {

    static class DivideByZeroException extends Exception {
        public DivideByZeroException(String message, int code) {
            super(message, code);
        }
    }

    static class NegativeResultException extends Exception {
        public NegativeResultException(String message, int code) {
            super(message, code);
        }
    }

    public static int divideNumbers(int numerator, int denominator) 
                        throws DivideByZeroException, NegativeResultException {
        if (denominator == 0) {
            throw new DivideByZeroException("Sıfıra bölünmez!", 100);
        }

        int result = numerator / denominator;

        if (result < 0) {
            throw new NegativeResultException("Sonuç olumsuz!", 101);
        }

        return result;
    }
}
