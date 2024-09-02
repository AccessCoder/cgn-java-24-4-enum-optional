package de.neuefische;

public class Main {

    public static void main(String[] args) {
//        Appointment appointment = new Appointment("Birthday Max", WeekDays.SATURDAY);
//        System.out.println(appointment.name() + " on:" + appointment.day().getValue());
//
//        checkDay(appointment.day());

        Service service = new Service();

        System.out.println(service.getArticleNameById("1"));
        System.out.println(service.getArticleNameById("10"));
    }

    public static void checkDay(WeekDays day){
        if (day.isWeekend()){
            System.out.println("Party Hard");
        }else {
            System.out.println("Work hard");
        }
    }


}
