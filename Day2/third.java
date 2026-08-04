// count elements which are greter than 10
public class third {

    public static void main(String[] args) {

        int[] nums = {1,3,7,11,13,2,8};

        System.out.println("Elements Greater than 10 are:");

        int count=0;

        for (int i=0;i<nums.length;i++) {
            if(nums[i]>10){
                count++;
            }
           
            
            }
             System.out.print(count);
            
        }
    }
