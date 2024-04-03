import java.util.Scanner;

// İnput-dan ayın adı daxil edilsin, adına görə neche gunden ibarət olduğu çap edilsin. Məs: "dekabr" -> 31
public class Main {
    public static void main(String[] args) {

//       Scanner scanner = new Scanner(System.in);
//        System.out.println("ilin ayinin adini daxil edin:");
//        String month = scanner.nextLine();
//
//        switch(month){
//            case "Yanvar","Mart","May","Iyul","Avqust","Oktyabr","Dekabr" -> System.out.println(31);
//            case "Aprel","Iyun","Sentyabr","Noyabr" -> System.out.println(30);
//            case "Fevral" -> System.out.println(29);
//        }

        // 1-dən n-dək ədədlər verilib.n-i inputdan alın. onu ədədlər içərisində switch-case ilə yoxlayın.
// 1-5 arasında olanları tapdıqda , çapa "1-5 arasındadır",
// 5-10 arasında olanları tapdıqda,çapa "5-10 arasındadır" yazsın. Default-da da ədəd 10-dan böyükdür çıxsın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int numbers = scanner.nextInt();

        switch(numbers){
            case 1,2,3,4 -> System.out.println("Daxil edilmish eded 1-5 arasındadır");
            case 5,6,7,8,9,10 -> System.out.println("Daxil edilmish eded 5-10 arasındadır");

            default -> System.out.println("Daxil edilmish eded 10-dan boyukdur");
            }

    }
}