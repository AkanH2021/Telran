import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/* ��������, �� ������ ���������� ���������. � ��� ���� �������: ����������� ����, ���������� ����, ���-�������.
� ������� ������� ���� Account{String iban, double balance}. ��������� ������� �������������, ��� �� �������
 ����� ����������� �������� � ����� ���������� �������� ����������� � �������. �� ����� ���������� ���
  �������� ����������� ������� �������. �� ����� ��.��� ����������� �������, �� ��� �������, ��� �������
   �� ����� �� ����� 10000. �� ����� ���-������� ����������� ������� ������� ���� �����. ��������������
    ���� �������������� ��-�������: ��.���� � ���.���� �������� ������� �������, ��� ������� �������� �������
    � �������. ��� ���������� ����������� ������� �������, ����������� ����� ���������� � ����� ��������������.
    �����������, ��������� ������ ����� ����������� ������������ ��������\����� �������. */

        Account acc1 = new Account("DE123456", 2000.00);
        Account acc2 = new Account("DE234567", 12000.00);
        Account acc3 = new Account("DE345678", 8000.00);
        Account acc4 = new Account("DE456789", 12500.00);
        Account acc5 = new Account("DE567890", 4500.00);
        Account acc6 = new Account("DE654321", 18000.00);
        Account acc7 = new Account("DE765432", 8500.00);
        Account acc8 = new Account("DE853657", 14500.00);
        Account acc9 = new Account("DE945673", 16900.00);

        Individuals ind1 = new Individuals(acc1);
        Individuals ind2 = new Individuals(acc2);
        Individuals ind3 = new Individuals(acc3);
        LegalEntities le1 = new LegalEntities(acc4);
        LegalEntities le2 = new LegalEntities(acc5);
        LegalEntities le3 = new LegalEntities(acc6);
        VIP vip1 = new VIP(acc7);
        VIP vip2 = new VIP(acc8);
        VIP vip3 = new VIP(acc9);

        List<Customer> individualsList = new ArrayList<>();
        individualsList.add(ind1);
        individualsList.add(ind2);
        individualsList.add(ind3);
        List<Customer> legalEntitiesList = new ArrayList<>();
        legalEntitiesList.add(le1);
        legalEntitiesList.add(le2);
        legalEntitiesList.add(le3);
        List<Customer> vipList = new ArrayList<>();
        vipList.add(vip1);
        vipList.add(vip2);
        vipList.add(vip3);

        Customer.printInfo(individualsList);
        System.out.println("-----");
        Customer.printInfo(legalEntitiesList);
        System.out.println("-----");
        Customer.printInfo(vipList);
        System.out.println("-----");

    }
}
