package arc.util.io;

import arc.util.ArcAnnotate.*;

import java.io.*;

/** A wrapper for DataOutput with more concise method names and no IOExceptions. */
public class Writes{
    public @NonNull DataOutput output;

    public Writes(DataOutput output){
        this.output = output;
    }

    /** write long */
    public void l(long i){
        try{
            output.writeLong(i);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** write int */
    public void i(int i){
        try{
            output.writeInt(i);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** write byte */
    public void b(int i){
        try{
            output.writeByte(i);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** write bytes */
    public void b(byte[] array, int offset, int length){
        try{
            output.write(array, 0, length);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** write bytes */
    public void b(byte[] array){
        b(array, 0, array.length);
    }

    /** write boolean (writes a byte internally) */
    public void b(boolean b){
        b(b ? 1 : 0);
    }

    /** write short */
    public void s(int i){
        try{
            output.writeShort(i);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** write float */
    public void f(float f){
        try{
            output.writeFloat(f);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** write double */
    public void d(double d){
        try{
            output.writeDouble(d);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /** writes a string (UTF) */
    public void str(String str){
        try{
            output.writeUTF(str);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}