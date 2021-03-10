package Martre;

import java.util.*;

public class testmartmanage {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        List<Goods> list = new ArrayList<Goods>();
        String testcase = scr.nextLine();
        int repeat = Integer.parseInt(testcase);

        for(int i=0; i<repeat; i++) {
            String infomation = scr.nextLine();
            String[] infomationclass = infomation.split(" ");
            char kind = infomationclass[0].charAt(0); 
            //E or F
            String kindname = infomationclass[1];
            //전자기기나 과일 이름
            String discountfruit;
            //할인과일
            int stock = Integer.parseInt(infomationclass[3]);
            if (kind=='E') {
                int modelnumber = Integer.parseInt(infomationclass[2]);
                list.add(new elec(kindname, modelnumber, stock));
            }else{
                discountfruit = infomationclass[2];
                list.add(new fruit(kindname,discountfruit, stock));
            }

        }
        Collections.sort(list);

        Iterator iter = list.iterator();
        while(iter.hasNext()) {
            Goods str = (Goods) iter.next();
            System.out.println(str);
        }
    }

}