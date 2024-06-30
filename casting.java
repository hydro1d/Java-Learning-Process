public class casting {
    public static void main(String [] args){
        int p =100;
        double fp = p + 18.0; //int dile overflow hoto(think about big and small container filling with water)

        System.out.println(fp);
        //but still u want to store with dataloss

        int fpp = p + (int)18.0;

        System.out.println(fpp);

        //off_topic constants value
        //using final keyword
        final float pi = 3.1416F;
       // pi = 33; //error ashbe

    }
}
