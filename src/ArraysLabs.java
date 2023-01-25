public class ArraysLabs {
    public static void main(String[] args) {
        System.out.println("1.Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Print even numbers from -10 to 20");// tpel zuyg tvery
        System.out.println("\n2.Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n3. Print * symbols using given number");
        int n = 7;
        for (int i = 1; i <= n; i++) { //ays cikly apahovum e te qani tox petq e unenanq
            for (int j = 1; j <= i; j++) {//isk es cikly te amen toxi vra qani astxanish petq e lini
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n4. Print * symbols using given number int reverse mode");//hakarak kargov
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n5.Create an array with number 1-11"); //sarqel zangvac vori mej ka 1ic 11 tvery
        int[] array = new int[11];
        //array[0] = 1;
        //array[1] = 2;
        //array[2] = 3;
        for (int i = 0; i < array.length; i++) {//k-n gorcum e ayqan turuytum
            array[i] = i + 1;//es erku tox arjeq taln e
        }
        for (int i = 0; i < array.length; i++) {//ays  toxery arjeqnery arden tpelu toxern en
            System.out.print(array[i] + " ");

        }

        System.out.println("\n\n6.Create an array with even numbers from -10 to 10");//sarqel zangvac vortex ka -10ic 10 exac zuyg tvery
        //for (int i = -10; i <=10 ; i++) {
        //if (i % 2==0)
        //System.out.print(i+ " ");}
        int[] array2 = new int[11];
        //  array2[0]=-10;
        //  array2[1]=-8;
        //  array2[2]=-6;
        //  array2[verjiny]=10;
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {// apahovecinq ciklery(0ic minchev indexi erkarutyun)
            array2[i] = j;
        }
        for (int i : array2) {
            System.out.print(i + " ");

        }
        System.out.println("\n\n7. Given an array. print of odd elements");//vercnel zangvac u tpel kent elementnery ed zangvacum
        int[] array3 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        //stex tpec bolor  tvery, bayc mer xndiry tpeln er kent tvery
        for (int a : array3)
            if (a % 2 == 1)//nshanakum e. ete a-n bajanenq erkusi, mnac. havas. lini 1, uremn kent e, kam bajanacy havas. chlini 0. if(a%2!=0)
                System.out.print(a + " ");
        System.out.println("\n\n8. Given an array. print elements from -10 to 5");//tpel ayn elementnery voronq yngac en -10ic 5y yngac sahmanum
        for (int a : array3) {
            if (a >= -10 && a <= 5)//nshanakum e tpir a elementy ayn depqum ete mec kam havas. e -10 ev poqr ham havas. e 5))
                System.out.print(a + " ");
        }
        System.out.println("\n\n9. Given an array. print elements whitch can be divided 3 or 4");//tpen ayl elementnery voronq bajanvum em 3i kam 4i
        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0)//aysinqn a bajanac 3i depqum unena 0 arjeq, u a bajanac 4i depqum
                System.out.print(a + " ");
        }
        System.out.println("\n\n10. Given an array. print count of even elements");//tpel te QANI HAT ZUYG ELEMENT KA
        int countOfEvens = 0;
        for (int a : array3) {
            if (a % 2 == 0)
                countOfEvens++;//minchev stex cuyc kta zuygery
        }
        System.out.println("Count of even elements is" + countOfEvens);//isk ay stex arden ktpi voch te zuyg tvery, ayl te qani hat ka, es paragayum 6
        array3 = new int[]{4, 1, 9, -4, 3};

        System.out.println("\n\n11. Given an array. print sum of elements");//bolor andamnery gumarenq irar/gumary
        int sum = array3[0];//ka gumar gaxap. vory sum-n e, skzbnakan arjeqy tanq 4, aysinqn array3i arajin elementy
        for (int i = 1; i < array3.length; i++) {//grenq cikl minchev array3i erkarutyun, bayc qani vor sumi mej unenq sumi mej arajin elementy, sksenq 2rd elementic
            sum = sum + array3[i];//sum-in tur ira unecac arjeqi i-rd elementy
        }
        System.out.println(sum);

        System.out.println("\n\n12. Given an array. print sum of positive elements");//gumarenq drakan elementnery
        sum = 0;//sum-i arjeqy tanq 0,voch te array3-i ayl uxxaki 0, vorovhetev chgitenq aracin elementy drakane te bacasakan
        for (int i = 0; i < array3.length; i++) {//noric frranq array3i mejov
            if (array3[i] > 0) //ete mer arrayi i-rd elementy drakan e
                sum += array3[i];//uremn iran gumarenq sum-in

        }
        System.out.println(sum);

        System.out.println("\n\n13. Given an array. print multiplication of elements");//bazmapatkenq bolor tvery irar
        int m = 1;//vercrecinq 1 tivy, vorovhetev ete vercneiq noric 0, apa bolor bazmapat. kstanainq 0
        for (int i = 0; i < array3.length; i++) {
            m = m * array3[i];//arden vercrac mer tivy(1) bazmapatkenq array3i bolor arjeqnerov
        }
        System.out.println(m);
        System.out.println("\n14. find maximal element from array");//lucenq maximumi kam minimumi xndiry/ arrayi mejic  gtnenq mecaguyn kam poqrag. arjeqnery
        int max = array3[0];//or. mtqeris mej arajin element, ays paragayum vercrel enq array3i 0rd elementy
        for (int i = 1; i < array3.length; i++) {//arajinin arden petq che harcnel, vorovhetev menq arden vercrel en orinakum arajini arjeq, sksi hashvel 2rd elementic
            if (array3[i] > max)//u asenq ete inchvor mi tex aveli mec element gtni mer vercracic
                max = array3[i];//hetevabar poxvum e mer yntrac elementy

        }
        System.out.println(max);

        System.out.println("\n15. find minimal element from array");//gtni minimal elementy
        int min = array3[0];//or. mtqeris mej arajin element, ays paragayum vercrel enq array3i 0rd elementy
        for (int i = 1; i < array3.length; i++) {//arajinin arden petq che harcnel, vorovhetev menq arden vercrel en orinakum arajini arjeq, sksi hashvel 2rd elementic
            if (array3[i] < min)//u asenq ete inchvor mi tex aveli poqr element gtni mer vercracic
                min = array3[i];
        }
        System.out.println(min);//apa tpi

        System.out.println("\n15. find element which is alone");//gtnel ayn tivy vory chuni ir zuygy
        array = new int[]{4, 2, 1, 9, 2, 1, 4};
        int result = array[0];// noric vercnenq arajin elementy
        for (int i = 1; i < array.length; i++) {//sra mijocov franq bolor elementneri mej(erkarutyamb)
            result = result ^ array[i];//resultin veragrenq(=) ira arjeqy iqsor(^) arac arrayi i-rd elementi het

        }
        System.out.println(result);

        array = new int[]{4, 1, -9, 2, 1, 445, 0, -748, 12, 1,};

        int x = 41, y = 3;
        int z = x;//vorpeszi chkorcnenq x-i arjexy,petq e pahel, ays depqum pahenq z-ov
        x = y;//y-in tanq x-i arjeqy
        y = z;////x-in tanq y-i arjeqy, aystex z-e, vorovhetev x-i arjeqy pahecinq z-ov
        System.out.println("x=" + x + "y=" + y);

        System.out.println("\n16. sort array in acs.");//andradarnanq sortavorman  algoritmin, aysinqn nvazman kam achman kargov dasavorum, es depqum achman
        for (int a : array) {
            System.out.print(a + " ");//tpenq array-y uxxaki tesaneli linelu hamar
        }

        boolean qaniDerIfMtnume=true;

        while (qaniDerIfMtnume){//mek angam gtneluc  heto while-y noric ksksvi, vorovhetev arjeqy true e exel, kdadari while-y ashxatel, erb vor lini false
            qaniDerIfMtnume=false;//skzbic ira arj. talis enq false(ays. entadrum enq vor if-y chi mtnelu)
            for (int i = 0; i < array.length - 1; i++) {//grenq cikl vor petq e array-i sax elementneri vrayov ancni
                if (array[i] > array[i + 1]) {//ete bayc ete gone mi angam if gtni, ays.gtel inchvor ban vori texery kpoxvi
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniDerIfMtnume=true;//arjeqy avtomat kta true//nuyny klini nvazman kargov hetevyal kerp: if (array[i] > array[i + 1])
                }
            }
        }
        for (int i = 0; i < array.length - 1; i++) {//grenq cikl vor petq e array-i sax elementneri vrayov ancni
            if (array[i] > array[i + 1]) {//ete arrayi[i] elem. aveli mec e hajordic([i+1]), texerov pox
                int zz = array[i];
                array[i] = array[i + 1];
                array[i + 1] = zz;
            }
        }

        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");//arajin ciklic heto, stacvec vor mer elementneri amenamecy ekav amenaverjum, ete erkrord angam tpenq, apa kstananq erkrord mec tivy...

        }
    }
}

