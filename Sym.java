public class Sym {
    public static void main(String[] args) {
            int[][] arr={{2,3,6},{3,4,5},{6,5,9}};     
            int i,j,flag=0;
            for(i=0;i<3;i++){
                for (j=0;j<3;j++){
                    if (arr[i][j]!=arr[j][i]){flag=1;}
                    }
                }
               
            if (flag==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
    }
}
