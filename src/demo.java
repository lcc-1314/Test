public class demo {
    public static void main(String[] args){
        //i变量用于控制行数
        for(int i = 0;i <= 9;i++) {
            //j用于控制每行中参与技术的数值
            for (int j = 1; j <= i; j++) {
                System.out.println(j + "*" + i + "=" + i * j + "\t");
            }
            //每行输出之后需要换行
            // System.out.println();
        }
    }
}
