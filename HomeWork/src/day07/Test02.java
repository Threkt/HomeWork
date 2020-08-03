package day07;

import org.junit.Test;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    @Test
    public void Copy() {
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            bis = new BufferedInputStream(new FileInputStream("myfile.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("myfile_cp2.txt"));
            int length;
            byte[] bytes = new byte[1024];
            while ((length=bis.read())!=-1){
                bos.write(bytes,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
