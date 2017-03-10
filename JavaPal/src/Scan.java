import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Scan
{
    public static void main(String[] args)
    {
        try{
            Scanner input = new Scanner(System.in);

            Map<Integer, Date> map = new HashMap<>();
            List<String> al = new ArrayList<String>();

            while(true)
            {
                System.out.println("Please enter your student number: (place a * before it)");
                String str = input.next();
                if(str.equals("-1")) return;
                if(str.contains("21"))
                {
                    str = str.substring(1, 10);
                    BufferedWriter bw = new BufferedWriter(new FileWriter("ouuuuut23.txt", true));

                    Date date_time = new Date();
                    int id = Integer.parseInt(str);
                    if(!map.containsKey(id)){
                        map.put(id, date_time);
                    }
                    String diffStr = getDuration(date_time, map.get(id));
                    al.add(str);

                    String DATE_TIME  = date_time.toString();

                    int occurrences = Collections.frequency(al, str);
                    str = str + "\t TIME: " + DATE_TIME;
                    if(occurrences % 2 == 0)
                    {

//                        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();
//                        while (iter.hasNext()) {
//                            Map.Entry<String,Date> entry = iter.next();
//                            if("Sample".equalsIgnoreCase(entry.getValue())){
//                                iter.remove();
//                            }
//                        }
                        map.remove(id);
                        System.out.println("\nLOG OUT: " + str + "\tDURATION: " + diffStr);
                        bw.write("LOG OUT: " + str + "\tDURATION: " + diffStr);
                        bw.newLine();
                        bw.flush();
                        bw.close();

                    }
                    else
                    {
                        //map.remove(str);
                        System.out.println("\nYou have successfully logged in!");
                        System.out.println("\nLOG IN:  " + str);
                        bw.write("LOG IN:  " + str);
                        bw.newLine();
                        bw.flush();
                        bw.close();

                    }
                    //System.out.println(map);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        };
    }

    public static String getDuration(Date e, Date s)
    {
        long duration  = e.getTime() - s.getTime();
        long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
        return diffInHours + " : " + diffInMinutes + " : " + diffInSeconds;
    }
}