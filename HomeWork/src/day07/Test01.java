package day07;

import org.junit.Test;

import java.io.*;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    @Test
    public void Copy() {
        InputStream is=null;
        OutputStream os=null;
        try {
            is = new FileInputStream("myfile.txt");
            os = new FileOutputStream("myfile_cp.txt");
            int length;
            byte[] bytes = new byte[1024];
            while ((length=is.read())!=-1){
                os.write(bytes,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
