package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value" + bigData.data.value); // Data data; -> 초기값이 Null 그러므로 NullPointerExceoption 발생
    }
}
