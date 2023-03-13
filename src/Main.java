import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(8);
        arraylist.add(9);
        arraylist.add(10);
        arraylist.add(11);
        arraylist.add(12);
        arraylist.add(13);
        arraylist.add(14);
        arraylist.add(15);
        arraylist.add(16);
        arraylist.add(17);
        arraylist.add(18);
        arraylist.add(19);
        arraylist.add(21);
        arraylist.add(22);
        arraylist.add(23);
        arraylist.add(24);
        arraylist.add(25);
        arraylist.add(26);
        arraylist.add(27);
        arraylist.add(28);
        arraylist.add(29);
        arraylist.add(30);
        arraylist.add(31);
        arraylist.add(32);
        arraylist.add(33);
        arraylist.add(34);
        arraylist.add(35);
        arraylist.add(36);
        arraylist.add(37);
        arraylist.add(38);
        arraylist.add(39);
        arraylist.add(40);
        arraylist.add(41);
        arraylist.add(42);
        arraylist.add(43);
        arraylist.add(44);
        arraylist.add(45);
        arraylist.add(46);
        arraylist.add(47);
        arraylist.add(48);
        arraylist.add(49);
        arraylist.add(50);
        arraylist.add(41);
        arraylist.add(42);
        arraylist.add(43);
        arraylist.add(44);
        arraylist.add(45);
        arraylist.add(46);
        arraylist.add(47);
        arraylist.add(48);
        arraylist.add(49);
        arraylist.add(50);
        arraylist.add(51);
        arraylist.add(52);
        arraylist.add(53);
        arraylist.add(54);
        arraylist.add(55);
        arraylist.add(56);
        arraylist.add(57);
        arraylist.add(58);
        arraylist.add(59);
        arraylist.add(60);
        arraylist.add(61);
        arraylist.add(62);
        arraylist.add(63);
        arraylist.add(64);
        arraylist.add(65);
        arraylist.add(66);
        arraylist.add(67);
        arraylist.add(68);
        arraylist.add(69);
        arraylist.add(70);
        arraylist.add(71);
        arraylist.add(72);
        arraylist.add(73);
        arraylist.add(74);
        arraylist.add(75);
        arraylist.add(76);
        arraylist.add(77);
        arraylist.add(78);
        arraylist.add(79);
        arraylist.add(80);
        arraylist.add(81);
        arraylist.add(82);
        arraylist.add(83);
        arraylist.add(84);
        arraylist.add(85);
        arraylist.add(86);
        arraylist.add(87);
        arraylist.add(88);
        arraylist.add(89);
        arraylist.add(90);
        arraylist.add(91);
        arraylist.add(92);
        arraylist.add(93);
        arraylist.add(94);
        arraylist.add(95);
        arraylist.add(96);
        arraylist.add(97);
        arraylist.add(98);
        arraylist.add(98);
        arraylist.add(100);
        System.out.println(arraylist);
        for (Integer a : arraylist) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        System.out.println("===========================");
        for (Integer b : arraylist) {
            if (b % 2 == 1) {
                System.out.println(b);
            }
        }
        System.out.println("=========================");
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arraylist.add(random.nextInt(1, 100));
            System.out.println(arraylist.get(i));
        }
        System.out.println("=========================");

        ArrayList<Integer> array = new ArrayList<>();
        Random random1=new Random();
        for (int i = 0; i < 50; i++) {
            array.add(random.nextInt(1, 100));
            if (i%2==0){
                System.out.println(i);
            }

        }
        System.out.println("========================");
        for (int i=0;i<50;i++){
            array.add(random.nextInt(1,100));
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}



