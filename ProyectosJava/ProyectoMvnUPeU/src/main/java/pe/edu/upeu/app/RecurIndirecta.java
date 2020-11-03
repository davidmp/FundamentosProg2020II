package pe.edu.upeu.app;

import java.nio.ByteBuffer;

public class RecurIndirecta {

    static ByteBuffer bb = ByteBuffer.allocate(26); 
    
    static void A(int c){
        if(c>='A') {
            B(c);
            try {
                
                bb.putChar((char) c);
                bb.rewind(); 
                System.out.print(bb.getChar(0) + " Valor="+ (int)bb.getChar(0));     

            } catch (Exception e) {
                System.err.println("Error..."+e.getMessage());
            }
     }
    }

   static void B(int c){
        A(--c);
    }

    public static void main(String[] args) {
        A('Z');
        
    }
}
