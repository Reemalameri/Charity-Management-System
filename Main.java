
package CarityManagamenSystemt;

import BeneficiaryController;
import java.util.Scanner;

public class Main {

    
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BeneficiaryController controller = new BeneficiaryController();

        int choice;
        do {
            System.out.println("\n===== نظام إدارة المستفيدين =====");
            System.out.println("1. إضافة مستفيد جديد");
            System.out.println("2. تعديل بيانات مستفيد");
            System.out.println("3. حذف مستفيد");
            System.out.println("4. عرض جميع المستفيدين");
            System.out.println("5. البحث عن مستفيد");
            System.out.println("0. خروج");
            System.out.print("اختيارك: ");
            choice = input.nextInt();
            input.nextLine(); // لتفريغ السطر

            switch (choice) {
                case 1:
                    controller.addBeneficiary();
                    break;
                case 2:
                    controller.updateBeneficiary();
                    break;
                case 3:
                    controller.deleteBeneficiary();
                    break;
                case 4:
                    controller.displayAll();
                    break;
                case 5:
                    controller.searchBeneficiary();
                    break;
                case 0:
                    System.out.println("تم الخروج من النظام ?");
                    break;
                default:
                    System.out.println("اختيار غير صحيح ");
            }
        } while (choice != 0);
    }
}
