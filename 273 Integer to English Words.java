public class Solution {
    public String numberToWords(int num) {
        if(num == 0) {
            return "Zero";
        }
        String[] big = {"", "Thousand ","Million ","Billion "};
        String result = "";
        int count = 0;
        while(num != 0) {
            int curt = num%1000;
            if(curt != 0) {
                result = toWord(curt) +big[count]+ result;
            }
            count++;
            num = num/1000;
        }
        result = result.trim();
        return result;
    }
    public String toWord(int num) {
        String[] one = {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
        String[] ones = { "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen " };
        String[] two = {"","Ten ","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};

        String result = "";
        if(num >= 100) {
            result = one[num/100] + "Hundred " + result;
        }
        num = num%100;
        if(num >= 20) {
            result = result + two[num/10] ;
            result =  result + one[num%10];
        } else if(num > 9) {
            result = result + ones[num-10] ;
        } else {
            result =  result + one[num%10];
        }
        return result;
    }
}
