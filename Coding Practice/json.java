import java.io.*;
import java.util.*;

public class JSONparsing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String text = br.readLine();
         int Q = Integer.parseInt(br.readLine().trim());
         String[] queries = new String[Q];
         for(int i_queries = 0; i_queries < Q; i_queries++)
         {
        	 queries[i_queries] = br.readLine();
         }
         String[] out_ = solve(text, Q, queries);
         for (int i_out_ = 0; i_out_ < out_.length; i_out_++)
         {
        	 System.out.println(out_[i_out_]);
         }
         wr.close();
         br.close();
    }
    static String[] solve(String text, int Q, String[] queries){
        String[] result = {""};
        


        return result;
    }
}