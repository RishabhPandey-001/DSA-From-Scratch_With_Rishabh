import java.util.*;
public class checkforpower{

    public boolean isPower(int x, int y) {
        if(x == 1){
            return y==1;
        }
        while(y % x ==0){
            y = y/x;
        }
        return y ==1;
    }
}


// y = 8 % 2
// y = 4 % 2
// y = 2 % 2   that is 1 
// at y == 1 return true 

