package eu.senla.task1;

public class Class1 {
    public static void main(String[] args) {
    Class2 class2 = new Class2();
    class2.setaByte((byte)69); // set byte
        System.out.println("Byte "+ class2.getaByte()); // output to user
    class2.setaShort((short)30564);//set short
        System.out.println("Short "+class2.getaShort());
    class2.setAnInt((int)2356564);
        System.out.println("Int "+ class2.getAnInt());
    class2.setaLong((long) 999999999 );
        System.out.println("Long "+ class2.getaLong());
    class2.setaFloat((float) 3256.2);
        System.out.println("Float "+ class2.getaFloat());
    class2.setaDouble((double)9999999999.99); // kak v eldorado :D
        System.out.println("Double " + class2.getaDouble());
    class2.setaChar('X');
        System.out.println("Char " + class2.getaChar());
    class2.setaBoolean((boolean) true);
        System.out.println("Boolean " +class2.isaBoolean());
    class2.setStringObert("Stroka");
        System.out.println("String " +class2.getStringObert());

    class2.setAnInt((int) class2.getaFloat());
        System.out.println("intfloat " + class2.getAnInt());
    class2.setaFloat((float) class2.getaDouble());
        System.out.println("floatdouble " + class2.getaDouble());
    class2.setaByte((byte) class2.getAnInt());
        System.out.println("Int To Byte " +class2.getAnInt());


        int b =345 ;
        byte c = 125;

        byte d = (byte) b;
        System.out.println("cast int to byte "+ d);

        String z ="Hello";
        Character y = 'd';
        byte a1 = (byte) class2.getaDouble();
        System.out.println("a1 "+ a1);
        double a2 = (double) class2.getAnInt();
        System.out.println("a2 "+ a2);
        int a3 = class2.getaShort();
        System.out.println("a3 " +a3);
        short a4 = (short) class2.getAnInt();
        System.out.println("a4 "+ a4);



    }


}
