package steam;

import java.io.*;

/**
 * Created by admin on 2017/2/27.
 */
public class TestSteam1 {
    public static void main(String[] args) {
        // ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/lol.txt");
        // �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
        try (
                FileReader fr = new FileReader(f);
                FileWriter fw = new FileWriter(f);
                BufferedReader br = new BufferedReader(fr);
                PrintWriter pw = new PrintWriter(fw);
        )
        {
            while (true) {
                // һ�ζ�һ��
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
                pw.println("123");
                pw.flush();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
