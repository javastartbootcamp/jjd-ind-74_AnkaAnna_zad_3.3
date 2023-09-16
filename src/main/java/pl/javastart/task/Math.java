package pl.javastart.task;

class Math {
    boolean isEven(int number) {
        return number %2==0;
    }

    boolean isOdd(int number) {
        return number %2==1 ;
    }

    double circleField(double  r) {
        return 3.14 * r * r;
    }

    int power(int x) {
        return x*x;
    }
}
