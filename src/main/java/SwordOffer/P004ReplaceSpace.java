package SwordOffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/3
 */
public class P004ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We   Are Happy");
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str){
        String content  = str.toString();
        String regex = " ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        return matcher.replaceAll("%20");
    }

    public static String replaceSpace2(StringBuffer str){

        return str.toString().replaceAll(" ","%20");
    }


}
