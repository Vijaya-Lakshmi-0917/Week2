import java.util.Scanner;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking(){
        guestName=" vijaya lakshmi";
        roomType="Standard";
        nights=2;
    }
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    public HotelBooking(HotelBooking other){
        this.guestName=other.guestName;
        this.roomType=other.roomType;
        this.nights=other.nights;
    }
    public void display(){
        System.out.println("Guest name: "+ guestName);
        System.out.println("Room type: "+ roomType);
        System.out.println("nights: "+ nights);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the guest");
        String guestName= sc.nextLine();
        System.out.println("Enter the room type");
        String roomType= sc.nextLine();
        System.out.println("Enter the number of nights");
        int nights= sc.nextInt();
        HotelBooking hotelBooking1=new HotelBooking();
        HotelBooking hotelBooking2=new HotelBooking(guestName, roomType, nights);
        HotelBooking hotelBooking3=new HotelBooking(hotelBooking2);
        hotelBooking1.display();
        hotelBooking2.display();
        hotelBooking3.display();
    }
}
