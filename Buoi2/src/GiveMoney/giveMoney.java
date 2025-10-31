package GiveMoney;
import Constans.ConStans;
import domain.User;
public class giveMoney {
    public void Chuyen(User to, User from, double amount){
        if(to.getBalane() > amount) {
            to.deposi(amount);
            from.withDraw(amount);
            System.out.println(ConStans.Succesful.Give_Money);
        }
        else {
            System.out.println(ConStans.Warring.isValid_Accout);
            System.out.println(ConStans.Warring.Out_False_Money);
        }

    }
    public static int[] Discuss(Integer [] amout, int m){
        int[] diomn = new int [amout.length];
        for(int i = 0; i < amout.length; i++){
            if(m < amout[i]) continue;
            else{
                diomn[i] = m / amout[i];
                m = m - diomn[i] * amout[i];
            }
        }
        return diomn;
    }
}
