import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {

        // Primitive Data types

        // Boolean Data Type
        boolean booleanDt = true; // 1 bit range of value(true, false)

        // Character Type
        char chr ='C'; // 16 bits / 2 byte range of value(ASCII value 0 to 255)

        // Integer Data Type
        byte byteDt = 127; // 8 bits / 1 byte range of value(-128 to 127)
        short shortDt = 32767; // 16 bits / 2 byte range of value(-32,768 to 32,767)
        int intDt = 2147483647; // 32 bits / 4 byte range of value(-2,147,483,648 to 2,147,483,647)
        long longDt = 9223372036854775807L; // 64 bits / 8 byte range of value(-9,223,372,036,854,775,808 to -9,223,372,036,854,775,807)

        // Floating Points
        float floatDt = 9995.88787f; // 32 bits / 4 byte range of value()
        double doubleDt = 112.2323; // 64 bits / 8 byte range of value()

        // Primitives Data Types
        System.out.println("Primitive Data Types");

        // Boolean
        System.out.println("Boolean = "+booleanDt);

        // Character
        System.out.println("Character = "+chr);

        // Integer
        System.out.println("Byte = "+byteDt);
        System.out.println("Short = "+shortDt);
        System.out.println("Integer = "+intDt);
        System.out.println("Long Integer = "+longDt);

        // Float
        System.out.println("Float = "+floatDt);
        System.out.println("Double = "+doubleDt);


        // Non-Primitive Data Types
        System.out.println("Non-Primitive Data Types");

        // Class Data Type
        class ClassDt{
            final int staticVariable = 20;
        }
        // Object Data Type
        ClassDt classDt = new ClassDt();
        System.out.println("Object = "+classDt.staticVariable);

        // String Data Type
        String string = "Hello World!";
        System.out.println("String = "+string);

        // String class methods or string slicing
        String subString = string.substring(0,6);
        System.out.println("string slicing = "+subString);

        // Array Data Type
        int[] array = {1,2,3,4,5};
        System.out.println("Array = "+ Arrays.toString(array));

        // Interface Data Type
        interface Calculate {
            void add();
            void sub();
        }
        class Calculator implements Calculate{
            final int num1=30;
            final int num2=20;
            public void add(){
                System.out.println("Interface Add Method = "+(num1+num2));

            }
            public void sub(){
                System.out.println("Interface Subtract Method = "+(num1-num2));
            }
        }
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.sub();
    }

}
