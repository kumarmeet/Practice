class Book{
    String name;
    int id;
}
class MyArray{
    public static void main(String []args){
        int myarray[]=new int[5];
        int myarray1[]=new int[]{11,22,33,44,55};
        int myarray2[]={10,20,30,40};
        myarray[0]=10;
        myarray[1]=20;
        myarray[2]=30;
        myarray[3]=40;
        myarray[4]=50;
        int x=0;
        while(x<myarray.length){
            System.out.println(myarray[x]);
            x++;
        }
        Book english[]=new Book[3];
        english[1]=new Book();
        english[2]=new Book();
        /* english[0]=new Book();
        english[0].id=10;
            english[0].name="Java";
            english[1].id=15;
            english[1].name="C++";
            english[2].id=1;
            english[2].name="c";*/
        x=0;
       while(x<english.length){
            english[x]=new Book();
            english[x].id=10;
            english[x].name="Java";
            if(x==1){
                english[x].id=15;
                english[x].name="C++";
            }
            if(x==2){
                english[x].id=1;
                english[x].name="c";
            }
            x++;
        }
        x=0;
        while(x<english.length){
            System.out.print(english[x].name);
            System.out.println(english[x].id);
            x++;
        }
/********************************************************************************* */
        int $twoD[][]=new int[4][2]; 

    }
}