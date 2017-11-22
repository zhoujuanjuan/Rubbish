package zrubbish.com.zhoujuanjuan.zrubbish.zjava;

/**
 * Created by zhoujuanjuan on 17/11/22.
 */

public class ZStack {
    private char[] arr;
    private int index = -1;

    public void push(char a){
        arr[++index] = a;
    }

    public void pop(){

    }
}
