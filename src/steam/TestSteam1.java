package steam;

import java.io.*;

/**
 * Created by admin on 2017/2/27.
 */
public class TestSteam1 {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/lol.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (
                FileReader fr = new FileReader(f);
                FileWriter fw = new FileWriter(f);
                BufferedReader br = new BufferedReader(fr);
                PrintWriter pw = new PrintWriter(fw);
        )
        {
            while (true) {
                // 一次读一行
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
