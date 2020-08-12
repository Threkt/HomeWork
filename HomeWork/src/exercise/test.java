package exercise;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        File fileA = new File("a.txt");
        Reader readerA = new FileReader(fileA);
        BufferedReader br = new BufferedReader(readerA);
        File fileB = new File("b.txt");
        Reader readerB = new FileReader(fileB);
        BufferedReader b = new BufferedReader(readerB);
        String str1 = br.readLine();
        int wordsA = 0;
        StringBuffer sb = new StringBuffer();
        while (str1 != null) {
            System.out.println(str1);
            str1 = br.readLine();
            wordsA++;
            if (str1 != null)
                sb.append(str1);
            sb.append(" ");
        }
        String str2 = b.readLine();
        int wordsB = 0;
        StringBuffer bufB = new StringBuffer();
        while (str2 != null) {
            String[] st = str2.split(" ");
            wordsB += st.length;
            for (String i : st) {
                bufB.append(i);
                bufB.append(" ");
            }
            System.out.println(str2);
            str2 = b.readLine();
        }
        String strA = sb.toString();
        String strB = bufB.toString();
        String[] A = strA.split(" ");
        String[] B = strB.split(" ");
        int total = wordsA + wordsB;
        String[] result = new String[total - 1];
        if (wordsA < wordsB)
        {
            int j = 0;
            for (int i = 0; i < wordsB; i++) {
                result[j] = B[i];
                j++;
                if (i < A.length) {
                    result[j] = A[i];
                    j++;
                }
            }
        }
        String content = "";
        for (String x : result) {
            content += x + " ";
        }
        System.out.println("content:" + content);
        File fileC = new File("c.txt");
        Writer w = new FileWriter(fileC);
        w.write(content);
        w.close();
    }
}