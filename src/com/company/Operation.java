package com.company;

public enum Operation {
    SUM{
        public double action(int x, int y){
            return x + y;
        }
    },
    SUBTRACT {
        public double action(int x, int y){
            return x - y;
        }
    },
    MULTIPLY{
        public double action(int x, int y){
            return x * y;
        }
    },
    DIVISION{
        public double action(int x, int y){
            return (double)x / y;
        }
    };

    public abstract double action(int x, int y);
}
