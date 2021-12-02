package com.company;

public class Top {

        int t = 1;
        Middle mid;
        Middle.Bottom midbot;

        Top(){
            mid = new Middle();
            midbot =  mid.new Bottom();
        }

        int readBottom() {
            Middle middle = this.new Middle();
            Middle.Bottom bottom = middle.new Bottom();
            return bottom.b;

        }
        class Middle {
            int m = 2;
            int addTopAndBottom() {
                Middle.Bottom bottom = new Middle.Bottom();
                return  t + bottom.b;

            }


            class Bottom {
                int b = 3;
                int multiplyAllThree() {
                    return t * m * b;  }
            }
        }
        public static void main(String[] args){
            com.company.Top top = new com.company.Top();
            System.out.println(top.readBottom());
            System.out.println(top.mid.addTopAndBottom());
            System.out.println(top.midbot.multiplyAllThree());
        }
    }



