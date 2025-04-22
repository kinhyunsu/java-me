package class1;

public class class1start2 {
    public static void main(String[] args) {
        String[] stnames = {"학생1", "학생2", "학생3","학생4"};
        int[] stages = {100, 90, 80, 70};
        int[] stgrades = {100, 80, 70, 60};

        for (int i = 0; i < stnames.length; i++){
            System.out.println(" 이름 " + stnames[i] + " 나이 : " + stages[i] + " 성적 : " + stgrades[i] );
        }
    }
}
