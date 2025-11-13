package com.Day7.Day7;

public interface demo {
    abstract void show();

    int num(int nums);
}

class dmeo2 implements demo {
    @Override
    public void show() {
        System.out.println("heolo");
    }

    @Override
    public int num(int nums) {
        return nums;
    }

    public static void main(String[] args) {
        dmeo2 d = new dmeo2();
        d.show();

        System.out.println(d.num(6));
    }
}