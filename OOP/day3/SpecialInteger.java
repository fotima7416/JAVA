package OOP.day3;


class Main {

    public static void main(String[] args) {
        SpecialInteger sp = new SpecialInteger();
        sp.setValue(50);
        System.out.println(sp);

        sp.add(100);
        System.out.println(sp);
    }
}

public class SpecialInteger {
    static final int MIN = 1;
    static final int MAX = 1000;
    int value;

    public SpecialInteger() {
        this.value = 0;
    }

    public SpecialInteger(int value) {
        checkValue(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        checkValue(value);
        this.value = value;
    }

    public void add(int n) {
        checkValue(this.value + n);
        this.value += n;
    }

    public void subtract(int n) {
        checkValue(this.value - n);
        this.value -= n;
    }

    public static SpecialInteger valueOf(int value) {
        return new SpecialInteger(value);
    }

    public void checkValue(int value) {
        if (value < MIN || value > MAX) {
            throw new IllegalArgumentException("Voy kalla nito qiymatkubu. 1 dan 1000 gacha qiymatlar mumkin kuuu.");
        }
    }

    @Override
    public String toString() {
        return "" + value;
    }
}

