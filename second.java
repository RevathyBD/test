import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            //WAP to read n names from user, seperate the vowels and consonents from each name and display them seperately
            System.out.println("Enter the number of names:");
            int n=s.nextInt();
            String v[]=new String[n];
            String c[]=new String[n];
            String name[] = new String[n];
            System.out.println("Enter the names:");
            for(int i=0;i<n;i++)
            {
                name[i] = s.next();
                v[i]="";
                c[i]="";
            }
            for(int i=0;i<n;i++)
            {
                String sn = name[i];
                for(int j=0;j<sn.length();j++)
                {
                    char cn=sn.charAt(j);
                    if(cn=='a'||cn=='e'||cn=='i'||cn=='o'||cn=='u'||cn=='A'||cn=='E'||cn=='I'||cn=='O'||cn=='U')
                    {
                        v[i] = v[i]+cn;
                    }
                    else
                    {
                        c[i] = c[i]+cn;
                    } 
                }
                System.out.println(v[i]+" "+c[i]);
            }
        }

        //WAP to read 10 ages from the user, return the eldest and youngest one 

        // int arr[] = new int[10];
        // System.out.println("Enter the ages:");
        // for(int i=0;i<10;i++)
        // {
        //     arr[i] = s.nextInt();
        // }
        // int max=0;
        // for (int i = 0; i < 10; i++) {
        //     if(arr[i]>max)
        //     {
        //         max=arr[i];
        //     }
        // }
        // System.out.println("The eldest age is: " +max);
        // int min=max;
        // for (int i = 0; i < 10; i++) {
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        // }
        // System.out.println("The youngest age is: " +min);

    } 
}
