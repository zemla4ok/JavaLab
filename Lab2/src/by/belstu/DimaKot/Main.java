package by.belstu.DimaKot;

import by.belstu.DimaKot.by.belstu.itkotovich.basejava.JavaClass;
import by.belstu.DimaKot.by.belstu.itkotovich.basejava.WrapperString;
/** @author dimka
 *  @version 1.3.3.7*/
public class Main {

    public static void main(String[] args)
    /** @throws not
     @return nothing*/{
        /** @value TextFunc
         *  @see  hello
         *  @param arg String[] */
        TextFunc kek = new TextFunc();
        kek.onCreate();

        JavaClass ex3 = new JavaClass();
        ex3.exB();
        ex3.exD();
        ex3.exE();
        ex3.exF();
        ex3.exG();

        WrapperString kekus = new WrapperString("hello"){
            @Override
            public void replace(char oldchar, char newchar)
            {
                this.setStr(this.getStr().replace(oldchar, newchar));
                System.out.println(newchar);
            }
            public void delete(char newchar){
                System.out.println("newchar=" + newchar);
            }
        };
        kekus.replace('o','p');
        System.out.println(kekus.getStr());
    }
}
