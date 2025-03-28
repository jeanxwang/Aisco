package aisco.donation.tfbank;
import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
    PaymentPage payment;
    private List<Object> donationList;
    private String bankAccountNumber;
    private String bankName;

    public DonationImpl() {
        System.out.println("\nDonation via Transfer Bank");
        donationList = new ArrayList<>();
        addDonation();
    }
    
    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod, String bankAccountNumber, String bankName) {
        super(name, email, phone, amount, paymentMethod);
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
        donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(donationList);
    }

    public void addDonation(){
    	donationList.add(new DonationImpl("Harry", "harry@hogwarts.com", "+62822 4571 4677", 1000000, "Transfer Bank", "36726638", "BCA"));
        donationList.add(new DonationImpl("Hermione", "hermione@hogwarts.com", "+62813 3366 1800", 750000, "Transfer Bank", "53688256", "BCA"));
        donationList.add(new DonationImpl("Ron", "ron@hogwarts.com", "+62811 6002 5156", 500000, "Transfer Bank", "SeaBank"));
    }
    
    @Override
    public String toString() {
        return "Donasi oleh " + name + " sebesar " + amount + " melalui transfer bank " + bankName + "\n";
    }

}
